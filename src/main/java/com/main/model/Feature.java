package com.main.model;

public class Feature {
    private Geometry geometry;

    public String toString() {
        return geometry.toString();
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
