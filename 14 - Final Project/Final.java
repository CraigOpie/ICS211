/**
 * <h1>Searching</h1>
 * This class demonstrates in depth understanding of ICS 211.
 *
 * @author  Craig Opie
 * @version 1.0, 12/08/19
 * @throws  Exception
 * @class   Final
 * @concept The core concept for this lesson is to evaluate retained knowledge over the course.
 *
 */
 import java.util.Scanner;   // Required for user input
 import java.lang.Math;      // Used to generate random numbers to populate the intList
 import java.io.*;           // Used to save the list to file

 public class Final {

     // Program entry point
     public static void main(String[] args) throws Exception {

         // Create a list of twenty integers
         int[] intList = new int[20];
         intList = randomIntGenerator(intList);

         boolean found = false;
         boolean loop = true;
         while(loop) {
             System.out.println("1 - Display the list of integers");
             System.out.println("2 - Sort the list of integers");
             System.out.println("3 - Search for a number");
             System.out.println("4 - Save the list of integers to file");
             System.out.println("5 - Quit the program");

             int userInput = getUserInteger();

             switch(userInput) {
                 case 1:    displayList(intList);
                            System.out.println();
                            break;
                 case 2:    intList = sortList(intList);
                            displayList(intList);
                            System.out.println();
                            break;
                 case 3:    int userValue = getUserInteger();
                            found = searchList(intList, 0, intList.length-1, userValue);
                            if(found) System.out.println(Integer.toString(userValue) + " was found in the list.");
                            else System.out.println(Integer.toString(userValue) + " was not found in the list.");
                            System.out.println();
                            break;
                 case 4:    saveList(intList);
                            System.out.println();
                            break;
                 case 5:    loop = false;
                            break;
                 default:   System.out.println("Please choose a valid option from the menu.");
                            System.out.println();
             }
         }
     }

     private static int[] randomIntGenerator(int[] intList) {
         // Populate the list of integers with random numbers between 1 and 1000
         for (int i = 0; i < intList.length; i++) {
             intList[i] = (int)(Math.random() * (1000 - 1) + 1) + 1;
         }
         return intList;
     }

     private static int getUserInteger() {
         // Create scanner object to capture user input
         Scanner input_ = new Scanner(System.in);
         int userInput = 0;

         boolean validInput = false;
         while (validInput == false) {

             // Tell the user what you want for an input
             System.out.print("Please enter an integer: ");
             System.out.println();

             // Verify the user actually entered an integer
             try {
                 userInput = input_.nextInt();
                 validInput = true;
             }

             // The user did not enter a valid integer so inform them and clear the input buffer
             catch (Exception e) {
                 System.out.println("Error: Input must be an integer.  Please try again.");
                 input_.nextLine();
                 System.out.println();
             }
         }
         return userInput;
     }

     private static void displayList(int[] intList) {
         // Display the list to the screen
         System.out.print("The List: ");
         for (int i = 0; i < intList.length; i++) {
             System.out.print(" " + Integer.toString(intList[i]));
         }
         System.out.println();
     }

     private static int[] sortList(int[] intList) {
         // Create a loop that continues until the sort is complete
         boolean condition = true;
         while (condition) {

             // Assume the sort is complete unless a value's position is changed
             condition = false;
             for (int i = 0; i < (intList.length - 1); i++) {
                 int max_ = intList[i];
                 if (max_ >= intList[i + 1]) {
                     condition = true;
                     max_ = intList[i + 1];
                     intList[i + 1] = intList[i];
                     intList[i] = max_;
                 }
             }
         }
         return(intList);
     }

     private static boolean searchList(int[] intList, int lower_, int upper_, int value_) {
         // Search through the list and return true is value is found
         if (upper_ < lower_) return false;
         if (intList[upper_] == value_) return true;
         if (intList[lower_] == value_) return true;
         return searchList(intList, lower_ + 1, upper_ - 1, value_);
     }

     private static void saveList(int[] intList) {
         // Write the contents of the list to File
         String content = "";
         for (int i = 0; i < intList.length; i++) {
             content += (intList[i] + " ");
         }

         try {
             FileWriter outFile = new FileWriter("list.txt");
             outFile.write(content);
             outFile.close();
         }

         catch ( Exception e ) {
             System.out.println("File failed to save. ERROR: " + e.getLocalizedMessage());
             e.printStackTrace();
         }
     }
}
