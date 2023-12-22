import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.parking.*;


public class ParkingLotTest {
    
        Car car1=new Car("absbs", "blue", "audi", "large", false, 3);
        Car car2 = new Car("xyz123", "red", "toyota", "medium", false, 5);
        Car car3 = new Car("ghi789", "green", "honda", "small", true, 2);
        Car car4 = new Car("abc456", "yellow", "ford", "large", false, 7);
        Car car5 = new Car("def012", "white", "chevrolet", "medium", true, 1);
        Car car6 = new Car("uvw456", "black", "nissan", "small", false, 4);
        Car car7 = new Car("rst789", "blue", "mercedes", "large", true, 8);
        Car car8 = new Car("mno123", "silver", "bmw", "medium", false, 6);
        Car car9 = new Car("jkl456", "gray", "volkswagen", "small", true, 3);
        ParkingLot parkingLot1=new ParkingLot(3, "A");
        ParkingLot parkingLot2=new ParkingLot(2, "B");
        ParkingLot parkingLot4=new ParkingLot(2, "D");
        ParkingLotAttendant attendant1=new ParkingLotAttendant("John");
        ParkingLotAttendant attendant2=new ParkingLotAttendant("Jane");
        ParkingLotManager manager;

        public void init() {
            manager = new ParkingLotManager();
            attendant1.addLot(parkingLot1);
            attendant1.addLot(parkingLot2);
            attendant2.addLot(parkingLot4);  
            manager.addAttendant(attendant1);
            manager.addAttendant(attendant2);
        }
        

        @Test
        public void testParkCar(){
            init();
            boolean isAdded=manager.parkCarByAttendant("John", car1);
            assertTrue(isAdded);
        }

        @Test
        public void testFullCapacityForParticularAttendant(){
            init();
            boolean isAdded=manager.parkCarByAttendant("Jane", car1);
            isAdded=manager.parkCarByAttendant("Jane", car2);
            isAdded=manager.parkCarByAttendant("Jane", car3);
            assertFalse(isAdded);
        }

        @Test
        public void testFullCapacityForAll(){
             init();
            manager.parkCarByAttendant("John", car1);
            manager.parkCarByAttendant("John", car2);
            manager.parkCarByAttendant("John", car3);
            manager.parkCarByAttendant("John", car4);
            manager.parkCarByAttendant("John", car5);
            manager.parkCarByAttendant("Jane", car6);
            manager.parkCarByAttendant("Jane", car7);
            boolean isFull=manager.hasSpaceT();
            assertEquals(false, isFull);
        }

        @Test
        public void testRevenue(){
            init();
            int expectedCost=60*3;
            int calculatedCost=manager.getCost(car1);
            assertEquals(expectedCost, calculatedCost);

        }

        @Test
        public void testUnpark(){
            init();
            manager.parkCarByAttendant("John", car1);
            manager.parkCarByAttendant("John", car2);
            boolean isUnparked=manager.unparkCarByAttendant("John", car1);
            assertTrue(isUnparked);
        }

        @Test
        public void testHandicap(){
             init();
            manager.parkCarByAttendant("John", car3);
            manager.parkCarByAttendant("John", car1);
            manager.parkCarByAttendant("John", car2);
            
            String location=car3.location;
            assertEquals(location, "A");
        }

        @Test
        public void testLargeCar(){
             init();
            manager.parkCarByAttendant("John", car3);
           // manager.parkCarByAttendant("John", car2);
            manager.parkCarByAttendant("John", car1);
            
            String location=car1.location;
            assertEquals( "B",location);
        }

        
        
}
