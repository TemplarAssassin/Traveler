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

    Set<Location> findSubLocation(Long id);


}
