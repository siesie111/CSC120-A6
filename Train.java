import java.util.ArrayList;

/**
 * build a class for the Train object
 * @author Sierra
 * @version Feburary 22, 2025
 */
public class Train {

    //attributes
    private Engine engine;
    private ArrayList<Car> cars;

    /**
     * constructor
     * @param fuelType the type of fuel used by the engine
     * @param fuelCapacity the capacity of the fuel in the engine
     * @param nCars the number of cars attached to the train
     * @param passengerCapacity the capacity of passengers onboard
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<>();
        for (int i = 0; i<nCars; i++){
            cars.add(new Car(passengerCapacity));
        }
    }

    /**
     * access the engine of the train
     * @return Engine engine
     */
    public Engine getEngine(){
        return this.engine;
    }

    /**
     * access the cars for the train
     * @return the i-th car of the train
     */
    public Car getCar(int i){
        if (i>=0 && i<cars.size()){
            return cars.get(i);
        }
        else{
            return null;
        }
    }
    
    /**
     * calculate the total capcity of the train by adding all cars
     * @return totalCapacity total capacity of the train
     */
    public int getMaxCapacity(){
        int totalCapacity = 0;
        for (Car car : cars){
            totalCapacity += car.getCapacity();
        }
        return totalCapacity;
    }

    /**
     * calculate the total remaining seats across all cars in the train
     * @return totalRemainSeats the total remaining seats in the train
     */
    public int seatsRemaining(){
        int totalRemainSeats = 0;
        for (Car car:cars){
            totalRemainSeats+=car.seatsRemaining();
        }
        return totalRemainSeats;
    }

    public void printManifest(){
        for (int i = 0; i<cars.size(); i++){
            cars.get(i).printManifest();
        }
    }

}
