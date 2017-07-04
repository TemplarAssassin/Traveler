package com.traveler.plan.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;
import java.util.List;

/**
 * Created by yuzhou.xu on 7/2/17.
 */
@Document( collection = "travelPlan")
public class TravelPlan {

    @Id
    private Long planId;

    private Long groupId;

    private List<LocationPlan> locationPlans;

    private Date startDate;

    private Date endDate;

    public Long getPlanId() {
        return planId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public List<LocationPlan> getLocationPlans() {
        return locationPlans;
    }

    public void setLocationPlans(List<LocationPlan> locationPlans) {
        this.locationPlans = locationPlans;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
