/**
 * <h1>Mac</h1>
 * This class is for the ICS211 Inheritance assignment.
 *
 * @author  Craig Opie
 * @version 1.0, 10/24/19
 * @class   Mac
 * @concept The core concept for this lesson is the ability to use inheritance.
 *
 */

 /**
  * <h2>Mac Class</h2>
  * Creates a Mac computer using the Computer class
  *
  * @param type String  Stores the type of Mac computer (ie. MacBook Pro).
  *
  */
public class Mac extends Computer {
    private String type;

    public Mac(double speed, int ram, String hhd, String os, String type) {
        this.speed = speed;
        this.ram = ram;
        this.hhd = hhd;
        this.os = os;
        this.type = type;
    }

    public String getType() {
        return(this.type);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void getDetails() {
        System.out.println("CPU Speed: " + this.speed + " GHz");
        System.out.println("RAM Size:  " + this.ram + " GB");
        System.out.println("HHD Size:  " + this.hhd);
        System.out.println("OS:        " + this.os);
        System.out.println("Type:      " + this.type);
    }
}
