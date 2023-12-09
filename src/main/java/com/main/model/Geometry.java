package com.main.model;

import java.util.ArrayList;

public class Geometry {
    private ArrayList<Float> coordinates = new ArrayList<Float>();

    public ArrayList<Float> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Float> coordinates) {
        this.coordinates = coordinates;
    }

    public String toString() {
        return coordinates.toString();
    }

}
