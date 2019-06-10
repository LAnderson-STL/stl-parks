package org.launchcode.stlparks.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Amenity {

    @NotNull
    @Size(min=3, max=100)
    private String name;

    @Id
    @GeneratedValue
    private int id;

    @ManyToMany(mappedBy = "amenities")
    private List<Park> parks;

    public Amenity(String name) {
        this.name = name;
    }

    public Amenity(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

}