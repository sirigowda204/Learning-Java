/**
 * This method should take three integer values that represent the lengths of the sides of a triangle. 
 * The task is to complete the method so it can accurately determine if the triangle with the 
 * given sides is a right-angled triangle. 
 * The method should return true if the triangle is right-angled and false otherwise.
 */

public class TriangleValidator {
    public boolean isRightAngled(int side1, int side2, int side3) {
        // write your code
        if (side1<=0||side2<=0||side3<=0) {return false;}
        if (side1*side1 + side2*side2 == side3*side3) {return true;}
        else if (side2*side2 + side3*side3 == side1*side1) {return true;}
        else if (side1*side1 + side3*side3 == side2*side2) {return true;}
        else {return false;}
    }   
}