/**
 * Class to unit test the Greeting class
 *
 * @author pwaite
 */

public class TestGreeting {

    /**
     * Verify that given a string name, e.g. "Bob", the helloName method returns a greeting of the form "Hello Bob!".
     *
     * @param args command line arguments (not used in this case)
     */

    public static void main(String[] args) {

        // TEST CASE 1 - Bob

        // 1. Instantiate the class to be tested
        Greeting greeting = new Greeting();

        // 2. Set up an conditions necessary for testing
        String inputName = "Bob";

        // 3. Create variable to hold the expected result
        String expectedGreeting = "Hello Bob!";

        // 4. Create a variable to hold the actual result
        String actualGreeting = null;

        // 5. Run the method to be tested and assign the result to the actual result variable
        actualGreeting = greeting.helloName(inputName);

        // 6. Verify the result and ouput an appropriate message indicating the condition tested and "success" or "fail"
        System.out.println();
        System.out.println("******  Case 1 ******");

        if (expectedGreeting.equals(actualGreeting)) {
            System.out.println("The helloName test for Bob PASSED");
        } else {
            System.out.println("The helloName test for Bob FAILED. Expected: " + expectedGreeting + " But the actual result was: " + actualGreeting);
        }

        // Repeat the steps above for all provided examples and pathways/conditions to ensure each line of the code to be tested is executed and verified.

        // TEST CASE 2 - Alice
        // 1. Instantiate the class to be tested
        greeting = new Greeting();

        // 2. Set up an conditions necessary for testing
        inputName = "Alice";

        // 3. Create variable to hold the expected result
        expectedGreeting = "Hello Alice!";

        // 4. Create a variable to hold the actual result
        actualGreeting = null;

        // 5. Run the method to be tested and assign the result to the actual result variable
        actualGreeting = greeting.helloName(inputName);

        // 6. Verify the result and ouput an appropriate message indicating the condition tested and "success" or "fail"
        System.out.println();
        System.out.println("******  Case 2 ****** helloName(\"Alice\") → \"Hello Alice!\"");

        if (expectedGreeting.equals(actualGreeting)) {
            System.out.println("The helloName test for Alice PASSED");
        } else {
            System.out.println("The helloName test for Alice FAILED. Expected: " + expectedGreeting + " But the actual result was: " + actualGreeting);
        }

        // TEST CASE 3 - X
        // 1. Instantiate the class to be tested
        greeting = new Greeting();

        // 2. Set up an conditions necessary for testing
        inputName = "X";

        // 3. Create variable to hold the expected result
        expectedGreeting = "Hello X!";

        // 4. Create a variable to hold the actual result
        actualGreeting = null;

        // 5. Run the method to be tested and assign the result to the actual result variable
        actualGreeting = greeting.helloName(inputName);

        // 6. Verify the result and ouput an appropriate message indicating the condition tested and "success" or "fail"
        System.out.println();
        System.out.println("******  Case 3 ****** helloName(\"X\") → \"Hello X!\"");

        if (expectedGreeting.equals(actualGreeting)) {
            System.out.println("The helloName test for X PASSED");
        } else {
            System.out.println("The helloName test for X FAILED. Expected: " + expectedGreeting + " But the actual result was: " + actualGreeting);
        }

    }
}


	
	
	
	