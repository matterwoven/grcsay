import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class SayApp {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Animal animal = getAnimalChoice(scanner);
      String message = getMessageChoice(scanner, animal);
      scanner.close();
      
      SpeechBubble speechBubble = new SpeechBubble(message);

      System.out.println(speechBubble.getBubble());
      System.out.println(animal.getAnimalArt());
    }

    public static String getMessageChoice(Scanner scanner, Animal animal) {
      System.out.println("What would you like the " + animal + " to say?");
      String message = scanner.nextLine();
      return message;
    }

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

    public static List<Animal> animalList() {
      return Arrays.asList(new Cow());
    }


    public static Map<String, Animal> animalMap(List<Animal> animals) {
      Map<String, Animal> nameToAnimal = new HashMap<>();
      for (Animal animal : animals) {
        nameToAnimal.put(animal.toString().toLowerCase(), animal);
      }
      return nameToAnimal;
    }
}


