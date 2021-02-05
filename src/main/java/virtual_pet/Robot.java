package virtual_pet;

public class Robot extends VirtualPet {
    private int battery = 100;
    private int maintenanceLevel = 100;
    private int boredom = 10;


    public Robot(String name) {
        super(name);
    }

    public int getBatteryLevel() {
        return battery;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public void chargeRobot() {
        battery = battery +25;
        if (battery>100) {
            battery=100;
        }
    }
    @Override
    public void tick(){
        battery = battery - 5;
        maintenanceLevel=maintenanceLevel-5;
        boredom= boredom + 10;
        }
    public void performMaintenance(){
        maintenanceLevel = 100;
    }
    @Override
    public String returnPetStatus(){
        this.tick();
        return String.format("| %-10s |  %3s   |  %3s   |   %3d   |   %3d   |   %3d  |  %3s   |", this.getName(), "N/A", "N/A", this.getBoredom(), this.getBatteryLevel(), this.getMaintenanceLevel(), "N/A");
    }
    @Override
    public void play() {
        boredom = boredom - 25;
        if (boredom<0){
            boredom=0;
        }
        battery = battery - 5;
        maintenanceLevel=maintenanceLevel-5;
    }

    @Override //But it already had a getBoredom?? and they are the same!!!
    public int getBoredom(){
        return boredom;
    }


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
-Maintenance

     */

