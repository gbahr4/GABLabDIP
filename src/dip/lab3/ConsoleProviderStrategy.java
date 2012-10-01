
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author Greg Bahr
 * @version 2.0
 */
public class ConsoleProviderStrategy implements MessageProviderStrategy {
    
    public final String readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter text: ");
        String line = keyboard.nextLine();
        return line;
    }
    
}
