package racetrack_management.people;

import racetrack_management.cars.Car;

public class Mechanic extends People {

    public Mechanic(String name, String job){
        super(name, job);
    }

    public String repairCar(Car car){
        car.setNeedsRepair(false);
        return "Car has been fixed.";
    }

}
