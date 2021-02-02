package virtual_pet;

import java.util.Collection;
import java.util.HashMap;

import java.util.Map;
import java.util.function.BiConsumer;

public class VirtualPetShelter {
   private String name;
   Map<String, VirtualPet> creatures = new HashMap<>();

   public VirtualPetShelter(String name){ //Constructor
      this.name = name;
   }

   public void takeIn(VirtualPet pet) { //Puts VirtualPet into Shelter
      creatures.put(pet.getName(), pet);
   }

   public String getNameOfShelter() {  // Name getter
      return name;
   }

   public VirtualPet returnPet(String petName){  //Single VirtualPet getter
      return creatures.get(petName);
   }

   public void adoptPet(String petName) {
      creatures.remove(petName);
   }

   public Collection<VirtualPet> returnAllPets() {
      return creatures.values();
   }
   public String viewShelterStatus() {
     String header = "| NAME       | HUNGER | THIRST | BOREDOM |\n";
     String tableOfPets = header;
      for (VirtualPet toAddToTable : creatures.values()) {
         tableOfPets = tableOfPets + toAddToTable.returnPetStatus() + "\n";
      }
      return tableOfPets;
   }

   public void feedAllPets(){ // broken
     for (VirtualPet petToFeed : creatures.values()) {
        petToFeed.feed();} // need to iterate through map for shelter
     }

   }




