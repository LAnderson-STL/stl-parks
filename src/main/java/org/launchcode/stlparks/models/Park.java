package org.launchcode.stlparks.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


@Entity
public class Park {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=100)
    private String name;

    @NotNull
    @Size(min=3, max=100)
    private String neighborhood;

    @NotNull
    @Size(min=3, max=100)
    private String streetAddress;

    @NotNull
    @Size(min=3, max=100)
    private String city;


    private int zip;

    @ManyToMany(mappedBy = "parks")
    private List<Amenity> amenities;

    //constructors

    public Park(){}

    public Park(String name, String neighborhood, String streetAddress, String city, int zip) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.streetAddress = streetAddress;
        this.city = city;
        this.zip = zip;
    }

    public void addAmenity(Amenity amenity) {amenities.add(amenity);}

    //getters and setters


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public List<Amenity> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<Amenity> amenities) {
        this.amenities = amenities;
    }
}
