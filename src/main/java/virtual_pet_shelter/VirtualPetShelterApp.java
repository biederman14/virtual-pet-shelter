package virtual_pet_shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter shelterInstance = new VirtualPetShelter();
		String beginNewGame = "";
		VirtualPet startPet = new VirtualPet("Smasho",
				"smells of elderberry and his mother was a hampter. Enjoys destruction under his paws.");
		shelterInstance.intake(startPet);
		startPet = new VirtualPet("Jabber",
				"is a smooth talker. She can con a dentist into buying teeth.\\n Not a good listener.");
		shelterInstance.intake(startPet);
		startPet = new VirtualPet("Sparky", "confuses granades for tennis balls.");
		shelterInstance.intake(startPet);
		startPet = new VirtualPet("Sly", "will pick the lint out of your pocket, along with anything else valuable.");
		shelterInstance.intake(startPet);

		String userOptions = "What would you like to do next?\n" + "\n\t" + "1. Feed the pets\n\t"
				+ "2. Water the pets\n\t" + "3. Entertain a pet\n\t" + "4. Adopt a pet\n\t" + "5. Admit a pet\n\t"
				+ "6. Twiddle your thumbs at pets' expense.\n\t" + "7. Quit";

		System.out.println(
				"Welcome to the Black Market Pet Shelter: Home of neglected or left behind pets of reputable persons.\n");
		System.out.println(
				"We always appreciate volunteers for our pets, but understand they can be a bit much. \nWhat would you like to do for us today?\n");

		int userSelect = 0;

		do {
			shelterInstance.timeTickShelter();
			System.out.println(userOptions);
			// shelterInstance.showPetList(startPet);
			System.out.println("\t\t|" + "Hunger" + "\t|" + "Thirst" + "\t|" + "Contentment");
			for (VirtualPet i : ((VirtualPetShelter) shelterInstance).petCollection()) {
				System.out.println(i.getVirtualPetName() + "\t\t|" + i.getVPHunger() + "\t|" + i.getVPThirst() + "\t|"
						+ i.getVPContentment());
			}

			userSelect = input.nextInt();
//Hunger
			if (userSelect == 1) {
				System.out.println("What would you like to feed the pets?");
				System.out.println("1. Feed the fear of others \n2. Feed them compliments \n3. Feed them morals");
				userSelect = input.nextInt();
				if (userSelect == 1) {
					shelterInstance.feedFear();
				} else if (userSelect == 2) {
					shelterInstance.feedCompliment();
				} else if (userSelect == 3) {
					shelterInstance.feedMorals();
				}
//Thirst
			} else if (userSelect == 2) {
				System.out.println("What would you the pets to drink?");
				System.out.println("1. Blood \n2. Booze \n3. Happiness");
				userSelect = input.nextInt();
				if (userSelect == 1) {
					System.out.println("Tryin' to hide some extra evidence, eh? DNA = \"Do not ask\".");
					shelterInstance.drinkBlood();
				} else if (userSelect == 2) {
					System.out.println(
							"The pets sing, \"Have you ever heard the wolf cry to the Blue Corn Moon...?\" and begin howling at the top of their lungs.");
					shelterInstance.drinkBooze();
				} else if (userSelect == 3) {
					System.out.println("Pets are gagging on the mushy goodness.");
					shelterInstance.drinkHappiness();
				}
//Play with a Pet
			} else if (userSelect == 3) {
				System.out.println("Which pet would you like to play with?");
				for (VirtualPet i : ((VirtualPetShelter) shelterInstance).petCollection()) {
					System.out.println(i.getVirtualPetName() + "\t\t|" + i.getVirtualDescription());
				}
				String userChoosePet = input.next();

				System.out.println("What would you like to do with " + userChoosePet + "?"
						+ "\n1. Cause Chaos \n2. Threaten Society \n3. Play Fetch");
				userSelect = input.nextInt();
				if (userSelect == 1) {
					System.out.println("You and " + userChoosePet + " have destroyed a national landmark! \n Now "
							+ userChoosePet + " is exhausted!\n");
					shelterInstance.causeChaos(userChoosePet);
				} else if (userSelect == 2) {
					System.out.println("You and " + userChoosePet
							+ " called in a bomb threat to a local school. \nHundreds of students have lost a day's education.");
				} else if (userSelect == 3) {
					System.out.println(userChoosePet
							+ " plays fetch with you for a while, then trots off for more exciting endeavors.");
					shelterInstance.fetch(userChoosePet);
				}
//Adopt Pet
			} else if (userSelect == 4) {
				System.out.println("Which pet would you like to adopt?");
				String petName = input.next();
				shelterInstance.adoptPet(petName);
				System.out.println("Congratulations!  You have adopted " + petName
						+ "!\nPerhaps I'll hear about you two on the news!");
//Add Pet
			} else if (userSelect == 5) {

				System.out.println("What's the name of the bugger you're bringin' in?");
				String newPet = input.nextLine();
				newPet = input.next();
				System.out.println("What's this pet like?");
				String petDescription = input.nextLine();
				petDescription = input.nextLine();
				VirtualPet addedPet = new VirtualPet(newPet, petDescription);
				shelterInstance.acceptPet(addedPet);

				System.out.println(
						"Welcome, " + newPet + ".  Let's go in the back an' see who tries to kill you first.\n");
//Do Nothing
			} else if (userSelect == 6) {
				System.out
						.println("These pets ain't gettin' any younger, ya know...\nYou better do something with 'em.");
				shelterInstance.doNothing();
//Exit Game
			} else if (userSelect == 7) {
				System.out.println("Black Market pets too much for you, 'eh?  Get outta here, coward!");
				System.exit(0);
			}

		} while (shelterInstance.hasPets());
		System.out.println(
				"\nLooks like there aren't anymore pets in the shelter. \nWould you like to play again? (yes or no)");
		beginNewGame = input.next();
		if (beginNewGame.equalsIgnoreCase("yes")) {
			new Scanner(System.in);
		} else if (beginNewGame.equalsIgnoreCase("no")) {
			System.out.println("\nGet outta here. An' keep an eye out for any shifty strays.");
			System.exit(0);
		} else {
			System.out.println("\nGet outta here. An' keep an eye out for any shifty strays.");
			System.exit(0);
		}

		input.close();

	}
}
