package racetrack_management.people;

import racetrack_management.cars.Car;

public class Driver extends People {

    private Car car;

    public Driver(String name, String job, Car car){
        super(name, job);
        this.car = car;
    }

    public void setCar(Car newCar){
        this.car = newCar;
    }
}
