package virtual_pet;

public class RobotDragon extends Robot implements Flyable {
    public RobotDragon(String name) {
        super(name);
    }

    public void fly(){
        this.tick();
        this.tick();
    }
}
