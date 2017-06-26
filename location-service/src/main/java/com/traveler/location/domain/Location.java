package com.traveler.location.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="LOCATION")
public class Location implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @JsonIgnore
    @ManyToMany(
            fetch = FetchType.LAZY
    )
    @JoinTable(name = "location_category", joinColumns = @JoinColumn(name = "location_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id"))
    private Set<Category> categories;

    @Column
    private String size;

    @JsonIgnore
    @Column(name = "PARENT_ID", nullable = true)
    private Long parentId;

    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    @JsonIgnore
    @JoinColumn(name = "PARENT_ID")
    private Set<Location> subLocations;

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

    public Set<Location> getSubLocations() {
        return subLocations;
    }

    public void setSubLocations(Set<Location> subLocations) {
        this.subLocations = subLocations;
    }

    public Size getSize() {
        return Size.parse(this.size);
    }

    public void setSize(Size size) {
        this.size = size.getValue();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
