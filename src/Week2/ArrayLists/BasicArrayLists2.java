package Week2.ArrayLists;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasicArrayLists2 {

  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      Random r = new Random();
      arr.add(r.nextInt(100) + 1);
    }
    System.out.println( "ArrayList: " + arr);

  }

}
