package virtual_pet;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        VirtualPetShelter shelter = new VirtualPetShelter("The Haven");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Virtual Pet: Mythical Edition");
        Dragon defaultDragon = new Dragon("Pete");
        shelter.takeIn(defaultDragon);
        RobotDragon defaultRobotDragon = new RobotDragon("Puff");
        shelter.takeIn(defaultRobotDragon);
        Unicorn defaultUnicorn = new Unicorn("Amalthea");
        shelter.takeIn(defaultUnicorn);
        RobotUnicorn defaultRobotUnicorn = new RobotUnicorn("Merlin");
        shelter.takeIn(defaultRobotUnicorn);

        boolean quit = false;


        //Switch case to select species/organic
        do {
            System.out.println(shelter.viewShelterStatus() + "\nMake a selection: \n1. Play with animals\n2. Water organic animals \n3. Feed organic animals\n4. Clean organic animals\n5. Fly Dragons\n6. Charge robots \n7. Perform maintenance on robots \n8. Adopt an animal \n9. Create a new animal \n10. Quit");
            String selection = keyboard.next();
            switch (selection) {
                case "1":
                    shelter.playWithAllPets();
                    System.out.println("Everyone is happier!");
                    break;
                case "11"://play with single animal
                    String tempName;
                    System.out.println("Which one?" + shelter.creatures.keySet());
                    tempName = keyboard.next();
                    
                case "2":
                    shelter.giveWaterTohAllPets();
                    System.out.println("Everyone's thirst has decreased.");
                    break;
                case "3":
                    shelter.feedAllPets();
                    System.out.println("Everyone is less hungry!");
                    break;
                case "4":
                    shelter.cleanAllPets();
                    System.out.println("Everyone is clean!");
                    break;
                case "5":
                    shelter.flyDragons();
                    System.out.println("The dragons went for a fly!");
                    break;
                case "6":
                    shelter.chargeAllRobots();
                    System.out.println("All robots are charged.");
                    break;
                case "7":
                    shelter.maintainAllRobots();
                    System.out.println("All robots have gone through maintenance.");
                    break;
                case "8":
                    System.out.print("Which pet would you like to adopt? Type in their name.");
                    System.out.println(shelter.viewShelterStatus());
                    String petToAdopt = keyboard.next();
                    shelter.adoptPet(petToAdopt);
                    System.out.println("You have adopted " + petToAdopt);
                    break;
                case "9":
                    System.out.println("Select a one of the following:\n1.Unicorn\n2.RobotUnicorn\n3.Dragon\n4.RobotDragon");
                    int species = keyboard.nextInt();
                    switch (species) {
                        case 1:
                            System.out.println("Name your pet");
                            String unicornName = keyboard.next();
                            System.out.println("You named your unicorn " + unicornName);
                            Unicorn orgUnicorn = new Unicorn(unicornName);
                            shelter.takeIn(orgUnicorn);
                            break;
                        case 2:
                            System.out.println("Name your pet");
                            String roboUnicornName = keyboard.next();
                            System.out.println("You named your robot unicorn " + roboUnicornName);
                            RobotUnicorn roboUnicorn = new RobotUnicorn(roboUnicornName);
                            shelter.takeIn(roboUnicorn);
                            break;
                        case 3:
                            System.out.println("Name your pet");
                            String dragonName = keyboard.next();
                            System.out.println("You named your dragon " + dragonName);
                            Dragon orgDragon = new Dragon(dragonName);
                            shelter.takeIn(orgDragon);
                            break;
                        case 4:
                            System.out.println("Name your pet");
                            String roboDragonName = keyboard.next();
                            System.out.println("You named your robot dragon " + roboDragonName);
                            RobotDragon roboDragon = new RobotDragon(roboDragonName);
                            shelter.takeIn(roboDragon);
                            break;
                    }
                    break;
                case "10":
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please make a valid selection");

            }


        } while (!quit);


    }
}