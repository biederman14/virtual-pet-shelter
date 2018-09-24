package virtual_pet_shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

//Pet Map
	public Map<String, VirtualPet> petMap = new HashMap<String, VirtualPet>();

	public boolean hasPets() {
		return !petMap.isEmpty();
	}

	public Collection<VirtualPet> petCollection() {
		return petMap.values();
	}

	public VirtualPet getPetByName(String petName) {
		return petMap.get(petName);
	}

	// Adopt Pet
	public void adoptPet(String petName) {
		petMap.remove(petName);
	}

	// Add pet
	public void acceptPet(VirtualPet newPet) {
		petMap.put(newPet.getVirtualPetName(), newPet);
	}

	public void intake(VirtualPet pet) {
		petMap.put(pet.getVirtualPetName(), pet);
	}

//timeTick
	public void timeTickShelter() {
		for (VirtualPet instance : petMap.values()) {
			instance.timeTick();
		}
	}

//Do Nothing
	public void doNothing() {
		for (VirtualPet instance : petMap.values()) {
			instance.timeTick();
		}
	}

//Quit
	public void quitGame() {
		System.exit(0);
	}

//Feed Pets
	public void feedFear() {
		for (VirtualPet instance : petMap.values()) {
			instance.feedFear();
		}
	}

	public void feedCompliment() {
		for (VirtualPet instance : petMap.values()) {
			instance.feedCompliment();
		}
	}

	public void feedMorals() {
		for (VirtualPet instance : petMap.values()) {
			instance.feedMorals();
		}
	}

//Play with Pets
	public void causeChaos(String petName) {
		petMap.get(petName).moodCauseChaos();
	}

	public void threaten(String petName) {
		petMap.get(petName).moodThreaten();
	}

	public void fetch(String petName) {
		petMap.get(petName).moodFetch();
	}

	// Give pets Drink
	public void drinkBlood() {
		for (VirtualPet instance : petMap.values()) {
			instance.drinkBlood();
		}
	}

	public void drinkBooze() {
		for (VirtualPet instance : petMap.values()) {
			instance.drinkBooze();
		}
	}

	public void drinkHappiness() {
		for (VirtualPet instance : petMap.values()) {
			instance.drinkHappiness();
		}
	}

	public int getNumberOfPets() {
		return petMap.size();
	}

	public void removeDeadPet(VirtualPet virtualPet) {

	}

}
