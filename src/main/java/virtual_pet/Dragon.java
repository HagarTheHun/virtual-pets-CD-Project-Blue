package virtual_pet;

public class Dragon extends VirtualPet implements Flyable{
    public Dragon(String name) {
        super(name);
    }

    @Override
    public void fly() {
        int dirtinessBeforeFlight = this.getDirtiness();
        this.tick();
        this.setDirtiness(dirtinessBeforeFlight);
    }
}
