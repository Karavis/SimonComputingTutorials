package com.simoncomputing.app.helloworld.domain;

public class Address {

    private Integer id;
    private String street;
    private String city;
    private String state;
    private String zip;
    
    public Address() {}
    public Address(Integer id, String street, String city, String state, String zip) {
        super();
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return String.format(
                "Address [street=%s, city=%s, state=%s, zip=%s]",
                street,
                city,
                state,
                zip
                );
    }
    
    public Boolean fieldsEqualTo(Address other) {
        if (this.id == other.id &&
                this.street == other.street &&
                this.city == other.city &&
                this.state == other.state &&
                this.zip == other.zip) {
            return true;
        }
        return false;
    }
    
    public Boolean isNull() {
        if (this.street == null &&
                this.city == null &&
                this.state == null &&
                this.zip == null) {
            return true;
        }
        return false;
    }
    
    //Setters, Getters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
}
