package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    @Test
    public void shouldHaveDefaultCharge() {
        Robot underTest = new Robot("Ben");

        int expected = underTest.getCharge();

        assertEquals(expected, 100);
    }
    @Test
    public void shouldHaveDefaultMaintenanceLevel() {
        Robot underTest = new Robot("Ben");

        int expected = underTest.getMaintenanceLevel();

        assertEquals(expected, 100);
    }
    @Test
    public void chargeCanNotBeNegative(){
        Robot underTest = new Robot("Connor");

      //  underTest.ch();
        pet.feed();

        int hungerAfterFeeding = pet.getHunger();

        assertEquals(0, hungerAfterFeeding);
    }

}