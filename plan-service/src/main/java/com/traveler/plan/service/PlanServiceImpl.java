package com.traveler.plan.service;

import com.traveler.plan.domain.TravelPlan;
import com.traveler.plan.repository.TravelPlanRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yuzhou.xu on 7/7/17.
 */
@Service
public class PlanServiceImpl implements  PlanService {

    @Autowired
    private TravelPlanRepsitory travelPlanRepo;

    public TravelPlan getTravelPlanById(Long travelPlanId) {
        return travelPlanRepo.findOne(travelPlanId);
    }

    public void createTravelPlan(TravelPlan planRequest) {
        if(planRequest.getGroupId() == null) {

        }
        travelPlanRepo.save(planRequest);
    }
}
