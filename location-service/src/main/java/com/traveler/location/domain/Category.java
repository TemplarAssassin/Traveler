package com.traveler.location.domain;

/**
 * Created by yuzhou.xu on 6/18/17.
 */
public enum Category {
    UNKNOWN("NONE"),
    ISLAND("ISLAND"),
    NATIONAL_PARK("NATIONAL PARK");

    private final String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Category parse(String value) {
        Category category = null;
        for (Category c : Category.values()) {
            if (c.getValue().equals(value.toUpperCase())) {
                category = c;
                return category;
            }
        }

        return Category.UNKNOWN;
    }
}
