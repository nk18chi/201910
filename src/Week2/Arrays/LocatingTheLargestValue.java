package Week2.Arrays;

import java.util.Arrays;
import java.util.Random;

public class LocatingTheLargestValue {
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
    System.out.println(String.format("The largest value is %s", max));

    Integer[] arr_integer = Arrays.stream(arr).boxed().toArray( Integer[]::new );
    int index = Arrays.asList(arr_integer).indexOf(max);

    if (index < 0) {
      System.out.println(String.format("It is not in the array."));
    }

    int total_index = index;
    while (0 <= index) {
      System.out.println(String.format("It is in slot %s.", total_index));
      arr_integer = Arrays.copyOfRange(arr_integer, index+1, arr.length);
      index = Arrays.asList(arr_integer).indexOf(max);
      total_index += index + 1;
    }
  }

  static void printArray(int[] arr) {
    /**
     * Reference: https://www.techiedelight.com/convert-int-array-string-array-java/
     */
    String arr_str[] = Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
    System.out.println(String.format("Array: %s", String.join(" ", arr_str)));
  }

}
