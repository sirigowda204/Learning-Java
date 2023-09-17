/**
 * A Perfect Number is a positive integer that is equal to the sum of all of its positive divisors, excluding itself.
 */

public class PerfectNumberChecker {
    public boolean isPerfectNumber(int number) {
        if (number<=0) return false;
        int sum=0;
        for (int i=1; i<number; i++){
            if (number%i==0) {sum+=i;}
        }
        if (sum==number){
            return true;}
        return false;
    }
}