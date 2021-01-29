package virtual_pet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;



public class VirtualPetShelterTest {
    /*@Test
    public void hasConstructor() {
        VirtualPetShelter shelter = new VirtualPetShelter("Goodie's Good Boys");



    }*/

    @Test
    public void hasShelterName() {
        VirtualPetShelter shelter = new VirtualPetShelter("Goodie's Good Boys");

        String expected = shelter.getNameOfShelter();

        assertEquals(expected, "Goodie's Good Boys");
    }

    @Test
    public void putPetInShelter(){
        VirtualPet underTest = new VirtualPet("Doug");
        VirtualPetShelter shelter = new VirtualPetShelter("Good Shelter");
        shelter.takeIn(underTest);

        String expected = shelter.seePet("Doug").getName();

        assertEquals("Doug", expected);
    }

    @Test
    public void takePetOutOfShelter(){
        VirtualPet underTest1 = new VirtualPet("John");
        VirtualPet underTest2 = new VirtualPet("Jane");
        VirtualPetShelter shelter = new VirtualPetShelter("The Haven");
        shelter.takeIn(underTest1);
        shelter.takeIn(underTest2);
        shelter.adoptPet(underTest1);

        boolean isFalse = false;

        assertFalse();
    }
}
