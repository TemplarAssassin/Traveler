package com.traveler.location.domain;

/**
 * Created by yuzhou.xu on 6/18/17.
 */
public enum Size {
    CONTINENT("CONTINENT"),
    COUNTRY("COUNTRY"),
    STATE("STATE"),
    PROVINCE("PROVINCE"),
    CITY("CITY"),
    UNKNOWN("UNKNOWN");

    private final String value;

    Size(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Size parse(String value) {
        Size size = null;
        for (Size s : Size.values()) {
            if (s.getValue().equals(value.toUpperCase())) {
                size = s;
                return size;
            }
        }

        return Size.UNKNOWN;
    }
}
