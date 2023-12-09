package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.main.model.City;
import com.main.model.Directions;
import com.main.model.EtalabAPI;
import com.main.model.Feature;
import com.main.model.Forecast;
import com.main.model.MeteoResponse;
import com.main.model.Weather;
import com.main.model.WindDirection;

@Controller
public class MeteoController {

        private String token = "?token=381869ca30e7a87e69d7beda85d993dd91e646c204ec72f2c268a4b93ca426cc";

        @Autowired
        RestTemplate rt;

        @PostMapping("/meteo")
        public String GetMeteo(@RequestBody String address, Model model) {

                address = address.replace("address=", "");

                // The replace is not necessary, the white space are automatically replace with
                // '+'
                String query = address.toLowerCase().replace(" ", "+");

                EtalabAPI api = rt.getForObject("https://api-adresse.data.gouv.fr/search/?q=" + query + "&limit=1",
                                EtalabAPI.class);

                Feature feature = api.features.get(0);

                Float longitude = feature.getGeometry().getCoordinates().get(0);

                Float latitude = feature.getGeometry().getCoordinates().get(1);

                String meteo_url = "https://api.meteo-concept.com/api/forecast/daily/0" + token + "&latlng=" + latitude
                                + ","
                                + longitude;

                HttpEntity<MeteoResponse> request = new HttpEntity<>(new MeteoResponse());
                ResponseEntity<MeteoResponse> http_response = rt.exchange(meteo_url, HttpMethod.GET, request,
                                MeteoResponse.class);

                MeteoResponse response = http_response.getBody();

                City city = response.getCity();

                Forecast forecast = response.getForecast();

                Directions wind_dir = new WindDirection(forecast.getDirwind10m()).getWind_direction();

                String weather = Weather.GetDescriptionByValue(forecast.getWeather());

                int wind_speed = forecast.getWind10m();

                int temp_min = forecast.getTmin();

                int temp_max = forecast.getTmax();

                System.out.println(address);

                address = address.replace('+', ' ');
                address = address.replace("%C3%A9", "émvn ");
                address = address.replace("%27", "'");

                System.out.println(address);

                model.addAttribute("address", address);
                model.addAttribute("city", city.getName());
                model.addAttribute("weather", weather);
                model.addAttribute("tmin", temp_min);
                model.addAttribute("tmax", temp_max);
                model.addAttribute("windspeed", wind_speed);
                model.addAttribute("wind_dir", wind_dir.getDesc());

                return "meteo";
        }
}
