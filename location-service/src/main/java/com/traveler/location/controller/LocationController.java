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
import java.util.Set;

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
        return locationService.findLocationById(id);
    }

    @RequestMapping(path = "name/{name}", method = RequestMethod.GET)
    public List<Location> getLocationByName(@PathVariable String name) {
        return locationService.findLocationByName(name);
    }

    @RequestMapping(path = "category/{category}", method = RequestMethod.GET)
    public List<Location> getLocationByCatecory(@PathVariable String category) {
        return locationService.findLocationByCategory(category);
    }

    @RequestMapping(path = "size/{size}", method = RequestMethod.GET)
    public List<Location> getLocationBySize(@PathVariable String size) {
        return locationService.findLocationBySize(size);
    }

    @RequestMapping(path = "{id}/sublocations", method = RequestMethod.GET)
    public Set<Location> getSubLocations(@PathVariable Long id) {
        return locationService.findSubLocations(id);
    }

}
