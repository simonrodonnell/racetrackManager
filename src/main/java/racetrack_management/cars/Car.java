package racetrack_management.cars;

public abstract class Car {

    private String type;
    private String model;
    private int engineSize;
    private int capacity;
    private int fuel;
    private Boolean needsRepair;

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

    public String drive(){
        if(this.fuel > 0) {
        return "This "+ type +" is driving.";
        }
        else {
            return "This "+ type +" is out of fuel.";
        }
    }

    public String park() {
        return "This "+ type +" is parked.";
    }

    public void refuel(){
        this.fuel = 100;
    }

    public void setNeedsRepair(Boolean newState){
        this.needsRepair = newState;
    }
}
