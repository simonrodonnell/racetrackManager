import org.junit.Before;
import org.junit.Test;
import racetrack_management.cars.FormulaOne;
import racetrack_management.people.Mechanic;

import static org.junit.Assert.assertEquals;

public class MechanicTest {

    Mechanic mechanic;
    FormulaOne car;

    @Before
    public void before(){
        mechanic = new Mechanic("Rusty", "Mechanic");
        car = new FormulaOne("Formula 1", "Mazda", 2000, 1, "Ferrari");
    }

    @Test
    public void canFixCar(){
        car.setNeedsRepair(true);
        String result = mechanic.repairCar(car);
        assertEquals("Car has been fixed.", result);
        assertEquals(false, car.getNeedsRepair());
    }
}
