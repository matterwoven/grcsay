/**
 * The SpeechBubble class generates a text bubble containing a given message.
 * The bubble includes top and bottom borders and a message enclosed in angle brackets.
 */
class SpeechBubble {
  private String message;

  /**
   * Constructs a SpeechBubble object with a specific message.
   *
   * @param message The message to be displayed inside the speech bubble.
   */
  public SpeechBubble(String message) {
      this.message = message;
  }

  /**
   * Generates the speech bubble with the message.
   * The bubble is formatted with top and bottom borders and the message in the middle.
   *
   * @return A string representing the speech bubble with the message.
   */
  public String getBubble() {
      int length = message.length();
      String topBottomBorder = " " + "_".repeat(length + 2);
      String middle = "< " + message + " >";
      String bottom = " " + "-".repeat(length + 2);
      return topBottomBorder + "\n" + middle + "\n" + bottom;
  }
}
