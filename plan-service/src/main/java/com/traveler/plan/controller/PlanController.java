package com.traveler.plan.controller;

import com.traveler.plan.domain.TravelPlan;
import com.traveler.plan.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yuzhou.xu on 7/4/17.
 */
@RestController
@RequestMapping("plans")
public class PlanController {

    @Autowired
    private PlanService planService;

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void createTravelPlan(@RequestParam TravelPlan planRequest) {
        planService.createTravelPlan(planRequest);
    }

    @RequestMapping(path = "/update", method = RequestMethod.POST)
    public void updateTravelPlan(@RequestParam TravelPlan planRequest) {

    }

    @RequestMapping(path = "/get/{groupId}", method = RequestMethod.GET)
    public TravelPlan getTravelPlan(@PathVariable Long groupId) {

    }
}
