/**
 * build a class for the Passenger object
 * @author Sierra Zhang
 * @version Feburary 22, 2025
 */
public class Passenger {
    
    //attribute
    private String name;

    /**
     * constructor
     * @param name of the passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * accessor for the name attribute
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * board the car and add passenger
     * @param c the car object
     */
    public void boardCar(Car c){
        if (c.addPassenger(this)){
            System.out.println("Board the car and add the passenger.");
        }
        else{
            System.out.println("The car is full, no need to board the car.");
        }
    }

    /**
     * let passengers get off the car
     * @param c the car object
     */
    public void getOffCar(Car c){
        if (c.removePassenger(this)){
            System.out.println("There is a passenger that needs to get off the car.");
        }
        else{
            System.out.println("There is no passenger that needs to get off the car, you can keep going.");
        }
    }

}
