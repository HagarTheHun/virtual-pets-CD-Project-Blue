package virtual_pet;

import java.util.Scanner;





public class VirtualPet {
    private String name;
    private int hunger;
    private int boredom;
    private String color;
    private int thirst;




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

    public String returnPetStatus() {
        return String.format("| %-10s |  %3d   |  %3d   |   %3d   |", this.getName(), this.getHunger(), this.getThirst(), this.getBoredom());
    }
}


