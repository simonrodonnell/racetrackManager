package racetrack_management.cars;

public abstract class Car {

    private String type;
    private String model;
    private int engineSize;
    private int capacity;
    protected int fuel;
    private Boolean needsRepair;
    private int tyreIntegrity;

    public Car(
            String type,
            String model,
            int engineSize,
            int capacity
    ){
        this.type = type;
        this.model = model;
        this.engineSize = engineSize;
        this.capacity = capacity;
        this.fuel = 100;
        this.needsRepair = false;
        this.tyreIntegrity = 100;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFuel() {
        return fuel;
    }

    public Boolean getNeedsRepair() {
        return needsRepair;
    }
//
//    public String drive(){
//        if(this.fuel > 0) {
//        return "This "+ type +" is driving.";
//        }
//        else {
//            return "This "+ type +" is out of fuel.";
//        }
//    }
//
//    public String park() {
//        return "This "+ type +" is parked.";
//    }
//
//    public void refuel(){
//        this.fuel = 100;
//    }

    public void setNeedsRepair(Boolean newState){
        this.needsRepair = newState;
    }

    public abstract void reduceFuel(int averageSpeed);



    public int getTyreIntegrity() {
        return tyreIntegrity;
    }

    public void tyreDegredation(int averageSpeed) {
        if(averageSpeed < 120){
            this.tyreIntegrity -= 15;
        }
        this.tyreIntegrity -= 25;
    }
}
