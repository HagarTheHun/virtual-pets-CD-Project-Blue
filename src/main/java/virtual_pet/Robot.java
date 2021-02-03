package virtual_pet;

public class Robot extends VirtualPet {
 private int charge = 100;
    private int maintenanceLevel = 100;


    public Robot(String name) {
        super(name);
    }

    public int getCharge() {
        return charge;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }
    /* Deliverables
Support for 4 types of pets: Organic Cats, Organic Dogs, Robotic Cats, Robotic Dogs.
Robots require oil and maintenance.
Organic cats and dogs require cage & litter box cleaning.
Allow users to take dogs on walks.
Walking organic pets decreases the rate at which they soil their cages/litter boxes.
Walking robotic pets increases their need for oil and maintenance.

Organic Dragons
Robot Dragons
Organic Unicorns
Robot Unicorn

Robots traits
-Charge
-Maintence

     */
}
