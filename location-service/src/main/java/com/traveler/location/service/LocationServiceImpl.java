package com.traveler.location.service;

import com.traveler.location.domain.Location;
import com.traveler.location.repository.LocationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Set;


/**
 * Created by yxu0512 on 6/16/17.
 */
@Service
public class LocationServiceImpl implements LocationService{

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private LocationRepository locationRepo;

    @Override
    public Location findLocationById(Long id) {
        Assert.notNull(id, "Location id cannot be null");
        return locationRepo.findById(id);
    }

    @Override
    public List<Location> findLocationByName(String name) {
        Assert.hasLength(name, "Location name cannot be empty");
        return locationRepo.findByName(name);
    }

    public Set<Location> findSubLocation(Long id) {
        Location location = findLocationById(id);

        Set<Location> subLocations = null;

        if(location != null) {
            subLocations = location.getSubLocations();
        }

        return subLocations;
    }
}
