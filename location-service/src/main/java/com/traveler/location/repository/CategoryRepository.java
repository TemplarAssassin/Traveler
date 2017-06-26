package com.traveler.location.repository;

import com.traveler.location.domain.Category;
import com.traveler.location.domain.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yuzhou.xu on 6/25/17.
 */

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{

}
