package racetrack_management.race;

import racetrack_management.cars.Car;

public class Race {

    private String location;
    private String type;
    private int laps;
    private int totalLaps;
    private int averageSpeed;
    private String surfaceType;
    private String weather;


    public Race (
            String location,
            String type,
            int laps,
            int averageSpeed,
            String surfaceType,
            String weather
    ){
        this.location = location;
        this.type = type;
        this.laps = laps;
        this.totalLaps = 0;
        this.averageSpeed = averageSpeed;
        this.surfaceType = surfaceType;
        this.weather = weather;

    }

    public String startRace(){
        return "Race Started!!!";
    }

    public void lapCompleted(Car car){
        this.totalLaps ++;
         car.reduceFuel(averageSpeed);
         car.tyreDegredation(averageSpeed);
         if(totalLaps == 21){
//             this.raceCompleted();
         }
    }
}
