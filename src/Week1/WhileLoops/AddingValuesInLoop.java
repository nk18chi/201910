package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("I will add up the numbers you give me.");
    int total = 0;

    while (true) {
      System.out.print("Number: ");
      int inputNum = Integer.parseInt(scanner.nextLine());
      if (inputNum == 0) break;

      total += inputNum;
      System.out.println(String.format("The total so far is %s", total));
    }

    System.out.print(String.format("\nThe total is %s.", total));
    scanner.close();
  }
}
