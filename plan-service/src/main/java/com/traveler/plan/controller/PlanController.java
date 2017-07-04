package com.traveler.plan.controller;

import com.traveler.plan.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuzhou.xu on 7/4/17.
 */
@RestController
@RequestMapping("plans")
public class PlanController {

    @Autowired
    private PlanService planService;


}
