package com.parking;

import java.util.ArrayList;
import java.util.List;

public class Police {
    ParkingLotManager manager;
    public Police(ParkingLotManager manager){
        this.manager=manager;
    }

    public ArrayList<String> whiteCarLoc(){
        ArrayList<String> location=new ArrayList<>();
        List<ParkingLotAttendant> attendantList=manager.attendantList;
        for(ParkingLotAttendant attendant:attendantList){
            List<ParkingLot>lotList=attendant.lotList;
            for(ParkingLot parkingLot:lotList){
                List<Car> cars=parkingLot.getParkedCars();
                for(Car currentCar:cars){
                    if(currentCar.getColor().equals("white")){
                        location.add(currentCar.location);
                    }
                }
            }
        }

        return location;
    }

    public ArrayList<ArrayList<String>> blueToyotaData(){
        ArrayList<ArrayList<String>> data=new ArrayList<>();
        List<ParkingLotAttendant> attendantList=manager.attendantList;
        for(ParkingLotAttendant attendant:attendantList){
            List<ParkingLot>lotList=attendant.lotList;
            for(ParkingLot parkingLot:lotList){
                List<Car> cars=parkingLot.getParkedCars();
                for(Car currentCar:cars){
                    if(currentCar.getColor().equals("blue") && currentCar.getMake().equals("toyota")){
                        ArrayList<String> tmp=new ArrayList<>();
                        tmp.add(currentCar.location);
                        tmp.add(currentCar.getLicense());
                        tmp.add(attendant.attendantName);
                        data.add(tmp);
                    }
                }
            }
        }

        return data;
    }

    public ArrayList<String> getBMWdata() {
         ArrayList<String> bmeData=new ArrayList<>();
        List<ParkingLotAttendant> attendantList=manager.attendantList;
        for(ParkingLotAttendant attendant:attendantList){
            List<ParkingLot>lotList=attendant.lotList;
            for(ParkingLot parkingLot:lotList){
                List<Car> cars=parkingLot.getParkedCars();
                for(Car currentCar:cars){
                    if(currentCar.getMake().equals("bmw")){
                        bmeData.add(currentCar.getLicense());
                    }
                }
            }
        }

        return bmeData;
}

public ArrayList<String> getNumberPlate(){
     ArrayList<String> data=new ArrayList<>();
        List<ParkingLotAttendant> attendantList=manager.attendantList;
        for(ParkingLotAttendant attendant:attendantList){
            List<ParkingLot>lotList=attendant.lotList;
            for(ParkingLot parkingLot:lotList){
                List<Car> cars=parkingLot.getParkedCars();
                for(Car currentCar:cars){
                    data.add(currentCar.getLicense());
                }
            }
        }

        return data;
}


    public ArrayList<String> smallHandicapData(){
        ArrayList<String>data=new ArrayList<>();
         List<ParkingLotAttendant> attendantList=manager.attendantList;
        for(ParkingLotAttendant attendant:attendantList){
            List<ParkingLot>lotList=attendant.lotList;
            for(ParkingLot parkingLot:lotList){
                List<Car> cars=parkingLot.getParkedCars();
                for(Car currentCar:cars){
                    if(currentCar.isHandicap() && currentCar.getSize().equals("small"))
                    data.add(currentCar.getLicense());
                }
            }
        }

        return data;
    }
}
