
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Greg Bahr
 * @version 1.0
 */
public class GUIRendererStrategy implements MessageRendererStrategy {
    public void writeOutput(String line) {
        JOptionPane.showMessageDialog(null, line);
    }
}
