package racetrack_management.people;

public abstract class People {

    private String name;
    private String job;

    public People(String name, String job){
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
