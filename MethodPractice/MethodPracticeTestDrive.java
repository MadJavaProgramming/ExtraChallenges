/**
 * Provides a way to test out each method of the MethodPractice class
 *
 * @author Paula Waite
 */
public class MethodPracticeTestDrive {
    /**
     * Instantiate a MethodPractice object
	 * Call the various mehtods on MethodPractice to demonstrate that each one functions correctly
     *
     * @param args command line arguments (not used in this case)
     */
		
	public static void main(String[] args) {
		
		// Instantiate a MethodPractice object
		MethodPractice practice = new MethodPractice();
		
		// 1. Test the CalculateDifferenceFromTen method
		
		// Create a variable for the input number
		int inputInt = 4;
		
		// Create a variable for the expected returned value
		int expectedValue = 6;
		
		// Write out a little information about the method to be called 
		System.out.println("********* Calling CalculateDifferenceFromTen: *********");
		System.out.println("          Input: " + inputInt);
		System.out.println("          Expected output: " + expectedValue);
		
		// Call the method
		int actualDifference = practice.calculateDifferenceFromTen(inputInt);
		System.out.println("          The actual returned value is: " + actualDifference);
		
		// Write out a blank line to separate the "tests"
		System.out.println();
		
		//TODO Add calls to the methods you write in MethodPractice. 
		
	}

}
