package com.main.model;

public class WindDirection {

    Directions wind_direction;

    public WindDirection(int angle) {
        if (angle > 337.5 && angle < 22.5) {
            wind_direction = Directions.NORD;
        } else if (angle > 22.5 && angle < 67.5) {
            wind_direction = Directions.NORD_EST;
        } else if (angle > 67.5 && angle < 112.5) {
            wind_direction = Directions.EST;
        } else if (angle > 112.5 && angle < 157.5) {
            wind_direction = Directions.SUD_EST;
        } else if (angle > 157.5 && angle < 202.5) {
            wind_direction = Directions.SUD;
        } else if (angle > 202.5 && angle < 247.5) {
            wind_direction = Directions.SUD_OUEST;
        } else if (angle > 247.5 && angle < 292.5) {
            wind_direction = Directions.OUEST;
        } else if (angle > 292.5 && angle < 337.5) {
            wind_direction = Directions.NORD_OUEST;
        }
    }

    public Directions getWind_direction() {
        return wind_direction;
    }

}
