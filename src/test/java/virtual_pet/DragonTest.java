package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DragonTest {

    @Test
    public void canFlyIsTrue() {
        Dragon testPet = new Dragon("Tim");
        assertTrue(testPet.returnCanFly());
    }

    public void effectsOfFly(){
        Dragon underTest = new Dragon("Marceline");
        int dirtinessBeforeFlight = underTest.getDirtiness();
        int hungerBeforeFlight = underTest.getHunger();

        underTest.fly();

        int dirtinessAfterFlight = underTest.getDirtiness();
        int hungerAfterFlight = underTest.getHunger();

        assertEquals(dirtinessAfterFlight, dirtinessBeforeFlight);
        assertTrue(hungerAfterFlight>hungerBeforeFlight);

    }
}
