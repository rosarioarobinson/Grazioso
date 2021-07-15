import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    
 // Added ArrayList for Monkey array list
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

private static String newInput;

    public static void main(String[] args) {


    	// initializers for dog and monkey lists
    	initializeDogList();
        initializeMonkeyList();
        
        
        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
        
     // For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        
        // Created scanner and userInput string for do-while loop for displayMenu
        Scanner scnr = new Scanner(System.in);
        String userInput;
        userInput = "";
        
        // Created a do-while loop to go through displayMenu 
        // and do next steps according to input
        do {
	        displayMenu();
	        userInput = scnr.nextLine();
	        
	        switch(userInput){
	        	case "1":
	        		intakeNewDog(scnr);
	        		break;
	        		
	        	case "2":
	        		intakeNewMonkey(scnr);
	        		break;
	        		
	        	case "3":
	        		System.out.println();
	        		reserveAnimal(scnr);
	        		break;
	        		
	        	case "4":
	        		printAnimals(userInput);
	        		break;
	        		
	        	case "5":
	        		System.out.println();
	        		printAnimals(userInput);
	        		break;
	        		
	        	case "6": 
	        		System.out.println();
	        		printAnimals(userInput);
	        		break;
	        		
	        	case "q":
	        		System.out.println("Quit Application");
	        		break;
	        		
	        	default:
	        		System.out.println("Your entry is not valid. Please enter valid selection.");
	        }// switch
     } while (!userInput.equals("q")); // while
    }// main	


    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }// initializeDogList


    // Adds monkeys to a list for testing
    // Optional for testing
    public static void initializeMonkeyList() {
    	
    	// Added monkey to a list to test intakeNewMonkey() method
    	Monkey monkey1 = new Monkey("Jack", "Male", "5", "40", "04-04-2020", "United States", "Phase II", false, 
    			"United States", "4", "5", "30", "Capuchin");
    	Monkey monkey2 = new Monkey("Krissy", "Female", "5", "40", "04-04-2020", "Columbia", "Phase II", false, 
    			"United States", "4", "5", "30", "Capuchin");
    	Monkey monkey3 = new Monkey("Janet", "Female", "5", "40", "04-04-2020", "Spain", "Phase II", false, 
    			"United States", "4", "5", "30", "Capuchin");
   	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);

    }// initializeMonkeyList


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; // returns to menu
            }
        }

        
     // Added code to instantiate a new monkey to add to appropriate list
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        
        System.out.println("When did you acquire the dog?");
        String acquisitionDate = scanner.nextLine();
        
        System.out.println("Where did you acquire the dog?");
        String acquisitionCountry = scanner.nextLine();
        
        System.out.println("What is the training status?");
        String trainingStatus = scanner.nextLine();
        
        System.out.println("Is the dog reserved? Please enter true or false.");
        boolean reserved = scanner.nextBoolean();
        
        scanner.nextLine(); // included additional nextLine() to fix boolean error occurring
        
        System.out.println("What is the dog's service country?");
        String inServiceCountry = scanner.nextLine();
        
        // created to add new dog to the dogList array
        Dog dog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        dogList.add(dog);
        
    }// intakeNewDog


 // Complete intakeNewMonkey
 	// Instantiate and add the new monkey to the appropriate list
         // For the project submission you must also  validate the input
 	// to make sure the monkey doesn't already exist and the species type is allowed
         public static void intakeNewMonkey(Scanner scanner) {
         	System.out.println("What is the monkey's name?");
             String name = scanner.nextLine();
             for(Monkey monkey: monkeyList) {
                 if(monkey.getName().equalsIgnoreCase(name)) {
                     System.out.println("\n\nThis monkey is already in our system\n\n");
                     return; // returns to menu
                 }
             }
             
             // Added code to instantiate a new monkey to add to appropriate list
             System.out.println("What is the monkey's gender?");
             String gender = scanner.nextLine();
             
             System.out.println("What is the monkey's age?");
             String age = scanner.nextLine();
             
             System.out.println("What is the monkey's weight?");
             String weight = scanner.nextLine();
             
             System.out.println("When did you acquire the monkey?");
             String acquisitionDate = scanner.nextLine();
             
             System.out.println("Where did you acquire the monkey?");
             String acquisitionCountry = scanner.nextLine();
             
             System.out.println("What is the training status?");
             String trainingStatus = scanner.nextLine();
             
             System.out.println("Is the monkey reserved? Please <enter true or false>.");
             boolean reserved = scanner.nextBoolean();
             
             scanner.nextLine(); // included additional nextLine() to fix boolean error occurring
             
             System.out.println("What is the monkey's service country?");
             String inServiceCountry = scanner.nextLine();
             
             System.out.println("What is the monkey's tail length?");
             String taillength = scanner.nextLine();
             
             System.out.println("What is the monkey's height?");
             String height = scanner.nextLine();
             
             System.out.println("What is the monkey's body length?");
             String bodyLength = scanner.nextLine();
             
             System.out.println("What is the monkey's species?");
             String species = scanner.nextLine();
             
             // created to add new monkey to the monkeyList array
             Monkey monkey = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry, taillength, height, bodyLength, species);
             monkeyList.add(monkey);
             
         }// intakeNewMonkey

        // Complete reserveAnimal
        // Find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("Please enter desired animal type.");
            String type = scanner.nextLine();
            
            // If animal matches input criteria: Accesses animal object from ArrayList
            // and updates the ‘reserved’ attribute of the animal
            // If no animal matches input criteria: Prints feedback to the user
            
            // if statement for monkey reserve
            if (type.equals("monkey")) {
            	System.out.println("Here is the list of available monkeys.");
        		for (int i = 0; i < monkeyList.size(); i++) {	
        			System.out.println(monkeyList.get(i).getName());
        		}
        		System.out.println("Enter name of the monkey you want to reserve: ");
        		String monkeyName = scanner.nextLine();
        		// Creating monkey object and checking to see if monkey name enter is in the list. 
                for (Monkey obj: monkeyList) {
                	if (obj.getName().equals(monkeyName)) {
                		obj.reserved = true;
                		System.out.println("Thank you for reserving " + monkeyName + " today. Have fun!");
                		return;
                	} else {
                		System.out.println("Sorry, that Monkey is not in the list.");
                       	scanner.nextLine();
                       	return;
                	} 
                }
            } else if (type.equals("dog")) {  // else if statement for dog reserve
            	System.out.println("Here is the list of available dogs.");
            	for (int i = 0; i < dogList.size(); i++) {	
        			System.out.println(dogList.get(i).getName());
        		}
        		System.out.println("Enter name of the dog you want to reserve: ");
        		String dogName = scanner.nextLine();
        		// Creating dog object and checking to see if dog name enter is in the list. 
        		for (Dog obj: dogList) {
                	if (obj.getName().equals(dogName)) {
                		obj.reserved = true;
                		System.out.println("Thank you for reserving " + dogName + " today. Have fun!");
                		return;
                	} else {
                		System.out.println("Sorry, that Dog is not in the list.");
                       	scanner.nextLine();
                       	return;
                	}
                }
            } else { 
        		System.out.println("Sorry, we do not have that animal type.");
            	scanner.nextLine();
            	return;
            }
        }
        
            

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String newInput) {
            
            // user input and scanner
            System.out.println("Enter selection.");
            System.out.println("The user selection is: " + newInput);
			
            // if statement for menu option '4' that prints all dogs
            if (newInput.equals("4")) {
            	System.out.println("Printing all dogs.");
            	for (int i = 0; i < dogList.size(); i++) {
                	System.out.println(dogList.get(i).getName());
                }
            }
            
            // if statement for menu option '5' that prints all monkeys
            if (newInput.equals("5")) {
            	System.out.println("Printing all monkeys.");
            	for (int i = 0; i < monkeyList.size(); i++) {
            		System.out.println(monkeyList.get(i).getName());
            	}
            }
            
            // if statement for menu option '6' that prints all animals not reserved
            if (newInput.equals("6")) {
            	System.out.println("Printing all animals not reserved.");

            	for (int i = 0; i <dogList.size(); i++) {
            		if (!dogList.get(i).reserved) {
                    	System.out.println(dogList.get(i).getName());            			
            		}
            	}

            	
            	for (int i = 0; i <monkeyList.size(); i++) {
            		if (!monkeyList.get(i).reserved) {
                    	System.out.println(monkeyList.get(i).getName());       		            			
            		}
            	}
            	
            }
            
        }
}

