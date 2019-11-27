import org.junit.Before;
import org.junit.Test;
import racetrack_management.cars.FormulaOne;
import racetrack_management.people.Driver;

import static org.junit.Assert.assertEquals;

public class DriverTest {

    Driver driver;
    FormulaOne car;

    @Before
    public void before(){
        car = new FormulaOne("Formula 1", "Formula 1", 2000, 1, "Ferrari");
        driver = new Driver("Estevan", "Formula 1 Driver", car);
    }

    @Test
    public void hasCar(){
        assertEquals("Formula 1", driver.getCar().getModel());
    }

    @Test
    public void canSetCar(){
        FormulaOne newCar = new FormulaOne("Formula 1", "Mazda", 2000, 1, "Ferrari");
        driver.setCar(newCar);
        assertEquals("Mazda", driver.getCar().getModel());
    }

    @Test
    public void hasName(){
        assertEquals("Estevan", driver.getName());
    }

    @Test
    public void hasJob(){
        assertEquals("Formula 1 Driver", driver.getJob());
    }

}
