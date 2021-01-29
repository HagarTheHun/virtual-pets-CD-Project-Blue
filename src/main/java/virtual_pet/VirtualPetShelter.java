package virtual_pet;

import java.util.HashMap;

import java.util.Map;

public class VirtualPetShelter {
   private String name;
   Map<String, VirtualPet> creatures = new HashMap<>();

   public VirtualPetShelter(String name){
      this.name = name;
   }

   public void takeIn(VirtualPet pet) {
      creatures.put(pet.getName(), pet);
   }

   public String getNameOfShelter() {
      return name;
   }

   public VirtualPet seePet(String petName){
      return creatures.get(petName);
   }
}

