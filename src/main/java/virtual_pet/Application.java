package virtual_pet;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Virtual Pet: Mythical Edition \n Name your first pet!");
        VirtualPet firstPet = new VirtualPet(keyboard.next());
        System.out.println("You named it " + firstPet.getName());

    //Switch case to select species/organic

        System.out.println("Select a Unicorn, RobotUnicorn, Dragon, or RobotDragon");
        String species = keyboard.next();
        switch (species){
            case "Unicorn":
                Unicorn pet = new Unicorn(firstPet.getName());
            case "Dragon":
                Dragon pet = new Dragon(firstPet.getName());
            case "RobotUnicorn":
                RobotUnicorn pet = new RobotUnicorn(firstPet.getName());
            case "RobotDragon":
                RobotDragon pet = new RobotDragon(firstPet.getName());
            default:
                System.out.println("Please type either Unicorn, RobotUnicorn, Dragon, or RobotDragon");
        }
    //select color
    //make help option

   // public void shelterTable() {
           // System.out.println();


       // }

// make a table
        //Generate Shelter, Virtual pet shelter
        //can make first pet, or go to the shelter
        //creature.put()
        //DO you want to adopt or create a pet
    }

}
