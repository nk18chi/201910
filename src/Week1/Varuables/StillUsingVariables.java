package Week1.Varuables;

public class StillUsingVariables {
  private String name;
  private int yearOfGraduation;

  public StillUsingVariables(String name, int yearOfGraduation) {
    this.name = name;
    this.yearOfGraduation = yearOfGraduation;
  }

  public String getName() {
    return name;
  }

  public int getYearOfGraduation() {
    return yearOfGraduation;
  }

  public static void main(String[] args) {
    StillUsingVariables juan = new StillUsingVariables("Juan Valdez", 2010);
    String t = String.format("My name is %s and I'll graduate in %s.",
        juan.getName(), String.valueOf(juan.getYearOfGraduation()));
    System.out.println(t);
  }
}
