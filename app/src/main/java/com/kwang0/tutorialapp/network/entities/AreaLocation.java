package com.kwang0.tutorialapp.network.entities;

public class AreaLocation {
    public String city;
    public String area;
    public String prefecture;

    @Override
    public String toString() {
        return "AreaLocation{" +
                "prefecture='" + prefecture + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}