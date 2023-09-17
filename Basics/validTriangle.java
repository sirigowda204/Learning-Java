/**
 * This method should return a boolean value – true if the given angles form a valid triangle, 
 * and false if they do not.
 */

public class TriangleValidator {
    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        // write your code here
        if (angle1<1 || angle2<1 || angle3<1) {return false;}
        if (angle1+angle2+angle3!=180) {return false;}
        return true;
    }
}