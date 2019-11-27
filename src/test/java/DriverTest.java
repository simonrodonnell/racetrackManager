import org.junit.Before;
import racetrack_management.cars.Car;
import racetrack_management.people.Driver;

public class DriverTest {

    Driver driver;
    Car car;

    @Before
    public void before(){
        car = new Car("Formula 1", "F1", 2000, 1);
        driver = new Driver("Estevan", "Formula 1 Driver", car);
    }

}
