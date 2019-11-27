package racetrack_management.cars;

import racetrack_management.behaviours.IDrive;

public class FormulaOne extends Car implements IDrive {

    private String team;
    private Tyres tyres;
    private Boolean hasSteeringWheel;


    public FormulaOne(
            String type,
            String model,
            int engineSize,
            int capacity,
            String team
    ){
        super(type, model, engineSize, capacity);
        this.team = team;
        this.tyres = Tyres.MEDIUM;
        this.hasSteeringWheel = true;

    }

    public String getTeam() {
        return team;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public Boolean getHasSteeringWheel() {
        return hasSteeringWheel;
    }

    public void changeTyres(Tyres newTyre){
        this.tyres = newTyre;
    }


    public String drive(){
        if(super.fuel > 0) {
        return "This "+ getType() +" is driving.";
        }
        else {
            return "This "+ getType() +" is out of fuel.";
        }
    }

    public String park() {
        return "This "+ getType() +" is parked.";
    }

    public void refuel(){
        super.fuel = 100;
    }

    public void reduceFuel(int averageSpeed) {
        if(averageSpeed > 130){
            this.fuel -= 20;
        }
        else {
            this.fuel -= 10;
        }
    }

//
//    public void tyreDegredation(int averageSpeed) {
//        if(averageSpeed < 120){
//            this.tyreIntegrity -= 15;
//        }
//        this.tyreIntegrity -= 25;
//    }
}
