package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LocatingTheLargestValue {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    int max = 0;
    for (int i = 0; i < 10; i++) {
      Random r = new Random();
      int num = r.nextInt(100) + 1;
      arr.add(num);
      max = Math.max(max, num);
    }
    System.out.println( "ArrayList: " + arr);
    System.out.println();
    System.out.print(String.format("The largest value is %s", max));

    int index = arr.indexOf(max);
    if (index < 0) {
      System.out.println(String.format("%s is not in the ArrayList.", max));
    }

    int total_index = index;
    while (0 <= index) {
      System.out.println(String.format(", which is in slot %s", total_index));
      arr = arr.subList(index+1, arr.size());
      index = arr.indexOf(max);
      total_index += index + 1;
    }

  }

}
