/**
 * The Cow class represents a cow and provides its ASCII art representation.
 * This class implements the Animal interface and overrides the getAnimalArt 
 * and toString methods.
 * 
 * Cow by Tony Monroe. See license file for more details.
 */
class Cow implements Animal {

  /**
   * Returns the ASCII art representation of the cow.
   *
   * @return A string containing the ASCII art of the cow.
   */
  @Override
  public String getAnimalArt() {
      return "        \\   ^__^\n" +
             "         \\  (oo)\\_______\n" +
             "            (__)\\       )\\/\\\n" +
             "                ||----w |\n" +
             "                ||     ||";
  }

  /**
   * Returns the name of the animal ("cow").
   * This method overrides the toString method to return the name of the cow.
   *
   * @return The string "cow" representing the name of the animal.
   */
  @Override
  public String toString() {
    return "cow";
  }
}
