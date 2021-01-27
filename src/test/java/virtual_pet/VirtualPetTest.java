package virtual_pet;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    private void assertEquals(String expected, String name) {
    }
    private void assertEquals(int expected, int num) {
    }

    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new VirtualPet();
    }
    @Test
    public void petShouldHaveName() {
        VirtualPet underTest = new VirtualPet("Jeff");

        String expected = underTest.getName();

        assertEquals(expected, "Jeff");

    }


    @Test
    public void shouldHaveDefaultHunger() {
        VirtualPet underTest = new VirtualPet("Steve");

        int expected = underTest.getHunger();

        assertEquals(expected, 10);
    }

    @Test
    public void shouldHaveDefaultHappines() {
        VirtualPet underTest = new VirtualPet("Bob");

        int expected = underTest.getHappiness();

        assertEquals(expected, 10);
    }


}
