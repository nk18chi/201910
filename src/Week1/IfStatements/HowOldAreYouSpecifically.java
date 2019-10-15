package Week1.IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
    String inputName = scanner.nextLine();
    System.out.print(String.format("Ok, %s, how old are you? ", inputName));
    int inputAge = Integer.valueOf(scanner.nextLine());

    String t = "";
    if (inputAge < 16) {
      t = "You can't drive";
    } else if (inputAge == 16 || inputAge == 17) {
      t = "You can drive but not vote";
    } else if (18 <= inputAge && inputAge <= 24) {
      t = "You can vote but not rent a car";
    } else {
      t = "You can do pretty much anything";
    }

    System.out.print(String.format("\n%s, %s.", t, inputName));

    scanner.close();

  }
}
