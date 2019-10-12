package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Hello.  What is your name? ");
    String inputName = scanner.nextLine();

    System.out.print(String.format("\nHi, %s!  How old are you? ", inputName));
    int inputAge = Integer.valueOf(scanner.nextLine());

    System.out.println(String.format("\nDid you know that in five years you will be %s years old?", Integer.toString(inputAge+5)));
    System.out.print(String.format("And five years ago you were %s! Imagine that!", Integer.toString(inputAge-5)));

    scanner.close();

  }
}
