/**
 * MethodPractice class which will provide practice creating methods with various parameters and return types. 
 * This class was created for the in-class mini-team challenge in week 5
 *
 * @author Paula Waite
 */

/*
 * TODO Write methods based on the following descriptions. 
 *
 * If the method returns a value, print the output to the screen from within the "test drive" (i.e. MethodPracticeTestDrive).
 * 
 *The first one is done for you as an example.
 *
 * 1. Takes 1 int as a parameter and returns the difference between 10 and the number.
 *
 * 2. Takes 2 String parameters and returns their concatenated value. (To concatenate two strings, use the '+' symbol.)
 *
 * 3. Takes 2 longs and returns 10 times the first number plus the second number.
 *
 * 4. Takes 2 booleans and has a void return type. If both booleans are true, output a message to the screen saying, "It's all good." Where is this message being generated? Why?
 *
 * 5. Takes 2 floats and returns a double that is their product.
 *
 * 6. Takes 1 double and returns its value divided by 3.33.
 */


public class MethodPractice {
		
	/** 
     *  Takes 1 int as a parameter and returns the difference between 10 and the number.
	 * 
     * @param inputNumber the number to subract from 10
     **/
			
    public int calculateDifferenceFromTen(int inputNumber) {
		int differenceNumber = 10;
		return Math.abs(differenceNumber - inputNumber);
    }

}
