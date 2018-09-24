package virtual_pet_shelter;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;
import org.junit.Test;

public class VirtualPetShelterTest {

	@Test
	public void shouldAcceptPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(
				new VirtualPet("Smasho", "Smells of elderberry and likes to smash things.", 10, 10, 5, true));
		assertEquals(1, underTest.petMap.size());
	}

	@Test
	public void shouldAcceptTwoPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(
				new VirtualPet("Smasho", "Smells of elderberry and likes to smash things.", 10, 10, 5, true));
		underTest.acceptPet(new VirtualPet("Blargle", "Happiest when speaking", 10, 10, 5, true));

		assertEquals(2, underTest.petMap.size());
	}

	@Test
	public void shouldInitiateTick() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(
				new VirtualPet("Smasho", "Smells of elderberry and likes to smash things.", 10, 10, 5, true));
		underTest.timeTickShelter();
		assertEquals("hunger should decrease by 2", 8, underTest.petMap.get("Smasho").petHunger);
	}

//Test Feed
	@Test
	public void shouldFeedFear() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(
				new VirtualPet("Smasho", "Smells of elderberry and likes to smash things.", 10, 10, 5, true));
		underTest.feedFear();
		assertEquals("hunger should increase by 5", 15, underTest.petMap.get("Smasho").petHunger);
	}

	@Test
	public void shouldFeedCompliment() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(
				new VirtualPet("Smasho", "Smells of elderberry and likes to smash things.", 10, 10, 5, true));
		underTest.feedCompliment();
		assertEquals("hunger should increase by 2", 12, underTest.petMap.get("Smasho").petHunger);
	}

	@Test
	public void shouldFeedMorals() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(
				new VirtualPet("Smasho", "Smells of elderberry and likes to smash things.", 10, 10, 5, true));
		underTest.feedMorals();
		assertEquals("hunger should decrease by 5", 5, underTest.petMap.get("Smasho").petHunger);
	}

//Test Contentment
	@Test
	public void shouldCauseChaos() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(
				new VirtualPet("Smasho", "Smells of elderberry and likes to smash things.", 10, 10, 5, true));
		underTest.causeChaos("Smasho");
		assertEquals("contentment should increase by 10", 15, underTest.petMap.get("Smasho").petContentment);
	}

	@Test
	public void shouldThreaten() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(
				new VirtualPet("Smasho", "Smells of elderberry and likes to smash things.", 10, 10, 5, true));
		underTest.threaten("Smasho");
		assertEquals("contentment should increase by 5", 10, underTest.petMap.get("Smasho").petContentment);
	}

	@Test
	public void shouldPlayFetch() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(
				new VirtualPet("Smasho", "Smells of elderberry and likes to smash things.", 10, 10, 5, true));
		underTest.fetch("Smasho");
		assertEquals("contentment should decrease by 2", 3, underTest.petMap.get("Smasho").petContentment);
	}

	// Test Thirst
	@Test
	public void shouldDrinkBlood() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(
				new VirtualPet("Smasho", "Smells of elderberry and likes to smash things.", 10, 10, 5, true));
		underTest.drinkBlood();
		assertEquals("thirst should increase by 10", 20, underTest.petMap.get("Smasho").petThirst);
	}

	@Test
	public void shouldDrinkBooze() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(
				new VirtualPet("Smasho", "Smells of elderberry and likes to smash things.", 10, 10, 5, true));
		underTest.drinkBooze();
		assertEquals("thirst should increase by 5", 15, underTest.petMap.get("Smasho").petThirst);
	}

	@Test
	public void shouldDrinkHappiness() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.acceptPet(
				new VirtualPet("Smasho", "Smells of elderberry and likes to smash things.", 10, 10, 5, true));
		underTest.drinkHappiness();
		assertEquals("thirst should decrease by 5", 5, underTest.petMap.get("Smasho").petThirst);
	}

	@Test
	public void shouldRemoveDeadPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.removeDeadPet(new VirtualPet("Sly", "Stinks", 0, 0, 0, false));
		underTest.deadPet();
		assertEquals("pet should be removed", null, underTest.petMap.get("Sly"));
	}

}
