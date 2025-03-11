import java.util.ArrayList;

/**
 * build a class for the Car object
 * @author Sierra Zhang
 * @version Feburary 22, 2025
 */
public class Car {

    //attributes
    private ArrayList<Passenger> passengersOnboard = new ArrayList<>();
    private int maxCapacity;

    /**
     * constructor
     * @param ArrayList<Passenger> the array list that stores all the passengers on board
     * @param int the maximum capacity of a car;
     */
    public Car(ArrayList<Passenger> passengersOnboard, int maxCapacity){
        this.passengersOnboard = passengersOnboard;
        this.maxCapacity = maxCapacity;
    }

    /**
     * constructor generated for Train class
     * @param passengerCapacity
     */
    public Car(int passengerCapacity) {
        this.passengersOnboard = new ArrayList<>();
        this.maxCapacity = passengerCapacity;
    }

    /**
     * access the remaining seats of the car
     * @return remainSeats remaining seats in the car
     */
    public int seatsRemaining(){
        int remainSeats = 0;
        remainSeats = maxCapacity - passengersOnboard.size();
        return remainSeats;
    }

    /**
     * access the capacity of the car
     * @return int maxCapacity 
     */
    public int getCapacity(){
        return this.maxCapacity;
    }

    /**
     * add passenger to the car
     * @return true or false if we add the passenger
     */
    public boolean addPassenger(Passenger p){
        if (passengersOnboard.size()<maxCapacity){
            passengersOnboard.add(p);
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * remove passenger from the car
     * @return true or false if we remove the passenger
     */
    public boolean removePassenger(Passenger p){
        if (passengersOnboard.contains(p)) {
            passengersOnboard.remove(p);
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * print out details about all passengers in list
     */
    public void printManifest(){
        if (passengersOnboard.size() == 0){
            System.out.println("This car is empty.");
        }
        else{
            for (int i = 0; i<passengersOnboard.size(); i++){
                System.out.println(passengersOnboard.get(i));
            }
        }
    }

}