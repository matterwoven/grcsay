import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * The SayApp class represents a simple application where users can choose an animal 
 * and display a speech bubble with the chosen animal's ASCII art.
 */
public class SayApp {

    /**
     * The main method is the entry point of the application. It handles the user input 
     * for selecting an animal and a message, then displays the speech bubble and the 
     * selected animal's ASCII art.
     *
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Animal animal = getAnimalChoice(scanner);
      String message = getMessageChoice(scanner, animal);
      scanner.close();
      
      SpeechBubble speechBubble = new SpeechBubble(message);

      System.out.println(speechBubble.getBubble());
      System.out.println(animal.getAnimalArt());
    }

    /**
     * Prompts the user to input the message they want the animal to "say".
     *
     * @param scanner The Scanner object used for reading user input.
     * @param animal The animal selected by the user.
     * @return The message that the user wants the animal to say.
     */
    public static String getMessageChoice(Scanner scanner, Animal animal) {
      System.out.println("What would you like the " + animal + " to say?");
      String message = scanner.nextLine();
      return message;
    }

    /**
     * Prompts the user to choose an animal from the available options.
     * Repeats until the user provides a valid input.
     *
     * @param scanner The Scanner object used for reading user input.
     * @return The Animal object chosen by the user.
     */
    public static Animal getAnimalChoice(Scanner scanner) {
      List<Animal> animals = animalList();
      Map<String, Animal> nameToAnimal = animalMap(animals);

      Animal choice = null;
      while(choice == null) {
        System.out.println("Which animal would you like to display? Options are: ");
        System.out.println(animals);
        String input = scanner.nextLine();
        input = input.toLowerCase();
        if(!nameToAnimal.containsKey(input)) {
          System.out.println("Invalid choice.");
        } else {
          choice = nameToAnimal.get(input);
        }
      }

      return choice;
    }

    /**
     * Provides a list of available animals.
     * Currently, the only available animals are Duck and Cow
     *
     * @return A list of Animal objects.
     */
    public static List<Animal> animalList() {
      return Arrays.asList(new Cow(), new Duck(), new Deer());
    }

    /**
     * Maps animal names (converted to lowercase) to their corresponding Animal objects.
     *
     * @param animals A list of Animal objects.
     * @return A map where the keys are animal names (in lowercase) and the values are the corresponding Animal objects.
     */
    public static Map<String, Animal> animalMap(List<Animal> animals) {
      Map<String, Animal> nameToAnimal = new HashMap<>();
      for (Animal animal : animals) {
        nameToAnimal.put(animal.toString().toLowerCase(), animal);
      }
      return nameToAnimal;
    }
}
