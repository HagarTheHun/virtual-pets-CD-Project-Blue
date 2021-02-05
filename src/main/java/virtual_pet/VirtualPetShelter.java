package virtual_pet;

import java.util.Collection;
import java.util.HashMap;

import java.util.Map;
import java.util.function.BiConsumer;

public class VirtualPetShelter {
   private String name;
   Map<String, VirtualPet> creatures = new HashMap<>();

   public VirtualPetShelter(String name) { //Constructor
      this.name = name;
   }


   public String getNameOfShelter() {  // Name getter
      return name;
   }

   public VirtualPet returnPet(String petName) {  //Single VirtualPet getter
      return creatures.get(petName);
   }

   public void takeIn(VirtualPet pet) { //Puts VirtualPet into Shelter
      creatures.put(pet.getName(), pet);
   }

   public void adoptPet(String petName) {
      creatures.remove(petName);
   }

   public Collection<VirtualPet> returnAllPets() {
      return creatures.values();
   }

   public String viewShelterStatus() {
      String header = "| NAME       | HUNGER | THIRST | BOREDOM | BATTERY | MAINT. |  DIRT  |\n";
      String tableOfPets = header;
      for (VirtualPet toAddToTable : creatures.values()) {
         tableOfPets = tableOfPets + toAddToTable.returnPetStatus() + "\n";
      }
      return tableOfPets;
   }

   public void feedAllPets() {
      for (VirtualPet petToFeed : creatures.values()) {
         petToFeed.feed();
      } // need to iterate through map for shelter
   }

   public void playWithAllPets() {
      for (VirtualPet petToPlayWith : creatures.values()) {
         petToPlayWith.play();
      }
   }

   public void giveWaterTohAllPets() {
      for (VirtualPet petToGiveWater : creatures.values()) {
         petToGiveWater.water();
      }
   }

   public void cleanAllPets() {
      for (VirtualPet petToClean : creatures.values()) {
         petToClean.clean();
      }
   }

   public void flyDragons() {
      for (VirtualPet petToFly : creatures.values()) {
         if (petToFly instanceof Dragon) {
            ((Dragon) petToFly).fly();
         } else if (petToFly instanceof RobotDragon) {
            ((RobotDragon) petToFly).fly();
         }
      }
   }
   public void chargeAllRobots(){
      for (VirtualPet petToCharge: creatures.values()) {
         if (petToCharge instanceof RobotDragon){
            ((RobotDragon) petToCharge).chargeRobot();}
         else if (petToCharge instanceof RobotUnicorn){
            ((RobotUnicorn) petToCharge).chargeRobot();}
         }
      }
      public void maintainAllRobots(){
      for (VirtualPet petToMaintain: creatures.values()) {
         if (petToMaintain instanceof RobotDragon){
            ((RobotDragon) petToMaintain).performMaintenance();}
         else if (petToMaintain instanceof RobotUnicorn){
            ((RobotUnicorn) petToMaintain).performMaintenance();}
      }}
   }





