package racetrack_management.cars;

public class F1 extends Car {

    private String team;
    private String tyres;
    private Boolean hasSteeringWheel;

    public F1(
            String type,
            String model,
            int engineSize,
            int capacity,
            String team,
            String tyres
    ){
        super(type, model, engineSize, capacity);
        this.team = team;
        this.tyres = tyres;
    }

}
