package virtual_pet;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Virtual Pet: Mythical Edition \n Name your first pet!");
        String petName = keyboard.next();
        System.out.println("You named it " + petName);

    //Switch case to select species/organic

        System.out.println("Select a one of the following:\n1.Unicorn\n2.RobotUnicorn\n3.Dragon\n4.RobotDragon");
        boolean petMade = false;
        VirtualPet firstPet = new VirtualPet(petName);
        String firstPetKind = "";
        while (!petMade) {
            int species = keyboard.nextInt();
            switch (species) {
                case 1:
                    firstPet = new Unicorn(petName);
                    petMade = true;
                    firstPetKind = "Unicorn";
                    break;
                case 3:
                    firstPet = new Dragon(petName);
                    firstPetKind = "Dragon";
                    petMade = true;
                    break;
                case 2:
                    firstPet = new RobotUnicorn(petName);
                    firstPetKind = "RobotUnicorn";
                    petMade = true;
                    break;
                case 4:
                    firstPet = new RobotDragon(petName);
                    firstPetKind = "RobotDragon";
                    petMade = true;
                    break;
                default:
                    System.out.println("Please type either Unicorn, RobotUnicorn, Dragon, or RobotDragon");
            }
        }
        System.out.println("You made " + firstPet.getName() +" into a " + firstPetKind + "!");
        System.out.println("Hey, what color do you want " + firstPet.getName() + " to be?\nRed\nOrange\nYellow\nGreen\nBlue\nIndigo\nViolet");
        String firstPetColor = keyboard.next();
        firstPet.setColor(firstPetColor);
        System.out.println("You made " + firstPet.getName() + " " + firstPet.getColor());
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
