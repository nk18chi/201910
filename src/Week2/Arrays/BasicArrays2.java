package Week2.Arrays;

import java.util.Random;

public class BasicArrays2 {

  public static void main(String[] args) {
    int count = 0;
    int[] arr = new int[10];
    for (int i: arr) {
      Random r = new Random();
      i = r.nextInt(100) + 1;
      System.out.println(String.format("Slot %s contains a %s", count, i));
      count++;
    }
  }
}
