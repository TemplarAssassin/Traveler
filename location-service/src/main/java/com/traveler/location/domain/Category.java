package com.traveler.location.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by yuzhou.xu on 6/18/17.
 */
@Entity
@Table(name = "CATEGORY")
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column
    private Long id;

    @Column(nullable =  false)
    private String name;

    @ManyToMany(
            fetch = FetchType.LAZY,
            mappedBy = "categories"
    )
    List<Location> locations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
