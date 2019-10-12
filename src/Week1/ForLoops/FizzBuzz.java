package Week1.ForLoops;

public class FizzBuzz {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      String t = Integer.toString(i);;

      if (i % 3 == 0 && i % 5 == 0) {
        t = "FizzBuzz";
      }
      else if (i % 3 == 0) {
        t = "Fizz";
      } else if (i % 5 == 0) {
        t = "Buzz";
      }

      System.out.println(t);
    }
  }
}
