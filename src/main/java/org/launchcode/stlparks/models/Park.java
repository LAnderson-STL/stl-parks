package org.launchcode.stlparks.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Park {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=100)
    private String name;


    @Size(min=3, max=200)
    private String streetAddress;

    private String city;

    @Size(min=5, max=10)
    private int zip;

    private boolean bikeTrail;
    private boolean walkingTrail;
    private boolean playground;
    private boolean sprayPool;
    private boolean pavilion;
    private boolean monument;
    private boolean lake;
    private boolean statue;
    private boolean fountain;
    private boolean garden;
    private boolean archery;
    private boolean rugbyField;
    private boolean footballField;
    private boolean basketballCourt;
    private boolean tennisCourt;
    private boolean baseballField;
    private boolean soccerField;
    private boolean softballField;
    private boolean handballCourt;
    private boolean horseshoeCourt;
    private boolean volleyballCourt;
    private boolean multiPurposeField;
    private boolean recreationCenter;
    private boolean boathouse;
    private boolean skatingRink;
    private boolean veloDrome;

    //constructors

    public Park(){}

    public Park(int id, String name, String streetAddress, String city, int zip) {
        this.id = id;
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.zip = zip;
        this.bikeTrail = false;
        this.walkingTrail = false;
        this.playground = false;
        this.sprayPool = false;
        this.pavilion = false;
        this.monument = false;
        this.lake = false;
        this.statue = false;
        this.fountain = false;
        this.garden = false;
        this.archery = false;
        this.rugbyField = false;
        this.footballField = false;
        this.basketballCourt = false;
        this.tennisCourt = false;
        this.baseballField = false;
        this.soccerField = false;
        this.softballField = false;
        this.handballCourt = false;
        this.horseshoeCourt = false;
        this.volleyballCourt = false;
        this.multiPurposeField = false;
        this.recreationCenter = false;
        this.boathouse = false;
        this.skatingRink = false;
        this.veloDrome = false;
    }

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

    public boolean isBikeTrail() {
        return bikeTrail;
    }

    public void setBikeTrail(boolean bikeTrail) {
        this.bikeTrail = bikeTrail;
    }

    public boolean isWalkingTrail() {
        return walkingTrail;
    }

    public void setWalkingTrail(boolean walkingTrail) {
        this.walkingTrail = walkingTrail;
    }

    public boolean isPlayground() {
        return playground;
    }

    public void setPlayground(boolean playground) {
        this.playground = playground;
    }

    public boolean isSprayPool() {
        return sprayPool;
    }

    public void setSprayPool(boolean sprayPool) {
        this.sprayPool = sprayPool;
    }

    public boolean isPavilion() {
        return pavilion;
    }

    public void setPavilion(boolean pavilion) {
        this.pavilion = pavilion;
    }

    public boolean isMonument() {
        return monument;
    }

    public void setMonument(boolean monument) {
        this.monument = monument;
    }

    public boolean isLake() {
        return lake;
    }

    public void setLake(boolean lake) {
        this.lake = lake;
    }

    public boolean isStatue() {
        return statue;
    }

    public void setStatue(boolean statue) {
        this.statue = statue;
    }

    public boolean isFountain() {
        return fountain;
    }

    public void setFountain(boolean fountain) {
        this.fountain = fountain;
    }

    public boolean isGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public boolean isArchery() {
        return archery;
    }

    public void setArchery(boolean archery) {
        this.archery = archery;
    }

    public boolean isRugbyField() {
        return rugbyField;
    }

    public void setRugbyField(boolean rugbyField) {
        this.rugbyField = rugbyField;
    }

    public boolean isFootballField() {
        return footballField;
    }

    public void setFootballField(boolean footballField) {
        this.footballField = footballField;
    }

    public boolean isBasketballCourt() {
        return basketballCourt;
    }

    public void setBasketballCourt(boolean basketballCourt) {
        this.basketballCourt = basketballCourt;
    }

    public boolean isTennisCourt() {
        return tennisCourt;
    }

    public void setTennisCourt(boolean tennisCourt) {
        this.tennisCourt = tennisCourt;
    }

    public boolean isBaseballField() {
        return baseballField;
    }

    public void setBaseballField(boolean baseballField) {
        this.baseballField = baseballField;
    }

    public boolean isSoccerField() {
        return soccerField;
    }

    public void setSoccerField(boolean soccerField) {
        this.soccerField = soccerField;
    }

    public boolean isSoftballField() {
        return softballField;
    }

    public void setSoftballField(boolean softballField) {
        this.softballField = softballField;
    }

    public boolean isHandballCourt() {
        return handballCourt;
    }

    public void setHandballCourt(boolean handballCourt) {
        this.handballCourt = handballCourt;
    }

    public boolean isHorseshoeCourt() {
        return horseshoeCourt;
    }

    public void setHorseshoeCourt(boolean horseshoeCourt) {
        this.horseshoeCourt = horseshoeCourt;
    }

    public boolean isVolleyballCourt() {
        return volleyballCourt;
    }

    public void setVolleyballCourt(boolean volleyballCourt) {
        this.volleyballCourt = volleyballCourt;
    }

    public boolean isMultiPurposeField() {
        return multiPurposeField;
    }

    public void setMultiPurposeField(boolean multiPurposeField) {
        this.multiPurposeField = multiPurposeField;
    }

    public boolean isRecreationCenter() {
        return recreationCenter;
    }

    public void setRecreationCenter(boolean recreationCenter) {
        this.recreationCenter = recreationCenter;
    }

    public boolean isBoathouse() {
        return boathouse;
    }

    public void setBoathouse(boolean boathouse) {
        this.boathouse = boathouse;
    }

    public boolean isSkatingRink() {
        return skatingRink;
    }

    public void setSkatingRink(boolean skatingRink) {
        this.skatingRink = skatingRink;
    }

    public boolean isVeloDrome() {
        return veloDrome;
    }

    public void setVeloDrome(boolean veloDrome) {
        this.veloDrome = veloDrome;
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
