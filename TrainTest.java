/*
 * unit testing for A4
 * @author: Sierra Zhang
 * @version March 5, 2025
 */

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class TrainTest {

    // Engine Tests
    @Test
    /**
     * test the constructor by testing each getter for all three parameters. 
     */
    public void testEngineConstructor() {
        Engine engine = new Engine(FuelType.ELECTRIC, 80.0, 100.0);
        // these should all return true since the methods are set to equal to its parameter inputed in this new engine class
        assertTrue(FuelType.ELECTRIC == engine.getFuelType());
        assertTrue(80.0 == engine.getCurrentFuel());
        assertTrue(100.0 == engine.getMaxFuel());
    }

    @Test
    /**
     * test the go() method
     */
    public void testEngineGo() {
        Engine engine = new Engine(FuelType.ELECTRIC, 80.0,100.0);
        // this should return true since the current level is 80 > 50
        assertTrue(engine.go());

    }

    // Car Tests
    @Test
    /**
     * test the add passenger method with inital passenger 6 and max 10
     */
    public void testCarAddPassenger() {
        ArrayList<Passenger> passengersOnBoard = new ArrayList<>(6);
        Car car = new Car(passengersOnBoard,10);
        Passenger p = new Passenger("Sierra");
        // this should return true since the car is not full yet
        assertTrue(car.addPassenger(p));
    }

    @Test
    /*
     * test remove passenger method
     */
    public void testCarRemovePassenger() {
        ArrayList<Passenger> passengersOnBoard = new ArrayList<>(6);
        Car car = new Car(passengersOnBoard,10);
        Passenger p = new Passenger("Sierra");
        passengersOnBoard.add(p);
        // this should return true since the passenger has been added to the list before testing the remove method
        assertTrue(car.removePassenger(p));
        
    }

    // Passenger Tests
    @Test
    public void testPassengerBoardCarWithSpace() {
        ArrayList<Passenger> passengersOnBoard = new ArrayList<>();
        Car car = new Car(passengersOnBoard,10);
        Passenger p = new Passenger("ice");
        p.boardCar(car);
        // we successfully add one passenger to the car, and the car is not full
        assertEquals(9, car.seatsRemaining());
    }

    @Test
    /**
     * test whether or not the boardCar() works normally when add passenger will exceed the maximum seats. 
     */
    public void testPassengerBoardCarFull() {
        ArrayList<Passenger> passengersOnBoard = new ArrayList<>();
        Car car = new Car(passengersOnBoard,1);
        Passenger p = new Passenger("ice");
        Passenger p1 = new Passenger("cream");
        passengersOnBoard.add(p);
        passengersOnBoard.add(p1);
        p.boardCar(car);
        // the car cannot add p1 since it's already full, so should return false
        assertFalse(car.addPassenger(p1));
    }

    // Train Tests
    @Test
    /**
     * test the constructor setter for the train class
     */
    public void testTrainConstructor() {
        Train train = new Train(FuelType.ELECTRIC, 100.0, 2, 10);
        // total capacity is 2*10 = 20
        assertEquals(20, train.getMaxCapacity());
    }

    @Test
    /**
     * test the seartRemaining method of the train class
     */
    public void testTrainPassengerCount() {
        Train train = new Train(FuelType.ELECTRIC, 100.0, 2, 10);
        Passenger p = new Passenger("lemon");
        train.getCar(0).addPassenger(p);
        // there should be 19 passengers since we remove 1
        assertEquals(19, train.seatsRemaining());
    }

    @Test
    /**
     * test the getCar() of train class
     */
    public void testTrainGetCar() {
        Train train = new Train(FuelType.ELECTRIC, 100.0, 2, 10);
        // this is not null because we have 2 cars
        assertNotNull(train.getCar(0));
        // this is null becayse we only have 2 cars
        assertNull(train.getCar(3));
    }

    @Test
    /**
     * test PrintManifest() by checking if the correct message is printed to the debug console
     */
    public void testTrainPrintManifest() {
        Train train = new Train(FuelType.ELECTRIC, 100.0, 2, 10);
        Passenger passenger = new Passenger("orange");
        train.getCar(0).addPassenger(passenger);
        // we can check if the manifest is printed to the debug console
        train.printManifest();
    }
    
}
