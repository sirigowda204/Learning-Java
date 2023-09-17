// Defining a Point class to represent a point in 2-dimensional space
public class Point {

  // x-coordinate of the point
  private int x;

  // y-coordinate of the point
  private int y;

  // Constructor for the Point class
  public Point(int x, int y) {
    this.x = x;  // Assigning x-coordinate of the point
    this.y = y;  // Assigning y-coordinate of the point
  }

  // Method to get the x-coordinate of the point
  public int getX() {
    return x;
  }

  // Method to get the y-coordinate of the point
  public int getY() {
    return y;
  }

  // TODO: Implement the method to move the point by dx and dy in x and y direction respectively
  public void move(int dx, int dy) {
    // Your code here
    x+=dx;
    y+=dy;

  }

  // TODO: Implement the method to calculate the distance from this point to another point
  public double distanceTo(Point other) {
    int x2 = other.getX();
    int y2 = other.getY();

    return Math.sqrt(((x2-x)*(x2-x))+((y2-y)*(y2-y)));
  }
}