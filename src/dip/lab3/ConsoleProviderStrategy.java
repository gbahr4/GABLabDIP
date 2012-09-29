
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author Greg Bahr
 * @version 1.0
 */
public class ConsoleProviderStrategy implements MessageProviderStrategy {
    
    public String readInput() {
        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();
        return line;
    }
    
}
