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
        firstPet.setColor(firstPetColor); // TODO: 2/4/2021 make color limited
        System.out.println("You made " + firstPet.getName() + " " + firstPet.getColor());

        VirtualPetShelter home = new VirtualPetShelter("Home");
        home.takeIn(firstPet);

        System.out.println("Would you like to interact with your new pet or visit a Shelter full of creatures?\n1. Interact with my pet\n2. Goto Shelter");
        String playOrShelter = keyboard.next();
        if (playOrShelter.equals("1")) {
            //play with pet
            System.out.println(home.returnAllPets());
            if(firstPet.returnCanFly()) {
                System.out.println("Would you like to: 1. Play   2. Feed\n3. Water  4. Fly");
                switch (keyboard.next()) {
                    case "1":
                        firstPet.play();
                        System.out.println("" + firstPet.getName() + " chases the ball! Good throw!");
                        break;
                    case "2":
                        firstPet.feed();
                        System.out.println("" + firstPet.getName() + " eats the food sloppily! Stand clear.");
                        break;
                    case "3":
                        firstPet.water();
                        System.out.println("" + firstPet.getName() + " drinks daintily. How posh.");
                        break;
                    case "4":
                        firstPet.fly();
                }

            }

        } else if (playOrShelter.equals("2")) {
            //generate shelter with 3 pets
        } else {
            System.out.println("Do you want to interact with your pet or got to a new Shelter?\n1. Interact with my pet\n2. Goto Shelter");
            playOrShelter = keyboard.next();
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
