/**
 * Implement calculateArea() and calculatePerimeter() for Square class
 */

public class Square {

  private int side;
  int area = 0;
  int perimeter=0;

  public Square(int side) {
    // TODO: Initialize side with the passed value
    this.side=side;
  }

  public int calculateArea() {
    // TODO: Calculate and return the area of the square
    if (side<=0) return -1;
    area=side*side;
    return area;
  }

  public int calculatePerimeter() {
    // TODO: Calculate and return the perimeter of the square
    if (side<=0) return -1;
    perimeter=4*side;
    return perimeter;
  }

}