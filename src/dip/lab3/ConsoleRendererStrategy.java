
package dip.lab3;

/**
 *
 * @author Greg Bahr
 * @version 2.0
 */
public class ConsoleRendererStrategy implements MessageRendererStrategy {
    public final void writeOutput(String line) {
        System.out.println(line);
    }
}
