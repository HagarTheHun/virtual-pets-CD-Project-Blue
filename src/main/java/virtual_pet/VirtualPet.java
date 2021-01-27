package virtual_pet;

public class VirtualPet {
    private String name;
    private int hunger;
    private int happiness;

    public VirtualPet () {

    } //????? Should I have done this

    public VirtualPet (String name) {
        this.name = name;
        hunger = 10;
        happiness = 10;
    }
    public String getName() {
        return name;
    }
    public int getHunger() {
        return hunger;
    }
    public int getHappiness() {
        return happiness;
    }

}


