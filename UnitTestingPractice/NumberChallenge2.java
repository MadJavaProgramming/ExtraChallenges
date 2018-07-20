/**
 * Class to solve a number challenge puzzle from codingbat.com/java
 * Used to provide unit testing practice.
 * Borrowed from/inspired by codingbat.com/java
 *
 * @author pwaite
 */

public class NumberChallenge2 {

    /**
     * Given three ints, number1, number2, and number3, one of them is small, one is medium and one is large.
     * Return true if the three values are evenly spaced, so the difference between small and medium
     * is the same as the difference between medium and large.
     *
     * For example:
     * evenlySpaced(2, 4, 6) → true
     * evenlySpaced(4, 6, 2) → true
     * evenlySpaced(4, 6, 3) → false
     * evenlySpaced(2, 2, 2) → true
     * evenlySpaced(2, 4, 4) → false
     * evenlySpaced(10, 9, 11) → true
	 * evenlySpaced(10, 9, 9) → false
	 * evenlySpaced(2, 2, 4) → false
     *
     * @param number1 first number
     * @param number2 second number
     * @param number3 third number
     * @return indicates whether the input numbers are evenly spaced
     **/

    public boolean evenlySpaced(int number1, int number2, int number3) {

        // TODO the code below doesn't quite yield the correct results describe above. Fix it up!
        int difference1 = 0;
        int difference2 = 0;
        int difference3 = 0;

        if (number1 == number2 && number2 == number3) {
            return false;
        }

        if (number1 == number2 || number2 == number3 || number1 == number3) {
            return false;
        }

        difference1 = Math.abs(number1 - number2);
        difference2 = Math.abs(number1 - number3);
        difference3 = Math.abs(number2 - number3);

        if (difference1 == difference2) {
            return true;
        } else if (difference1 == difference3) {
            return false;
        } else if (difference2 == difference3) {
            return true;
        }

        return true;
    }
}

