package virtual_pet;

import java.util.Scanner;





public class VirtualPet {
    private String name;
    private int hunger;
    private int boredom;
    private String color;
    private int thirst;



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
        thirst = 10;
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
    public int getThirst() { return thirst;}
    public String getColor() {
        return color;
    }

    public void tick() {
        hunger = hunger + 10;
        boredom = boredom + 10;
        thirst = thirst + 10;
    }

    public void feed(){
        hunger = hunger - 10;
        if (hunger<0){
            hunger =0;
        }
    }

    public void play(){
        boredom = boredom - 10;
        if (boredom<0){
            boredom=0;
        }
    }

    public void water(){
        thirst = thirst - 10;
        if (thirst<0){
            thirst=0;
        }
    }
}


