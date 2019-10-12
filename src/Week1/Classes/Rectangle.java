package Week1.Classes;

public class Rectangle {
  private int width = 0;
  private int height = 0;
  private String color = "Blue";

  public Rectangle(int width, int height) {
    this.setWidth(width);
    this.setHeight(height);
  }

  public Rectangle(int width, int height, String color) {
    this.setWidth(width);
    this.setHeight(height);
    this.setColor(color);
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public String getColor() {
    return color;
  }

  public void setWidth(int width) {
    this.width = Math.max(width, 1);
  }

  public void setHeight(int height) {
    this.height = Math.max(height, 1);
  }

  public void setColor(String color) {
    if (2 <= color.length() && color.length() <= 20) {
      color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }
    this.color = color;

  }

  public void draw() {
    String firstLetter = getColor().substring(0, 1);
    for (int i = 0; i < getHeight(); i++) {
      for (int j = 0; j < getWidth(); j++) {
        System.out.print(firstLetter);
      }
      System.out.print("\n");
    }
  }
}
