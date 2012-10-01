
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Greg Bahr
 * @Version 2.0
 */
public class GUIProviderStrategy implements MessageProviderStrategy {
    public final String readInput() {
         String line = JOptionPane.showInputDialog(null, 
                 "Enter message here: "); 
         return line;
    }
}
