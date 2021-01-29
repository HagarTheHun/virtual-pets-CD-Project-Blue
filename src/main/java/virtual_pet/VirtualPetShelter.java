package virtual_pet;

import java.util.HashMap;

import java.util.Map;

public class VirtualPetShelter {
   private String name;

   public VirtualPetShelter(String name){
      Map<String, VirtualPet> creatures = new HashMap<String, VirtualPet>();
      VirtualPet auto1 = new VirtualPet("Otto");
      this.name = name;
      creatures.put(auto1.getName(), auto1);


   }   // Map<String,String,Integer,Integer,Integer> creatures = new HashMap<String,String,Integer,Integer,Integer>();

   public String getName() {
      return name;
   }
}

