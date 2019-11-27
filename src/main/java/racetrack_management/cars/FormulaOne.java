package racetrack_management.cars;

public class FormulaOne extends Car {

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
}
