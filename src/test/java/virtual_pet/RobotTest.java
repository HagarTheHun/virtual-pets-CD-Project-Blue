package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    @Test
    public void shouldHaveDefaultBatteryLevel() {
        Robot underTest = new Robot("Ben");

        int expected = underTest.getBatteryLevel();

        assertEquals(expected, 50);
    }
    @Test
    public void shouldHaveDefaultMaintenanceLevel() {
        Robot underTest = new Robot("Ben");

        int expected = underTest.getMaintenanceLevel();

        assertEquals(expected, 100);
    }
    @Test
    public void doesTickDecreaseBatteryLevel(){
        Robot underTest = new Robot("Ben");
        int batteryLevelBeforeTick = underTest.getBatteryLevel();
        underTest.tick();
        int batteryLevelAfterTick = underTest.getBatteryLevel();
        assertTrue(batteryLevelBeforeTick>batteryLevelAfterTick);

    }
    @Test
    public void doesTickDecreaseMaintenanceLevel(){
        Robot underTest = new Robot("Ben");
        int maintenanceLevelBeforeTick = underTest.getMaintenanceLevel();
        underTest.tick();
        int maintenanceLevelAfterTick = underTest.getMaintenanceLevel();
        assertTrue(maintenanceLevelBeforeTick>maintenanceLevelAfterTick);
    }
   @Test
     public void doesChargePowerRobot(){
        Robot underTest = new Robot("Connor");

        underTest.chargeRobot();

        int batteryLevelAfterCharging = underTest.getBatteryLevel();

        assertEquals(75, batteryLevelAfterCharging);
    }
    @Test
     public void doesPerformMaintenanceIncreaseMaintenanceLevel(){
        Robot underTest = new Robot("Finn");
        underTest.tick();
        int maintenanceLevelBeforePerformingMaintenance = underTest.getMaintenanceLevel();
        underTest.performMaintenance();
        int maintenanceLevelAfterPerformingMaintenance = underTest.getMaintenanceLevel();
        assertTrue(maintenanceLevelAfterPerformingMaintenance>maintenanceLevelBeforePerformingMaintenance);


    }
}