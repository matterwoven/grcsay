class SpeechBubble {
  private String message;

  public SpeechBubble(String message) {
      this.message = message;
  }

  public String getBubble() {
      int length = message.length();
      String topBottomBorder = " " + "_".repeat(length + 2);
      String middle = "< " + message + " >";
      String bottom = " " + "-".repeat(length + 2);
      return topBottomBorder + "\n" + middle + "\n" + bottom;
  }
}