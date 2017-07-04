package com.traveler.plan.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by yuzhou.xu on 7/2/17.
 */
@Document
public class LocationPlan {

    private Long locationId;
    private String locationName;
    private Date startDate;
    private Date endDate;

    public Long getLocationId() {
        return locationId;
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
