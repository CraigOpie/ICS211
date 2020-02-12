/**
 * <h1>Computer</h1>
 * This class is a superclass for the ICS211 Inheritance assignment.
 *
 * @author  Craig Opie
 * @version 1.0, 10/24/19
 * @class   Computer
 * @concept The core concept for this lesson is the ability to use inheritance.
 *
 */

 /**
  * <h2>Computer Class</h2>
  * Creates a computer object
  *
  * @param speed    double  Stores the speed of the processor in GHz.
  * @param ram      int     Stores the amount of RAM in the system in GB.
  * @param hhd      String  Stores the size of the hard drive with user defined input.
  * @param os       String  Stores the type of operating system on the computer.
  *
  */
 public class Computer
 {
     protected double speed;
     protected int ram;
     protected String hhd;
     protected String os;

     public Computer() {

     }

     public double getSpeed() {
         return(this.speed);
     }

     public int getRam() {
         return(this.ram);
     }

     public String getHhd() {
         return(this.hhd);
     }

     public String getOs() {
         return(this.os);
     }

     public void setSpeed(double speed) {
         this.speed = speed;
     }

     public void setRam(int ram) {
         this.ram = ram;
     }

     public void setHhd(String hhd) {
         this.hhd = hhd;
     }

     public void setOs(String os) {
         this.os = os;
     }
 }
