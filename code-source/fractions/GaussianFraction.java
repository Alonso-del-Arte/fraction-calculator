/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractions;

import java.util.Objects;

/**
 *
 * @author AL
 */
public class GaussianFraction {
    
    private final Fraction fractRe;
    private final Fraction fractIm;
    
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
    
    // STUB TO FAIL FIRST TEST
    public GaussianFraction negate() {
        return this;
    }
    
    // STUB TO FAIL FIRST TEST
    @Override
    public String toString() {
        return "Feature not implemented yet";
    }

    // STUB TO FAIL FIRST TEST
    public String toHTMLString() {
        return "Feature not implemented yet";
    }

    // STUB TO FAIL FIRST TEST
    public String toTeXString() {
        return "Feature not implemented yet";
    }
    
    @Override
    public int hashCode() {
        return this.fractRe.hashCode() * this.fractIm.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GaussianFraction other = (GaussianFraction) obj;
        if (!Objects.equals(this.fractRe, other.fractRe)) {
            return false;
        }
        return Objects.equals(this.fractIm, other.fractIm);
    }

    public GaussianFraction(Fraction realPart, Fraction imagPart) {
        this.fractRe = realPart;
        this.fractIm = imagPart;
    }
    
}
