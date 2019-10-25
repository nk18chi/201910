package Week2.Arrays;

import java.util.Arrays;
import java.util.Random;

public class CopyingArrays {
  public static void main(String[] args) {

    final int COUNT = 10;

    int[] arr = new int[COUNT];
    for (int i = 0; i < arr.length; i++) {
      Random r = new Random();
      int num = r.nextInt(100) + 1;
      arr[i] = num;
    }

    int[] arr2 = new int[COUNT];
    System.arraycopy(arr, 0, arr2, 0, 10);
    arr[arr.length-1] = -7;
    printArray(arr, 1);
    printArray(arr2, 2);
  }

  private static void printArray(int[] arr, int i) {
    /**
     * Reference: https://www.techiedelight.com/convert-int-array-string-array-java/
     */
    String arr_str[] = Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
    System.out.println(String.format("Array %s: %s", i, String.join(" ", arr_str)));
  }

}
