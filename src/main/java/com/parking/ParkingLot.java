package com.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Car> parkedCars;
    private int capacity;
    private String location;

    public ParkingLot(int capacity, String location) {
        this.capacity = capacity;
        this.location = location;
        this.parkedCars = new ArrayList<>();
    }

    public boolean parkCar(Car car) {
        if (capacity>0) {
            parkedCars.add(car);
            car.location=this.location;
            capacity--;
            return true;
        } 
            return false; // Parking lot is full
        
    }

    public boolean unparkCar(Car car) {
        capacity++;
        parkedCars.remove(car);
        return true;
    }

    public boolean isFull() {
        return capacity<=0;
    }

    public List<Car> getParkedCars() {
        return parkedCars;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity(){
        return capacity;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "capacity=" + capacity +
                ", location='" + location + '\'' +
                ", parkedCars=" + parkedCars +
                '}';
    }
}
