package Week2.ArrayLists;

import java.util.*;

public class WhereIsIt {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      Random r = new Random();
      arr.add(r.nextInt(100) + 1);
    }
//    arr.set(0, 1);
//    arr.set(1, 1);
//    arr.set(7, 1);
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
    System.out.println();

    int index = arr.indexOf(input);
    if (index < 0) {
      System.out.println(String.format("%s is not in the ArrayList.", input));
    }

    int total_index = index;
    while (0 <= index) {
      System.out.println(String.format("%s is in slot %s.", input, total_index));
      arr = arr.subList(index+1, arr.size());
      index = arr.indexOf(input);
      total_index += index + 1;
    }

  }
}
