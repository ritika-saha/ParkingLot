package com.parking;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------ PARKING LOT SYSTEM ------------------------");
        Car car1=new Car("absbs", "blue", "audi", "large", false, 3);
        Car car2 = new Car("xyz123", "red", "toyota", "medium", false, 5);
        Car car3 = new Car("ghi789", "green", "honda", "small", true, 2);
        Car car4 = new Car("abc456", "yellow", "ford", "large", false, 7);
        Car car5 = new Car("def012", "white", "chevrolet", "medium", true, 1);
        Car car6 = new Car("uvw456", "black", "nissan", "small", false, 4);
        Car car7 = new Car("rst789", "blue", "mercedes", "large", true, 8);
        Car car8 = new Car("mno123", "silver", "bmw", "medium", false, 6);
        Car car9 = new Car("jkl456", "gray", "volkswagen", "small", true, 3);
        Car car10 = new Car("pqr789", "orange", "fiat", "large", false, 9);
        Car car11 = new Car("123abc", "purple", "subaru", "medium", true, 10);
        Car car12 = new Car("456def", "brown", "hyundai", "small", false, 15);
        Car car13 = new Car("789ghi", "pink", "kia", "large", true, 12);
        Car car14 = new Car("012jkl", "cyan", "tesla", "medium", false, 18);
        Car car15 = new Car("345mno", "gold", "lexus", "small", true, 14);
        Car car16 = new Car("678pqr", "indigo", "acura", "large", false, 19);
        Car car17 = new Car("901stu", "maroon", "infiniti", "medium", true, 13);
        Car car18 = new Car("234vwx", "turquoise", "jaguar", "small", false, 16);
        Car car19 = new Car("567yza", "lime", "maserati", "large", true, 11);
        Car car20 = new Car("890bcd", "olive", "volvo", "medium", false, 17);

        ParkingLot parkingLot1=new ParkingLot(3, "A");
        ParkingLot parkingLot2=new ParkingLot(2, "B");
        ParkingLot parkingLot3=new ParkingLot(4, "C");
        ParkingLot parkingLot4=new ParkingLot(1, "D");
        ParkingLotAttendant attendant1=new ParkingLotAttendant("John");
        ParkingLotAttendant attendant2=new ParkingLotAttendant("Haily");
        attendant1.addLot(parkingLot1);
        attendant1.addLot(parkingLot4);
        attendant1.addLot(parkingLot2);
        attendant2.addLot(parkingLot3);

        ParkingLotManager manager =new ParkingLotManager();
        manager.addAttendant(attendant1);
        manager.addAttendant(attendant2);
        manager.parkCarByAttendant("Haily", car10);
        manager.parkCarByAttendant("Haily", car9);
        manager.parkCarByAttendant("Haily", car8);
        manager.parkCarByAttendant("Haily", car7);
        manager.parkCarByAttendant("Haily", car6);
        manager.unparkCarByAttendant("Haily", car10);
        manager.parkCarByAttendant("Haily", car6);

        System.out.println("-------------------------");
        manager.parkCarByAttendant("John", car1);
        manager.hasSpace();
        manager.parkCarByAttendant("John", car2);
        manager.hasSpace();
        manager.parkCarByAttendant("John", car3);
        manager.hasSpace();
        manager.parkCarByAttendant("John", car4);
        manager.hasSpace();
        manager.parkCarByAttendant("John", car5);
        manager.hasSpace();
        manager.parkCarByAttendant("John", car11);
        manager.hasSpace();
        manager.parkCarByAttendant("John", car12);
        manager.parkCarByAttendant("John", car13);
        manager.parkCarByAttendant("John", car14);




    }
}