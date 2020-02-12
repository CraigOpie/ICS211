/**
 * <h1>Error Handling</h1>
 * This class takes user input and demonstrates exception handling.
 *
 * @author  Craig Opie
 * @version 1.0, 09/06/19
 * @throws  Exception
 * @class   ErrorHandling
 * @concept The core concept for this lesson is the ability to handle exceptions.
 *
 */
import java.util.Scanner;   // Required for user input

/**
 * <h2>Error Handling Class</h2>
 * Provides exception handling for user input.
 *
 * @param userInput  Stores the user's input for printing (Global Variable).
 * @param condition  Specifies if the condition to exit the loop exists (Global Variable).
 *
 */
public class ErrorHandling {

    // Program entry point
    public static void main(String[] args) throws Exception {

        // Inform the user about this program
        System.out.println("This program takes user input.  If the input is not an integer, then exception handling prevents the program from failing.");

        // Create scanner object to capture user input
        Scanner input_ = new Scanner(System.in);
        int userInput = 0;

        // Create a loop that continues untill the user enters a valid integer
        boolean condition = false;
        while (condition == false) {

            // Tell the user what you want for an input
            System.out.print("Please enter an integer: ");

            // Verify the user actually entered an integer
            try {
                userInput = input_.nextInt();
                condition = true;
            }

            // The user did not enter a valid integer so inform them and clear the input buffer
            catch (Exception e) {
                System.out.println("Error: Input must be an integer.  Please try again.");
                input_.nextLine();
                System.out.println();
            }
        }

        // Let the user know their input was valid and give them salutations prior to exiting the program
        System.out.println("Thank you.  You entered " + userInput + ".");
        System.out.println("Have a great day.");
        System.out.println();
    }
}
