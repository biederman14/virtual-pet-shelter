package virtual_pet_shelter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VirtualPetTest {

	// @Test
	// public void shouldCreateNewName() {
	// String petName = "Jane";
	// VirtualPet underTest = new VirtualPet(petName);
	// assertEquals("should return pet Name", petName,
	// underTest.getVirtualPetName());
	// }

	// @Test
	// public void shouldPullNameDescription() {
	// String petName = "Smith";
	// String petDescription = "Smells of elderberry and likes to smash things.";
	// VirtualPet underDescription = new VirtualPet(petName, petDescription);
	// assertEquals("Should get pet description", petDescription,
	// underDescription.getVirtualDescription());
	// }

	// @Test
	// public void shouldPullHunger() {
	// String petName = "Smith";
	// String petDescription = "Smells of elderberry and likes to smash things.";
	// int petHunger = 10;
	// VirtualPet underTest = new VirtualPet(petName, petDescription, petHunger);
	// assertEquals("should get name, description, hunger", petHunger,
	// underTest.getVPHunger());
	// }

	// @Test
	// public void shouldPullThrist() {
	// String petName = "Smith";
	// String petDescription = "Smells of elderberry and likes to smash things.";
	// int petHunger = 10;
	// int petThirst = 10;
	// VirtualPet underTest = new VirtualPet(petName, petDescription, petHunger,
	// petThirst);
	// assertEquals("should get thirst", petThirst, underTest.getVPThirst());
	// }

	// @Test
	// public void shouldPullContentment() {
	// String petName = "Smith";
	// String petDescription = "Smells of elderberry and likes to smash things.";
	// int petHunger = 10;
	// int petThirst = 10;
	// int petContentment = 10;
	// VirtualPet underTest = new VirtualPet(petName, petDescription, petHunger,
	// petThirst, petContentment);
	// assertEquals("should get thirst", petThirst, underTest.getVPContentment())
	// }

	@Test
	public void shouldPullAlive() {
		String petName = "Smith";
		String petDescription = "Smells of elderberry and likes to smash things.";
		int petHunger = 10;
		int petThirst = 10;
		int petContentment = 10;
		boolean petAlive = true;
		VirtualPet underTest = new VirtualPet(petName, petDescription, petHunger, petThirst, petContentment, petAlive);
		assertEquals("should show alive", petAlive, underTest.getVPAlive());

	}

	@Test
	public void petShouldDie() {
		String petName = "Smith";
		String petDescription = "Smells of elderberry and likes to smash things.";
		int petHunger = 0;
		int petThirst = 0;
		int petContentment = 0;
		boolean petAlive = false;
		new VirtualPet(petName, petDescription, petHunger, petThirst, petContentment, petAlive);
		assertEquals(false, petAlive);
	}

	@Test
	public void deathOfPet() {
		String petName = "Smith";
		String petDescription = "Smells of elderberry and likes to smash things.";
		int petHunger = 0;
		int petThirst = 0;
		int petContentment = 0;
		boolean petAlive = false;
		new VirtualPet(petName, petDescription, petHunger, petThirst, petContentment, petAlive);
		assertEquals(false, petAlive);
	}

	@Test
	public void myDefaultPet() {
		String petName = "Smith";
		String petDescription = "Smells of elderberry and likes to smash things.";

		VirtualPet defaultPet = new VirtualPet(petName, petDescription);
		assertEquals("Should create new name, description, and set defaults", 2, defaultPet.petHunger);

	}
}
