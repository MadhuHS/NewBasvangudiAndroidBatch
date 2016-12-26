package com.example.madhu.mapsdemo;

/**
 * Created by MADHU on 26-12-2016.
 */

public class Place {
    private double lat;
    private double lng;

    Place(double lat,double lng,String name)
    {
        this.lat = lat;
        this.lng = lng;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    private String name;


}