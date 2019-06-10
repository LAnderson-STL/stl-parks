package org.launchcode.stlparks.models.forms;

import org.launchcode.stlparks.models.Amenity;
import org.launchcode.stlparks.models.Park;

public class AddAmenityForm {

    private Park park;

    private Iterable<Amenity> amenities;

    private int amenityId;

    private int parkId;

    public AddAmenityForm(){}

    public AddAmenityForm(Park park, Iterable<Amenity> amenities) {
        this.park = park;
        this.amenities = amenities;
    }

    public Park getPark() {
        return park;
    }

    public void setPark(Park park) {
        this.park = park;
    }

    public Iterable<Amenity> getAmenities() {
        return amenities;
    }

    public void setAmenities(Iterable<Amenity> amenities) {
        this.amenities = amenities;
    }

    public int getAmenityId() {
        return amenityId;
    }

    public void setAmenityId(int amenityId) {
        this.amenityId = amenityId;
    }

    public int getParkId() {
        return parkId;
    }

    public void setParkId(int parkId) {
        this.parkId = parkId;
    }
}
