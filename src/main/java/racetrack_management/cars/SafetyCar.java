package racetrack_management.cars;

public class SafetyCar extends Car {

    public SafetyCar(String type, String model, int engineSize, int capacity) {
        super(type, model, engineSize, capacity);
    }

    public String deploySafetyCar(){
        return "Safety car deployed";
    }
}
