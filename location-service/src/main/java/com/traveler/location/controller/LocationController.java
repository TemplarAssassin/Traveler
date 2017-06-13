package com.traveler.location.controller;

import com.traveler.location.domain.Location;
import com.traveler.location.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yxu0512 on 6/12/17.
 */
@RestController
@RequestMapping("locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Location getLocation(@PathVariable long id) {
        Location zhejiang = new Location();
        zhejiang.setId(1l);
        zhejiang.setName("Zhejiang");

        Location hangzhou = new Location();
        hangzhou.setId(2l);
        hangzhou.setName("Hangzhou");

        List<Location> sublocations = new ArrayList<>();
        sublocations.add(hangzhou);

        zhejiang.setSubLocations(sublocations);

        return zhejiang;
    }
}
