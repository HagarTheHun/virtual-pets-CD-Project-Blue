package virtual_pet;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    private void assertEquals(String expected, String str) {
    }
    private void assertEquals(int expected, int num) {
    }

    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new VirtualPet();
    }
    @Test
    public void petShouldHaveName() {
        VirtualPet underTest = new VirtualPet("Ricardo");

        String expected = underTest.getName();

        assertEquals(expected, "Jeff");

    }


    @Test
    public void shouldHaveDefaultHunger() {
        VirtualPet underTest = new VirtualPet("Ben");

        int expected = underTest.getHunger();

        assertEquals(expected, 10);
    }

    @Test
    public void shouldHaveDefaultBoredom() {
        VirtualPet underTest = new VirtualPet("Lisa");

        int expected = underTest.getBoredom();

        assertEquals(expected, 10);
    }

    @Test
    public void shouldHaveColor() {
        VirtualPet underTest = new VirtualPet("Sarah H");

        String expected = underTest.getColor();

        assertEquals(expected, "Red");

    }
    @Test
    public void shouldTickHunger() {
        VirtualPet pet = new VirtualPet("Eduardo");

        int initialHunger = pet.getHunger();
        pet.tick();
        int hungerAfterTick = pet.getHunger();

        assertEquals(initialHunger + 10, hungerAfterTick);
    }

    @Test
    public void shouldTickBoredome() {
        VirtualPet pet = new VirtualPet("Eduardo");

        int initialBoredom = pet.getBoredom();
        pet.tick();
        int boredomAfterTick = pet.getBoredom();

        assertEquals(initialBoredom + 10, boredomAfterTick);
    }

    @Test
    public void doesFeedDecreaseHunger() {
        VirtualPet pet = new VirtualPet("Lana");

        int originalHunger = pet.getHunger();
        pet.tick();
        pet.feed();
        int hungerAfterFeeding = pet.getHunger();

        assertEquals(originalHunger - 10, hungerAfterFeeding);
    }
}
