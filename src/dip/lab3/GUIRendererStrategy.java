
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Greg Bahr
 * @version 2.0
 */
public class GUIRendererStrategy implements MessageRendererStrategy {
    public final void writeOutput(String line) {
        JOptionPane.showMessageDialog(null, line);
    }
}
