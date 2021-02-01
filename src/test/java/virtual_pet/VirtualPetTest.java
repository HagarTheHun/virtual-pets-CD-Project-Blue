package virtual_pet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    //private void assertEquals(String expected, String str) {

    //private void assertEquals(int expected, int num) {



    @Test
    public void petShouldHaveName() {
        VirtualPet underTest = new VirtualPet("Ricardo");

        String expected = underTest.getName();

        assertEquals(expected, "Ricardo");

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
    public void shouldHaveDefaultThirst() {
        VirtualPet underTest = new VirtualPet("Michelle");

        int expected = underTest.getThirst();

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
    public void shouldTickBoredom() {
        VirtualPet pet = new VirtualPet("Eduardo");

        int initialBoredom = pet.getBoredom();
        pet.tick();
        int boredomAfterTick = pet.getBoredom();

        assertEquals(initialBoredom + 10, boredomAfterTick);
    }

    @Test
    public void shouldTickThirst(){
        VirtualPet pet = new VirtualPet("Weiwei");

        int initialThirst = pet.getThirst();
        pet.tick();
        int thirstAfterTick = pet.getThirst();

        assertEquals(initialThirst+10, thirstAfterTick);
    }

    @Test
    public void doesFeedDecreaseHunger() {
        VirtualPet pet = new VirtualPet("Lana");

        int originalHunger = pet.getHunger();
        pet.tick();
        pet.feed();
        int hungerAfterFeeding = pet.getHunger();

        assertEquals(originalHunger, hungerAfterFeeding);
    }

    @Test
    public void doesPlayDecreaseBoredom(){
        VirtualPet pet = new VirtualPet("Jelanie");

        int originalBoredom = pet.getBoredom();
        pet.tick();
        pet.play();
        int boredomAfterPlaying = pet.getBoredom();

        assertEquals(originalBoredom, boredomAfterPlaying);
    }

    @Test
    public void hungerOverZero(){
        VirtualPet pet = new VirtualPet("Connor");

        pet.feed();
        pet.feed();
        int hungerAfterFeeding = pet.getHunger();

        assertEquals(0, hungerAfterFeeding);
    }

    @Test
    public void boredomOverZero(){
        VirtualPet pet = new VirtualPet("Cliff");

        pet.play();
        pet.play();
        int boredomAfterPlaying = pet.getBoredom();

        assertEquals(0, boredomAfterPlaying);
    }

    @Test
    public void thirstOverZero(){
        VirtualPet pet = new VirtualPet("Fathi");

        pet.water();
        pet.water();
        int thirstAfterWatering = pet.getThirst();
    }

}

/* Support for 4 types of pets: Organic Cats, Organic Dogs, Robotic Cats, Robotic Dogs.
Robots require oil and maintenance.
Organic cats and dogs require cage & litter box cleaning.
Allow users to take dogs on walks.
Walking organic pets decreases the rate at which they soil their cages/litter boxes.
Walking robotic pets increases their need for oil and maintenance. */

//have two classes for organic and robotic
//robotic class will inherit virtual pet but will change food to oil and instead of clean- maintenance!

