/**
 * <h1>Recursion</h1>
 * This class demonstrates proper recursion techniques:
 * It must have a base case.
 * It must change it's value in the direction of the base case.
 * It must call itself.
 *
 * @author  Craig Opie
 * @version 1.0, 09/13/19
 * @throws  Exception
 * @class   Recursion
 * @concept The core concept for this lesson is the ability to use recursion.
 *
 */
import java.util.Scanner;     // Required for user input
import java.util.ArrayList;   // Used for list manipulations
import java.util.Collections; // Used to sort the ArrayList

/**
 * <h2>Recursion Class</h2>
 * Demonstrates proper recursion techniques.
 *
 * @param userInput  Stores the user's input for printing (Local Variable).
 * @param sumValue   Stores the sum of all even integers less than or equal to the user's input (Local Variable).
 * @param condition  Specifies if the condition to exit the loop exists (Local Variable).
 * @param intList    Stores all of the integers added together during recursion (Global List).
 * @param output_    Stores the final output string for the user to view (Local Variable).
 * @param exit_      Specifies if the condition to exit the program exists (Local Variable).
 *
 */
public class Recursion {

    // Create global list
    static ArrayList<Integer> intList = new ArrayList<Integer>();

    // Program entry point
    public static void main(String[] args) throws Exception {

        // Inform the user about this program
        System.out.println("This program demonstrates proper recursion techniques by accepting an integer from the user and producing the sum of all even numbers less than or equal to that value.");

        // Create scanner object to capture user input
        Scanner input_ = new Scanner(System.in);

        // Create overall program loop
        boolean exit_ = false;
        while (exit_ == false) {
            String output_ = "";
            int userInput = 0;
            int sumValue = 0;

            // Create a loop that continues untill the user enters a valid integer
            boolean condition = false;
            while (condition == false) {

                // Tell the user what you want for an input
                System.out.print("Please enter an integer ('0' to quit): ");

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

            // Check to see if the user wants to exit
            if (userInput == 0) {
                exit_ = true;
                System.out.println();
                break;
            }

            // Perform the summation recursion with the valid integer input
            sumValue = Calculate(userInput);

            // Sort intList from low to high
            Collections.sort(intList);

            // Let the user know their input, the summation value, and give them salutations prior to exiting the program
            System.out.println("You entered " + userInput + ":");

            // Build the output string for the user to view
            output_ += Integer.toString(intList.get(0));
            for (int i = 1; i < intList.size(); i++) {
                output_ += " + " + Integer.toString(intList.get(i));
            }
            output_ += " = " + Integer.toString(sumValue) + ".";

            // Print the final output string to the screen
            System.out.println(output_);
            System.out.println();
        }
    }

    /**
     * <h2>Calculate</h2>
     * This method returns the sum of all even integers less than or equal to the user's input.
     *
     * @param  x   This is the user's integer input.
     * @return int This returns the final summation.
     *
     */
    public static int Calculate(int x) {

        // Base case
        if (x <= 1) return x;

        // Determine if the user's input is even and then perform recursion
        if (x % 2 != 0) x -= 1;
        intList.add(x);
        return(x + Calculate(x - 2));
    }
}
