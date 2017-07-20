package com.traveler.plan.service;

import com.traveler.plan.domain.TravelPlan;

/**
 * Created by yuzhou.xu on 7/4/17.
 */
public interface PlanService {

    public TravelPlan getTravelPlanById(Long travelPlanId);

    public void createTravelPlan(TravelPlan planRequest);

}
