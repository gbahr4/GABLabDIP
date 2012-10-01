/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Greg Bahr
 * @version 2.0
 */
public class TipCalculatorService {
    private TipCalculatorStrategy tipCalculatorStrategy; 

    public TipCalculatorService(TipCalculatorStrategy tipCalculatorStrategy) {
        this.tipCalculatorStrategy = tipCalculatorStrategy;
    }

    public void setTipCalculatorStrategy(TipCalculatorStrategy 
            tipCalculatorStrategy) {
        this.tipCalculatorStrategy = tipCalculatorStrategy;
    }
    
    
    public double getTip() {
        
        return tipCalculatorStrategy.getTip();
    }
}
