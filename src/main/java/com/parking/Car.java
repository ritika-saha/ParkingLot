package com.parking;

public class Car {
    private String license;
    private String color;
    private String make;
    private String size; // Small, Medium, Large
    private boolean isHandicap;
    private int timeParked;
    public String location;

    public Car(String license, String color, String make, String size, boolean isHandicap,int time) {
        this.license = license;
        this.color = color;
        this.make = make;
        this.size = size;
        this.isHandicap = isHandicap;
        this.timeParked=time;
    }

    public String getLicense() {
        return license;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getSize() {
        return size;
    }

    public boolean isHandicap() {
        return isHandicap;
    }

    public int getTime(){
        return timeParked;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + license + '\'' +
                ", color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}