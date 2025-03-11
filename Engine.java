/**
 * build a class for the Engine object
 * @author Sierra Zhang
 * @version Feburary 18, 2025
 */
public class Engine {

    // attributes
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /**
     * constructor
     * @param FuelType f the fuel type used for this engine
     * @param double currentFuelLevel the current fuel level for this engine
     * @param double maxFuelLevel the maximum fuel level for this engine
     */
    public Engine(FuelType f, double currentFuelLevel, double maxFuelLevel){
        this.f = f;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }

    /**
     * constructor generated for Train class
     * @param fuelType
     * @param fuelCapacity
     */
    public Engine(FuelType fuelType, double fuelCapacity) {
    }

    /**
     * access the fuel type for this engine
     * @return FuelType f
     */
    public FuelType getFuelType(){
        return this.f;
    }

    /**
     * access the current fuel level for this engine
     * @return double currentFuelLevel
     */
    public double getCurrentFuel(){
        return this.currentFuelLevel;
    }

    /**
     * access the maximum fuel level
     * @return double maxFuelType
     */
    public double getMaxFuel(){
        return this.maxFuelLevel;
    }

    /**
     * refuel the engine to the maximum fuel level
     */
    public void refuel(){
        if (getCurrentFuel() == getMaxFuel()){
            System.out.println("This engine does not need to refuel.");
        }
        else{
            this.currentFuelLevel = this.maxFuelLevel;
            System.out.println("This engine is refueled.");
        }
    }
    
    /**
     * determine if the fuel level is good enough for the engine to go
     * @return true or false, meaning go or not go
     */
    public boolean go(){
        if (getCurrentFuel() > 50){
            System.out.println("The remaining fuel level is:"+this.currentFuelLevel);
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * print the attributes of the created Engine object
     * @return the printed statement of the object
     */
    public String toString(){
        return("This engine has fuel type: "+this.f+"This engine has current fuel level: "+this.currentFuelLevel+"This engine has maximum fuel level: "+this.maxFuelLevel);
    }

    public static void main(String [] args){
        Engine myEngine = new Engine(FuelType.ELECTRIC, 0.0, 100.0);
        System.out.println(myEngine);
    }
}