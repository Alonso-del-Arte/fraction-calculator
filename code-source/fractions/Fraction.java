/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractions;

import java.sql.SQLDataException;
import java.util.ArrayList;

import calculators.NumberTheoreticFunctionsCalculator;

/**
 *
 * @author AL
 */
public class Fraction {
    
    private final long fractNumer;
    private final long fractDenom;
    
    private static final int HASH_SEP = 65536;
    
    public long getNumerator() {
        return fractNumer;
    }
    
    public long getDenominator() {
        return fractDenom;
    }
    
    public Fraction plus(Fraction addend) {
        long interNumerA = this.fractNumer * addend.fractDenom;
        long interNumerB = addend.fractNumer * this.fractDenom;
        long newNumer = interNumerA + interNumerB;
        long newDenom = this.fractDenom * addend.fractDenom;
        return new Fraction(newNumer, newDenom);
    }
    
    public Fraction minus(Fraction subtrahend) {
        return this.plus(new Fraction(-subtrahend.fractNumer, subtrahend.fractDenom));
    }
    
    public Fraction times(Fraction multiplicand) {
        long newNumer = this.fractNumer * multiplicand.fractNumer;
        long newDenom = this.fractDenom * multiplicand.fractDenom;
        return new Fraction(newNumer, newDenom);
    }
    
    public Fraction dividedBy(Fraction divisor) throws SQLDataException {
        if (divisor.fractNumer == 0) {
            String exceptionMessage = "Dividing " + this.toString() + " by 0 results in an indeterminate number.";
            throw new SQLDataException(exceptionMessage);
        }
        long newNumer = this.fractNumer * divisor.fractDenom;
        long newDenom = this.fractDenom * divisor.fractNumer;
        return new Fraction(newNumer, newDenom);
    }
    
    public Fraction negate() {
        return new Fraction(-this.fractNumer, this.fractDenom);
    }
    
    public Fraction reciprocal() {
        return new Fraction(this.fractDenom, this.fractNumer);
    }
    
    @Override
    public String toString() {
        if (this.fractDenom == 1) {
            return Long.toString(this.fractNumer);
        } else {
            return (this.fractNumer + "/" + this.fractDenom);
        }
    }
    
    public String toHTMLString() {
        if (this.fractDenom == 1) {
            return Long.toString(this.fractNumer);
        } else {
            return ("<sup>" + this.fractNumer + "</sup>&frasl;<sub>" + this.fractDenom + "</sub>");
        }
    }
    
    public String toTeXString() {
        if (this.fractDenom == 1) {
            return Long.toString(this.fractNumer);
        } else {
            return ("\\frac{" + this.fractNumer + "}{" + this.fractDenom + "}");
        }
    }
    
    @Override
    public int hashCode() {
        long numerHash = fractNumer % HASH_SEP;
        long denomHash = fractDenom % HASH_SEP;
        return (int) (numerHash * HASH_SEP + denomHash);
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
        final Fraction other = (Fraction) obj;
        if (this.fractNumer != other.fractNumer) {
            return false;
        }
        return (this.fractDenom == other.fractDenom);
    }
    
    public double getNumericApproximation() {
        return ((double) this.fractNumer / (double) this.fractDenom);
    }
    
    // TODO: Write tests for the following cases: 5/4, 1, 1/15, 0, -3/2.
    public Fraction[] getEgyptianFractions() {
        ArrayList<Fraction> fractList = new ArrayList<>();
        long currDenom = 2;
        Fraction currPortion = this;
        Fraction currUnitFract, resetPortion;
        while (currPortion.fractNumer > 0) {
            currUnitFract = new Fraction(1, currDenom);
            resetPortion = currPortion.minus(currUnitFract);
            if (resetPortion.fractNumer >= 0) {
                fractList.add(currUnitFract);
                currPortion = resetPortion;
            }
            currDenom++;
        }
        Fraction[] fractArray = fractList.toArray(new Fraction[0]); // https://shipilev.net/blog/2016/arrays-wisdom-ancients/
        return fractArray;
    }
    
    /**
     * Implicit denominator constructor
     * @param numerator 
     */
    public Fraction(long numerator) {
        this.fractNumer = numerator;
        this.fractDenom = 1;
    }
    
    public Fraction(long numerator, long denominator) {
        if (denominator == 0) {
            String exceptionMessage = "Denominator 0 is not allowed.";
            throw new IllegalArgumentException(exceptionMessage);
        }
        long gcdNumDen = NumberTheoreticFunctionsCalculator.euclideanGCD(numerator, denominator);
        if (denominator < 0) {
            gcdNumDen *= -1;
        }
        this.fractNumer = numerator / gcdNumDen;
        this.fractDenom = denominator / gcdNumDen;
    }
    
}
