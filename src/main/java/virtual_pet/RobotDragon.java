package virtual_pet;

public class RobotDragon extends Robot implements Flyable {
    public RobotDragon(String name) {
        super(name);
    }
    protected boolean canFly = true;

    public void fly(){
        this.tick();
        this.tick();
        this.play();
    }

    @Override
    public boolean returnCanFly() {
        return canFly;
    }
}
