
package dip.lab3;

/**
 *
 * @author Greg Bahr
 * @version 1.0
 */
public class ConsoleRendererStrategy implements MessageRendererStrategy {
    public void writeOutput(String line) {
        System.out.println(line);
    }
}
