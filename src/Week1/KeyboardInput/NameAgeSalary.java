package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // operating name
    System.out.println("Hello.  What is your name?");
    String inputName = scanner.nextLine();

    // operating age
    System.out.println(String.format("\nHi, %s!  How old are you?", inputName));
    String inputAge = scanner.nextLine();

    // operating salary
    System.out.println(String.format("\nSo you're %s, eh?  That's not old at all!\nHow much do you make, %s?", inputAge, inputName));
    double inputSalary = Float.parseFloat(scanner.nextLine());
    System.out.print(String.format("\n%.1f!  I hope that's per hour and not per year! LOL!", inputSalary));


    scanner.close();
  }
}
