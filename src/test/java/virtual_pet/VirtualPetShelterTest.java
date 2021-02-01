package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;


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
        shelter.adoptPet(underTest1.getName());

        Collection<VirtualPet> retrievePets = shelter.retrieveAllPets();

        assertFalse(retrievePets.contains(underTest1));
    }

    @Test
    public void shouldFeedShelter(){
        VirtualPet underTest1 = new VirtualPet("John");
        VirtualPet underTest2 = new VirtualPet("Jane");
        VirtualPetShelter shelter = new VirtualPetShelter("The Haven");

        int beforeFed1 = underTest1.getHunger();
        int beforeFed2 = underTest2.getHunger();

        shelter.feedShelter();

        assertTrue(beforeFed1> underTest1.getHunger());
        assertTrue(beforeFed2> underTest2.getHunger());

    @Test
        void adoptOut() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet
        }

    }
}
//TO DO: Feed, play, water, clean for multiple pets
//       Display table with all pets and their attributes