/**
 * To determine if a given year is a leap year.
 */

public class LeapYearChecker {
    public boolean isLeapYear(int year) {
        if (year<1) return false;
        if ((year%4==0) && (year%100!=0 || (year%100==0 && year%400==0))) return true;
       return false;
    }
}