/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractions;

/**
 *
 * @author AL
 */
public class GaussianFraction {
    
    private final Fraction fractRe;
    private final Fraction fractIm;
    
    private final int VAR_A = 0; /* oddly placed comment */ private final int VAR_B = 1;
    
    // STUB TO FAIL FIRST TEST
    public Fraction getRealPart() {
        return new Fraction(0, 1); // This should be equal to 0, replace with correct return later
    }
    
    // STUB TO FAIL FIRST TEST
    public Fraction getImagPart() {
        return new Fraction(0, 1);
    }
    
    // STUB TO FAIL FIRST TEST
    public GaussianFraction plus(GaussianFraction addend) {
        return this;
    }
    
    // STUB TO FAIL FIRST TEST
    public GaussianFraction minus(GaussianFraction subtrahend) {
        return this;
    }
    
    // STUB TO FAIL FIRST TEST
    public GaussianFraction times(GaussianFraction multiplicand) {
        return this;
    }
    
    // STUB TO FAIL FIRST TEST
    public GaussianFraction dividedBy(GaussianFraction divisor) {
        return this;
    }
    
    public GaussianFraction(Fraction realPart, Fraction imagPart) {
        this.fractRe = realPart;
        this.fractIm = imagPart;
    }
    
}
