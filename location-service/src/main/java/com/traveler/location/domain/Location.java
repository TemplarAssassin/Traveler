package com.traveler.location.domain;

import java.util.List;

/**
 * Created by yxu0512 on 6/12/17.
 */
public class Location {

    Long id;

    String name;

    List<Location> subLocations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Location> getSubLocations() {
        return subLocations;
    }

    public void setSubLocations(List<Location> subLocations) {
        this.subLocations = subLocations;
    }
}
