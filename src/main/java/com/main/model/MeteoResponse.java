package com.main.model;

public class MeteoResponse {
    private City city;
    private Forecast forecast;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }
    
}
