package com.traveler.location.service;


import com.traveler.location.domain.Location;

import java.util.List;
import java.util.Set;

/**
 * Created by yxu0512 on 6/12/17.
 */
public interface LocationService {

    Location findLocationById(Long id);

    List<Location> findLocationByName(String name);

    List<Location> findLocationBySize(String size);

    Set<Location> findSubLocations(Long id);

    List<Location> findLocationByCategory(Long categoryId);

}
