/**
 * <h1>Windows</h1>
 * This class is for the ICS211 Inheritance assignment.
 *
 * @author  Craig Opie
 * @version 1.0, 10/24/19
 * @class   Windows
 * @concept The core concept for this lesson is the ability to use inheritance.
 *
 */


 /**
  * <h2>Windows Class</h2>
  * Creates a Windows computer using the Computer class
  *
  * @param manufacturer String  Stores the name of the manufacturer (ie. Dell).
  *
  */
 public class Windows extends Computer {
     private String manufacturer;

     public Windows(double speed, int ram, String hhd, String os, String manufacturer) {
         this.speed = speed;
         this.ram = ram;
         this.hhd = hhd;
         this.os = os;
         this.manufacturer = manufacturer;
     }

     public String getManufacturer() {
         return(this.manufacturer);
     }

     public void setManufacturer(String manufacturer) {
         this.manufacturer = manufacturer;
     }

     public void getDetails() {
         System.out.println("CPU Speed:    " + this.speed + " GHz");
         System.out.println("RAM Size:     " + this.ram + " GB");
         System.out.println("HHD Size:     " + this.hhd);
         System.out.println("OS:           " + this.os);
         System.out.println("Manufacturer: " + this.manufacturer);
     }
 }
