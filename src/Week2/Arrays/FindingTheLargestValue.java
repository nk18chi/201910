package Week2.Arrays;

import java.util.Random;

public class FindingTheLargestValue {
  public static void main(String[] args) {
    int[] arr = new int[10];
    Random r = new Random();

    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      int num = r.nextInt(100) + 1;
      arr[i] = num;
      max = Math.max(max, num);
    }

    WhereIsIt.printArray(arr);
    System.out.println();
    System.out.print(String.format("The largest value is %s", max));

  }
}
