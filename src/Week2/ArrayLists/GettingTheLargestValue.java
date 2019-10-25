package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GettingTheLargestValue {
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
    System.out.println(String.format("The largest value is %s", max));
  }
}
