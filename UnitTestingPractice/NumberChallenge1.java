/**
 * Class to solve a number challenge puzzle from codingbat.com/java
 * Used to provide unit testing practice.
 * Borrowed from/inspired by codingbat.com/java
 *
 * @author pwaite
 */

public class NumberChallenge1 {

    /**
     * Given an int n, return true if it's value is within 10 of 100 or 200.
     * Note: Math.abs(num) computes the absolute value of a number.
     * <p>
     * Examples:
     * nearHundred(93) → true
     * nearHundred(90) → true
     * nearHundred(89) → false
     * nearHundred(-50) → false
     * nearHundred(290) → false
     * nearHundred(-209) → false
     * nearHundred(0) → false
     * nearHundred(211) → false
     *
     **/
    public boolean nearHundred(int myNumber) {
        return ((Math.abs(100 - myNumber) <= 10) || (Math.abs(200 - myNumber) <= 10));
    }

}