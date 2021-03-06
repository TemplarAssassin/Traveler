package com.traveler.location.service;

import com.traveler.location.domain.Category;
import com.traveler.location.domain.Location;
import com.traveler.location.domain.Size;
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

    @Override
    public List<Location> findLocationByCategory(String category) {
        Assert.hasLength(category, "Location category cannot be empty");

        Category c = Category.parse(category);
        Assert.isTrue(!Category.UNKNOWN.equals(c), "Unknown location category");
        return locationRepo.findByCategory(category);
    }

    @Override
    public List<Location> findLocationBySize(String size) {
        Assert.hasLength(size, "Location size cannot be empty");

        Size s = Size.parse(size);
        Assert.isTrue(!Size.UNKNOWN.equals(s), "Unknown location size");
        return locationRepo.findBySize(size);
    }

    @Override
    public Set<Location> findSubLocations(Long id) {
        Assert.notNull(id, "Location id cannot be null");

        Location location = findLocationById(id);

        Set<Location> subLocations = null;

        if(location != null) {
            subLocations = location.getSubLocations();
        }

        return subLocations;
    }
}
