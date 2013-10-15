package lab1;

import javax.swing.JOptionPane;


/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;
    private final String PARAM_ERR = "Field cannot be null or zero length";
    private static boolean error=true;
    private  static String lastName;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        while (error){
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        lastName = app.extractLastName(fullName);
        }
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
       
    }
    
    public String extractLastName(String fullName) {
        String[] nameParts = fullName.split(" ");
        if(fullName == null || fullName.length() == 0||nameParts.length==0) {
            error=true;
           String msg = "Please Enter fisrtname (space) lastname";
        JOptionPane.showMessageDialog(null, msg); 
        }else{error=false;}
        if (error){return(nameParts[0]="no entry");}else{
        return nameParts[LAST_NAME_IDX];}

   
    }
}
