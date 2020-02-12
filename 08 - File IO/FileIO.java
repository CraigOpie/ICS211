/**
 * <h1>File I/O</h1>
 * This class demonstrates in depth understanding of File I/O from the command line.
 *
 * @author  Craig Opie
 * @version 1.0, 11/02/19
 * @throws  IOException
 * @class   FileIO
 * @concept The core concept for this lesson is the ability to use File I/O from the command line.
 *
 */
 import java.io.*;
 import java.util.Scanner;

 public class FileIO {

     // Program entry point
     public static void main(String[] args) throws IOException {

         // Create a list of twenty integers
         int[] intList = new int[20];

         // Populate the list of integers with random numbers between 1 and 1000
         String content = "";
         for (int i = 0; i < intList.length; i++) {
             intList[i] = (int)(Math.random() * (1000 - 1) + 1) + 1;
             content += (intList[i] + " ");
         }

         // Display the list to the screen
         System.out.print("List before writing to file: ");
         for (int i = 0; i < intList.length; i++) {
             System.out.print(" " + Integer.toString(intList[i]));
         }
         System.out.println();

         // Write the contents of the list to File
         FileWriter outFile = new FileWriter("temp.txt");
         outFile.write(content);
         outFile.close();

         // Load the list from the file
         System.out.print("List loaded from file:        ");
         File file = new File("temp.txt");
         Scanner fromFile = new Scanner(file);
         String inFile = fromFile.nextLine();
         while (fromFile.hasNext()) {
             inFile = inFile.concat(fromFile.nextLine());
         }
         fromFile.close();

         // Print the file contents to the screen
         System.out.print(inFile);
         System.out.println();
     }
 }
