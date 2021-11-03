/* NameDialog.java -- Gets the user's name and the displays a dialog box
 * welcoming the user to my church's website.
 * CSIS 212-01
 * Citations -- used Fig 2.19 of "Java How to Program" as the foundation for my
 * solution.
 */

/**
 *
 * @author Prof Terri Sipantzi
 */
import javax.swing.JOptionPane;

public class NameDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Prof Terri Sipantzi -- Tutorial 1-1");
        // prompt user to enter name
        String name = JOptionPane.showInputDialog("What is your name?");
		String verseOfDay = "John 3:16";
        
        // create the message
        String message = String.format("Welcome, %s, to Heritage Baptist Church!%n", 
			name);
		message += String.format("The Scripture for the Day is: %s%n", verseOfDay);
        
        // display the message
        JOptionPane.showMessageDialog(null, message);
    }
    
}
