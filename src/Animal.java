/**
 * The Animal interface represents any animal that can be displayed as ASCII art.
 * Classes implementing this interface should provide their specific animal artwork
 * and override the toString method to return the name of the animal.
 * Changes made here to Animal
 */
interface Animal {

  /**
   * Returns the ASCII art representation of the animal.
   *
   * @return A string containing the ASCII art of the animal.
   */
  String getAnimalArt();

  /**
   * Implementing classes should override the toString method to return the
   * name of the animal.
   *
   * @return The name of the animal.
   */
  @Override
  String toString();
}