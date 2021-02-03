package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


public class VirtualPetShelterTest {

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

        String expected = shelter.returnPet("Doug").getName();

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

        Collection<VirtualPet> retrievePets = shelter.returnAllPets();

        assertFalse(retrievePets.contains(underTest1));
    }

    @Test
    public void shouldFeedShelter() {
        VirtualPet underTest1 = new VirtualPet("John");
        VirtualPet underTest2 = new VirtualPet("Jane");
        VirtualPetShelter shelter = new VirtualPetShelter("The Haven");

        shelter.takeIn(underTest1);
        shelter.takeIn(underTest2);

        int beforeFed1 = underTest1.getHunger();
        int beforeFed2 = underTest2.getHunger();

        shelter.feedAllPets();

        assertTrue(beforeFed1> underTest1.getHunger());
        assertTrue(beforeFed2> underTest2.getHunger());


    }
    @Test
    public void canPlayWithAllPetsInShelter() {
        VirtualPet underTest1 = new VirtualPet("John");
        VirtualPet underTest2 = new VirtualPet("Jane");
        VirtualPetShelter shelter = new VirtualPetShelter("The Haven");

        shelter.takeIn(underTest1);
        shelter.takeIn(underTest2);

        int beforePlay1 = underTest1.getBoredom();
        int beforePlay2 = underTest2.getBoredom();

        shelter.playWithAllPets();

        assertTrue(beforePlay1 > underTest1.getBoredom());
        assertTrue(beforePlay2 > underTest2.getBoredom());
    }
    @Test
    public void giveWaterToAllPetsInShelter() {
        VirtualPet underTest1 = new VirtualPet("John");
        VirtualPet underTest2 = new VirtualPet("Jane");
        VirtualPetShelter shelter = new VirtualPetShelter("The Haven");

        shelter.takeIn(underTest1);
        shelter.takeIn(underTest2);

        int beforeGivenWater1 = underTest1.getThirst();
        int beforeGivenWater2 = underTest2.getThirst();

        shelter.giveWaterTohAllPets();

        assertTrue(beforeGivenWater1 > underTest1.getThirst());
        assertTrue(beforeGivenWater2 > underTest2.getThirst());


    }

        @Test
    public void canSeeEntireShelter() {
        VirtualPetShelter testShelter = new VirtualPetShelter("The Haven");
        VirtualPet underTest1 = new VirtualPet("John");
        VirtualPet underTest2 = new VirtualPet("Jane");

        testShelter.takeIn(underTest1);
        testShelter.takeIn(underTest2);

        String shelterStatusTable = testShelter.viewShelterStatus();

        assertThat(shelterStatusTable).isEqualTo("| NAME       | HUNGER | THIRST | BOREDOM |\n| John       |   10   |   10   |    10   |\n| Jane       |   10   |   10   |    10   |\n");

    }


   //@Test
       // void adoptOut() {
      //  VirtualPetShelter underTest = new VirtualPetShelter();
      //  VirtualPet
      //  }


}
//TO DO: Play, water, clean for multiple pets
//       Make Organic and Robot extending VirtualPet
//       Make OrganicDragon, OrganicUnicorn, RobotDragon, RobotUnicorn extending Organic or Robot