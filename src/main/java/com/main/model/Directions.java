package com.main.model;

public enum Directions {

    NORD(0, "nord"),
    NORD_OUEST(1, "nord ouest"),
    OUEST(2, "ouest"),
    SUD_OUEST(3, "sud ouest"),
    SUD(4, "sud"),
    SUD_EST(5, "sud est"),
    EST(6, "est"),
    NORD_EST(7, "nord est");

    private final int value;

    public int getValue() {
        return value;
    }

    private final String desc;

    public String getDesc() {
        return desc;
    }

    Directions(int val, String _desc) {
        value = val;
        desc = _desc;
    }

}
