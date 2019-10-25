package Week2.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
  public static void main(String[] args) {

    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      Random r = new Random();
      arr[i] = r.nextInt(50) + 1;
    }

//    arr[arr.length-1] = 1;
//    arr[arr.length-2] = 1;
//    arr[3] = 1;
    printArray(arr);

    int input = 0;
    while(true) {
      Scanner in = new Scanner(System.in);
      System.out.print("Value to find: ");
      try {
        input = Integer.parseInt(in.nextLine());
        break;
      } catch (Exception e) {
        System.out.println("Error! You must type integer.");
      }
    }

    Integer[] arr_integer = Arrays.stream(arr).boxed().toArray( Integer[]::new );
    int index = Arrays.asList(arr_integer).indexOf(input);

    if (index < 0) {
      System.out.println(String.format("%s is not in the array.", input));
    }

    int total_index = index;
    while (0 <= index) {
      System.out.println(String.format("%s is in slot %s.", input, total_index));
      arr_integer = Arrays.copyOfRange(arr_integer, index+1, arr.length);
      index = Arrays.asList(arr_integer).indexOf(input);
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
