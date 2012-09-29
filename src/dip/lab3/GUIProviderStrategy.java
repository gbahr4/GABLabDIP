
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Greg Bahr
 * @Version 1.0
 */
public class GUIProviderStrategy implements MessageProviderStrategy {
    public String readInput() {
         String line = JOptionPane.showInputDialog(null, 
                 "Enter message here: "); 
         return line;
    }
}
