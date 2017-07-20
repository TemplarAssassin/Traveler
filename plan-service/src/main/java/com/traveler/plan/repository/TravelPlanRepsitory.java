package com.traveler.plan.repository;

import com.traveler.plan.domain.TravelPlan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yuzhou.xu on 7/8/17.
 */
@Repository
public interface TravelPlanRepsitory extends MongoRepository<TravelPlan, Long>{
}
