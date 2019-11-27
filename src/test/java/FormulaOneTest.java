import org.junit.Before;
import org.junit.Test;
import racetrack_management.cars.FormulaOne;
import racetrack_management.cars.Tyres;

import static org.junit.Assert.assertEquals;

public class FormulaOneTest {

    FormulaOne formulaOne;

    @Before
    public void before(){
        formulaOne = new FormulaOne("Formula 1", "F1", 2000, 1, "Ferrari");
    }

    @Test
    public void hasTeam(){
        assertEquals("Ferrari", formulaOne.getTeam());
    }

    @Test
    public void hasTyres(){
        assertEquals(Tyres.MEDIUM, formulaOne.getTyres());
    }

    @Test
    public void hasSteeringWheel(){
        assertEquals(true, formulaOne.getHasSteeringWheel());
    }

    @Test
    public void hasType() {
        assertEquals("Formula 1", formulaOne.getType());
    }

    @Test
    public void hasModel() {
        assertEquals("F1", formulaOne.getModel());
    }

    @Test
    public void hasEngineSize() {
        assertEquals(2000, formulaOne.getEngineSize());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, formulaOne.getCapacity());
    }

    @Test
    public void hasFuel() {
        assertEquals(100, formulaOne.getFuel());
    }

    @Test
    public void canChangeTyres() {
        formulaOne.changeTyres(Tyres.WET);
        assertEquals(Tyres.WET, formulaOne.getTyres());
    }

    @Test
    public void canReduceFuel(){
        formulaOne.reduceFuel(145);
        assertEquals(80, formulaOne.getFuel());
    }

    @Test
    public void canReduceTyreIntegrity(){
        formulaOne.tyreDegredation(135);
        assertEquals(75,formulaOne.getTyreIntegrity());
    }
}
