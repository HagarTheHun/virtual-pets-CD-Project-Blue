package virtual_pet;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetTest {

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
    public void shouldHaveDefaultDirtiness(){
        VirtualPet underTest = new VirtualPet("Jake");
        int expected = underTest.getDirtiness();
        assertEquals(expected, 0);
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
    public void shouldTickDirtiness(){
        VirtualPet pet = new VirtualPet("BMO");

        int initialDirtiness = pet.getDirtiness();
        pet.tick();
        int dirtinessAfterTick = pet.getDirtiness();

        assertEquals(initialDirtiness+10, dirtinessAfterTick);
    }

    @Test
    public void doesFeedDecreaseHunger() {
        VirtualPet pet = new VirtualPet("Lana");

        int originalHunger = pet.getHunger();

        pet.feed();
        int hungerAfterFeeding = pet.getHunger();

        assertEquals(originalHunger, hungerAfterFeeding + 10);

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
    public void doesCleanDecreaseDirtiness(){
        VirtualPet pet = new VirtualPet("Bubblegum");
        pet.tick();
        int initialDirtiness = pet.getDirtiness();
        pet.clean();
        int dirtinessAfterCleaning = pet.getDirtiness();

        assertTrue(initialDirtiness>dirtinessAfterCleaning);
    }

    @Test
    public void hungerNotNegative(){
        VirtualPet pet = new VirtualPet("Connor");

        pet.feed();
        pet.feed();

        int hungerAfterFeeding = pet.getHunger();

        assertEquals(0, hungerAfterFeeding);
    }

    @Test
    public void boredomNotNegative(){
        VirtualPet pet = new VirtualPet("Cliff");

        pet.play();
        pet.play();

        int boredomAfterPlaying = pet.getBoredom();

        assertEquals(0, boredomAfterPlaying);
    }

    @Test
    public void thirstNotNegative(){
        VirtualPet pet = new VirtualPet("Fathi");

        pet.water();
        pet.water();

        int thirstAfterWatering = pet.getThirst();

        assertEquals(0, thirstAfterWatering);
    }

    @Test
    public void canReturnPetStatus () {
        VirtualPet testPet = new VirtualPet("Bosco");
        String statusLine = testPet.returnPetStatus();
        assertThat(statusLine).isEqualTo("| Bosco      |   10   |   10   |    10   |");
    }
    @Test
    public void doesChangeColor() {
        VirtualPet testPet = new VirtualPet("Bosco");
        testPet.setColor("Blue");
        assertEquals("Blue",testPet.getColor());
    }
}

/* SPRINT 3
Support for 4 types of pets: Organic Cats, Organic Dogs, Robotic Cats, Robotic Dogs.
Robots require oil and maintenance.
Organic cats and dogs require cage & litter box cleaning.
Allow users to take dogs on walks.
Walking organic pets decreases the rate at which they soil their cages/litter boxes.
Walking robotic pets increases their need for oil and maintenance. */

//robotic class will inherit virtual pet but will change food to oil and instead of clean- maintenance!

