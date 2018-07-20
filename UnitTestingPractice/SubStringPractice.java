/**
 * Class to give practice with the substring method.
 * Used to provide unit testing practice.
 * Borrowed from/inspired by codingbat.com/java
 *
 * @author pwaite
 */

public class SubStringPractice {

    /**
     * Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back.
     * The string will be non-empty.
     *
     * For example:
     * theEnd("Hello", true) → "H"
     * theEnd("Hello", false) → "o"
     * theEnd("oh", true) → "o"
     * theEnd("x", true) → "x"
     * theEnd("x", false) → "x"
     * theEnd("1234", true) → "1"
     *
     * @param name
     * @return greeting
     */

    public String theEnd(String input, boolean front) {
        if (front) {
            return input.substring(0, 1);
        } else {
            return input.substring(input.length() - 1);
        }
    }

}
 
 


 

 