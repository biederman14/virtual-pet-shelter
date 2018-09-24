package virtual_pet_shelter;

public class VirtualPet {
	public String petName;
	public String petDescription;
	public int petHunger;
	public int petThirst;
	public int petContentment;
	public boolean petAlive;

	public VirtualPet(String petName, String petDescription) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.petHunger = 10;
		this.petThirst = 10;
		this.petContentment = 10;
		this.petAlive = true;
	}

	public VirtualPet(String petName, String petDescription, int petHunger, int petThirst, int petContentment,
			boolean petAlive) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.petHunger = petHunger;
		this.petThirst = petThirst;
		this.petContentment = petContentment;
		this.petAlive = true;
	}

//Pet Methods:
	public String getVirtualPetName() {
		return petName;
	}

	public String getVirtualDescription() {
		return petDescription;
	}

	public int getVPHunger() {
		return petHunger;
	}

	public int getVPThirst() {
		return petThirst;
	}

	public int getVPContentment() {
		return petContentment;
	}

	public boolean getVPAlive() {

		return petAlive;
	}

	public void die() {
		petAlive = false;
	}

// timeTick
	public int timeTick() {
		petHunger -= 2;
		petThirst -= 2;
		petContentment -= 2;
		return (petHunger + petThirst + petContentment);
	}

	// Method feedFear
	public int feedFear() {
		petHunger += 5;
		petThirst += 1;
		petContentment += 2;
		return (petHunger + petThirst + petContentment);
	}

	// feedCompliment
	public int feedCompliment() {
		petHunger += 2;
		petThirst += 1;
		petContentment += 1;
		return (petHunger + petThirst + petContentment);
	}

	// feedMorals
	public int feedMorals() {
		petHunger -= 5;
		petThirst -= 1;
		petContentment -= 2;
		return (petHunger + petThirst + petContentment);
	}

	// drinkBlood
	public int drinkBlood() {
		petHunger += 2;
		petThirst += 10;
		petContentment += 2;
		return (petHunger + petThirst + petContentment);
	}

	// drinkBooze
	public int drinkBooze() {
		petHunger += 1;
		petThirst += 5;
		petContentment += 4;
		return (petHunger + petThirst + petContentment);
	}

	// drinkHappiness
	public int drinkHappiness() {
		petHunger -= 1;
		petThirst -= 5;
		petContentment -= 4;
		return (petHunger + petThirst + petContentment);
	}

	// moodCauseChaos
	public int moodCauseChaos() {
		petHunger -= 5;
		petThirst -= 10;
		petContentment += 10;
		return (petHunger + petThirst + petContentment);
	}

	// moodThreaten
	public int moodThreaten() {
		petHunger -= 2;
		petThirst -= 2;
		petContentment += 5;
		return (petHunger + petThirst + petContentment);
	}

	// moodFetch
	public int moodFetch() {
		petHunger -= 1;
		petThirst -= 2;
		petContentment -= 2;
		return (petHunger + petThirst + petContentment);
	}

}
