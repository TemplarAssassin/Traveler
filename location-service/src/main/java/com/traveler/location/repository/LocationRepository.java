package com.traveler.location.repository;

import com.traveler.location.domain.Location;
import com.traveler.location.domain.Category;
import com.traveler.location.domain.Size;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yxu0512 on 6/16/17.
 */
@Repository
public interface LocationRepository extends CrudRepository<Location, Long>{

    /**
     * Get a list of potential locations given a location name
     */
    List<Location> findByName(String name);

    /**
     * Return all locations having the same size
     */
    List<Location> findBySize(String size);

}
