package virtual_pet;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Virtual Pet: Mythical Edition \n Name your first pet!");
        VirtualPet firstPet = new VirtualPet(keyboard.next());
        System.out.println("You named it " + firstPet.getName());

        //Generate Shelter, Virtual pet shelter
        //can make first pet, or go to the shelter
        //creature.put()
        //DO you want to adopt or create a pet
    }
}
