public enum Size {
  First("LARGE"), Second("MEDIUM"), Third("SMALL");
  
  private final String display;
  private Size(String s) {
    display = s;
  }
  @Override
  public String toString() {
    return display;
  }
}

//veno
//enum class to set Sizes and send it to String