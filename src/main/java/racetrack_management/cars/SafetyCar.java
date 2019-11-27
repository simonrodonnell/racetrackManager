package racetrack_management.cars;

public class SafetyCar extends Car implements IDrive {

    public SafetyCar(String type, String model, int engineSize, int capacity) {
        super(type, model, engineSize, capacity);
    }

    public String deploySafetyCar(){
        return "Safety car deployed";
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
        if(averageSpeed > 13){
            this.fuel -= 20;
        }
        else {
            this.fuel -= 10;
        }
    }
}
