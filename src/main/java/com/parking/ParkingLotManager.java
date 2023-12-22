package com.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotManager {
    public List<ParkingLotAttendant> attendantList;
    public ParkingLotManager() {
        this.attendantList = new ArrayList<>();
    }
    public void addAttendant(ParkingLotAttendant attendant){
        attendantList.add(attendant);
    }

    public boolean parkCarByAttendant(String name,Car car){
        for(ParkingLotAttendant a:attendantList){
            if(a.attendantName.equals(name)){
                return a.findBestParkingAndPark(car);
            }
        }

        return false;
    }

    public boolean unparkCarByAttendant(String name,Car car){
        for(ParkingLotAttendant a:attendantList){
            if(a.attendantName.equals(name)){
                for(ParkingLot p:a.lotList){
                    if(p.getLocation().equals(car.location)){
                        System.out.println("Car "+car.getLicense()+" unparked");
                        return p.unparkCar(car);
                    }
                }
            }
        }
        return false;
    }

    public int getCost(Car car){
        int cost=car.getTime()*60;
        System.out.println("total time parked (in hrs) = "+car.getTime());
        System.out.println("Total cost = "+cost);
        return cost;
    }

    public boolean hasSpace(){
        boolean result=false;
        for(ParkingLotAttendant a:attendantList){
            for(ParkingLot p:a.lotList){
                if(p.isFull()==false)
                System.out.println("parking lot at location : "+p.getLocation()+" attended by: "+a.attendantName+" has space left");
                result= true;

            }
        }
        if(result==false)
        System.out.println("Parking lot is FULL");
        return result;
    }

    public boolean hasSpaceT() {
        for (ParkingLotAttendant a : attendantList) {
            for (ParkingLot p : a.lotList) {
                if (!p.isFull()) {
                    System.out.println("Parking lot at location : " + p.getLocation() + " attended by: " + a.attendantName + " has space left");
                    return true;
                }
            }
        }
        System.out.println("Parking lot is FULL");
        return false;
    }
    
}
