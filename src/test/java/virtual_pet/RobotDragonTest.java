package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RobotDragonTest {
    @Test
    public void canFlyIsTrue() {
        RobotDragon testPet = new RobotDragon("Tim");
        assertTrue(testPet.returnCanFly());
    }
}
