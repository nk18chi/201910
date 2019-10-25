package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FindingValueInArrayList {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      Random r = new Random();
      arr.add(r.nextInt(100) + 1);
    }
    arr.set(0, 1);
    arr.set(1, 1);
    System.out.println( "ArrayList: " + arr);

    int input = 0;
    while (true) {
      System.out.print("Value to find: ");
      Scanner in = new Scanner(System.in);
      try {
        input = Integer.parseInt(in.nextLine());
        break;
      } catch (Exception e) {
        System.out.println("Error! You must type integer.");
      }
    }

    if (arr.contains(input)) {
      System.out.println();
      System.out.print(String.format("%s is in the ArrayList.", input));
    };

  }
}
