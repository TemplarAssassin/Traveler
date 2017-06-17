package com.traveler.location.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="LOCATION")
public class Location {

    public enum Category{
        NONE,
        ISLAND,
        NATIONAL_PARK
    }

    public enum Size{
        CONTINENT("CON"),
        COUNTRY("COU"),
        STATE("STA"),
        PROVINCE("PRO"),
        CITY("CIT"),
        NONE("NONE");

        private final String value;

        Size(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static Size parse(String value) {
            Size size = null;
            for(Size s : Size.values()) {
                if(s.getValue().equals(value)) {
                    size = s;
                    return size;
                }
            }

            return Size.NONE;
        }
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "PARENT_ID")
    private Long parentId;

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    @Column
    private Category category;

    @Enumerated(EnumType.STRING)
    @Column
    private String size;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="PARENT_ID", referencedColumnName = "ID")
    private Location parentLocation;

    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "ID", referencedColumnName = "PARENT_ID")
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Size getSize() {
        return Size.parse(this.size);
    }

    public void setSize(Size size) {
        this.size = size.getValue();
    }

    public Location getParentLocation() {
        return parentLocation;
    }

    public void setParentLocation(Location parentLocation) {
        this.parentLocation = parentLocation;
    }
}
