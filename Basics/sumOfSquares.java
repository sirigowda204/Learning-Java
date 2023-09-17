/**
 * The task is to implement a method calculateSumOfSquares in the class SumOfSquares that calculates 
 * and returns the sum of squares of all positive integers up to n (inclusive).
 */

public class SumOfSquares {
    public long calculateSumOfSquares(int n) {
       // write your code here
       if (n<0) return -1;
       int sum=0;
       for(int i=1; i<=n; i++){
           sum += i*i;
       }
       return sum;
    }
}