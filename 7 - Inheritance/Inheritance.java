/**
 * <h1>Inheritance</h1>
 * This class demonstrates in depth understanding of inheritance.
 *
 * @author  Craig Opie
 * @version 1.0, 10/24/19
 * @class   Inheritance
 * @concept The core concept for this lesson is the ability to use inheritance.
 *
 */

 /**
  * <h2>Inheritance Class</h2>
  * Demonstrates inheritance.
  *
  */
 public class Inheritance {
     public static void main(String[] args) {
         // Create two computer objects
         Windows computer1 = new Windows(5.0, 64, "1TB", "Windows XP Pro", "Asus");
         Mac computer2 = new Mac(4.0, 32, "500GB", "OS X", "MacBook Pro");

         // Show the details that were entered by default
         System.out.println("Displaying the Windows machine as created.");
         computer1.getDetails();
         System.out.println();

         // Show the details as they are modified
         System.out.println("Displaying the Windows machine as modified.");
         computer1.setSpeed(4.5);
         System.out.println(computer1.getSpeed());
         computer1.setRam(32);
         System.out.println(computer1.getRam());
         computer1.setHhd("500GB");
         System.out.println(computer1.getHhd());
         computer1.setOs("Windows 10");
         System.out.println(computer1.getOs());
         computer1.setManufacturer("Dell");
         System.out.println(computer1.getManufacturer());
         System.out.println();

         // Show the details that were entered by default
         System.out.println("Displaying the Apple computer as created.");
         computer2.getDetails();
         System.out.println();

         // Show the details as they are modified
         System.out.println("Displaying the Apple computer as modified.");
         computer2.setSpeed(3.5);
         System.out.println(computer2.getSpeed());
         computer2.setRam(16);
         System.out.println(computer2.getRam());
         computer2.setHhd("256GB");
         System.out.println(computer2.getHhd());
         computer2.setOs("Snow Lepard");
         System.out.println(computer2.getOs());
         computer2.setType("MacBook Air");
         System.out.println(computer2.getType());
         System.out.println();

         // Show the details as they are in the final configuration
         System.out.println("Displaying the final output for both machines.");
         System.out.println("Computer 1:");
         computer1.getDetails();
         System.out.println("Computer 2:");
         computer2.getDetails();
         System.out.println();
     }
 }
