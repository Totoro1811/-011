package com.itgl.Pojo;

public class Address {
    String city;
    String pro;

    public Address(String city, String pro) {
        this.city = city;
        this.pro = pro;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pro='" + pro + '\'' +
                '}';
    }
}
