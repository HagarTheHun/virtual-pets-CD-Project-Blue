package virtual_pet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetShelterTest {
    /*@Test
    public void hasConstructor() {
        VirtualPetShelter shelter = new VirtualPetShelter("Goodie's Good Boys");



    }*/

    @Test
    public void hasShelterName() {
        VirtualPetShelter shelter = new VirtualPetShelter("Goodie's Good Boys");

        String expected = shelter.getName();

        assertEquals(expected, "Goodie's Good Boys");
    }
}
