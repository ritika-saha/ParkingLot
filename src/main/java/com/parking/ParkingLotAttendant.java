package com.parking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ParkingLotAttendant {
    public List<ParkingLot> lotList;
    String attendantName;
    public ParkingLotAttendant(String name){
        this.attendantName=name;
         this.lotList = new ArrayList<>();
    }

    public void addLot(ParkingLot lot){
        this.lotList.add(lot);
        System.out.println("parking lot added to attendant "+attendantName);
    }

    public boolean findBestParkingAndPark(Car car) {
        boolean isParked = false;
        String location="";
        if (car.isHandicap()) {
            Collections.sort(this.lotList, Comparator.comparing(ParkingLot::getLocation));
            //isParked = this.lotList.get(0).parkCar(car);
            for(int i=0;i<this.lotList.size();i++){
                if(lotList.get(i).isFull()==false){
                    isParked = this.lotList.get(i).parkCar(car);
                    location=this.lotList.get(i).getLocation();
                    break;
                }
            }
            if(isParked)
            System.out.println("Car parked at nearest location: "+location);
        } else if(isParked==false) {
            if (car.getSize().equals("large")) {
                Collections.sort(this.lotList, Comparator.comparing(ParkingLot::getCapacity));
                //isParked = this.lotList.get(lotList.size() - 1).parkCar(car);
                for(int i=lotList.size()-1;i>=0;i--){
                    if(lotList.get(i).isFull()==false){
                        isParked = this.lotList.get(i).parkCar(car);
                        location=this.lotList.get(i).getLocation();
                        break;
                    }
                }
            }
            else{
                for(int i=0;i<lotList.size();i++){
                    if(lotList.get(i).isFull()==false){
                        isParked = this.lotList.get(i).parkCar(car);
                        location=this.lotList.get(i).getLocation();
                        break;
                    }
                }
            }
            if(isParked)
            System.out.println("Car parked at location: "+location);
        }
    
        if (isParked) {
            
        } else {
            System.out.println("No available parking for car with location: " );
        }
    
        return isParked;
    }


    public boolean unParkCar(Car car){
        for(ParkingLot lot:lotList){
            if(lot.getLocation().equals(car.location)){
                return lot.unparkCar(car);
            }
        }

        return false;
    }
    
    

    

}
