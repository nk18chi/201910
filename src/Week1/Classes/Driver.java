package Week1.Classes;

public class Driver {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle(5, 7, "Blue");
    Rectangle r2 = new Rectangle(10, 2, "Green");
    Rectangle r3 = new Rectangle(15, 12, "Red");

    r1.draw();
    System.out.print("\n");
    r2.draw();
    System.out.print("\n");
    r3.draw();

//    Rectangle r4 = new Rectangle(15, 12);
//    System.out.print("\n");
//    r4.draw();
//
//    Rectangle r5 = new Rectangle(-2, -3, "blue");
//    System.out.print("\n");
//    r5.draw();

  }
}
