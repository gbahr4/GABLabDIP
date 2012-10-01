/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Greg Bahr
 * @version 3.0
 */
public interface TipCalculatorStrategy {
    
    public static enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    
    public abstract double getTip();
}
