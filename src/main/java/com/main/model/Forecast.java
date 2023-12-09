package com.main.model;

import java.util.Date;

public class Forecast {

    private Date datetime;
    private int dirwind10m;
    private int tmin;
    private int tmax;
    private int weather;
    private int probarain;
    private int wind10m;
    private int gust10m;

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public int getDirwind10m() {
        return dirwind10m;
    }

    public void setDirwind10m(int dirwind10m) {
        this.dirwind10m = dirwind10m;
    }

    public int getTmin() {
        return tmin;
    }

    public void setTmin(int tmin) {
        this.tmin = tmin;
    }

    public int getTmax() {
        return tmax;
    }

    public void setTmax(int tmax) {
        this.tmax = tmax;
    }

    public int getWeather() {
        return weather;
    }

    public void setWeather(int weather) {
        this.weather = weather;
    }

    public int getProbarain() {
        return probarain;
    }

    public void setProbarain(int probarain) {
        this.probarain = probarain;
    }

    public int getWind10m() {
        return wind10m;
    }

    public void setWind10m(int wind10m) {
        this.wind10m = wind10m;
    }

    public int getGust10m() {
        return gust10m;
    }

    public void setGust10m(int gust10m) {
        this.gust10m = gust10m;
    }

}
