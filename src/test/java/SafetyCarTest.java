import org.junit.Before;
import org.junit.Test;
import racetrack_management.cars.SafetyCar;

import static org.junit.Assert.assertEquals;

public class SafetyCarTest {

    SafetyCar safetyCar;

    @Before
    public void before(){
        safetyCar = new SafetyCar("SafetyCar", "Mazda", 300, 4);
    }

    @Test
    public void canBeDeployed(){
        assertEquals("Safety car deployed", safetyCar.deploySafetyCar());
    }
}
