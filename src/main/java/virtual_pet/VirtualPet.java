package virtual_pet;

import java.util.Scanner;

public class VirtualPet {
    private String name;
    private int hunger;
    private int boredom;
    private String color;



    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "Welcome to Virtual Pet: Mythical Edition \n Name your first pet!");
        VirtualPet firstPet = new VirtualPet(keyboard.next());
        System.out.println("You named it " + firstPet.getName());
    }
    public VirtualPet () {

    } //????? Should I have done this

    public VirtualPet (String name) {
        this.name = name;
        hunger = 10;
        boredom = 10;
        color = "Red";
    }
    public String getName() {
        return name;
    }
    public int getHunger() {
        return hunger;
    }
    public int getBoredom() {
        return boredom;
    }
    public String getColor() {
        return color;
    }

    public void tick() {
        //hunger = hunger + 10;
    }
}


