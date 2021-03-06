/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractions;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alonso del Arte, based on test class generated by NetBeans
 */
public class GaussianFractionTest {
    
    private static final Fraction ONE_HALF = new Fraction(1, 2);
    private static final Fraction TWO_THIRDS = new Fraction(2, 3);
    
    private static GaussianFraction operandA, operandB;
    
    @BeforeClass
    public static void setUpClass() {
        operandA = new GaussianFraction(ONE_HALF, TWO_THIRDS);
        operandB = new GaussianFraction(TWO_THIRDS, ONE_HALF);
    }

    /**
     * Test of getRealPart method, of class GaussianFraction.
     */
    @Test
    public void testGetRealPart() {
        System.out.println("getRealPart");
        GaussianFraction instance = null;
        Fraction expResult = null;
        Fraction result = instance.getRealPart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagPart method, of class GaussianFraction.
     */
    @Test
    public void testGetImagPart() {
        System.out.println("getImagPart");
        GaussianFraction instance = null;
        Fraction expResult = null;
        Fraction result = instance.getImagPart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plus method, of class GaussianFraction.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        GaussianFraction addend = null;
        GaussianFraction instance = null;
        GaussianFraction expResult = null;
        GaussianFraction result = instance.plus(addend);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minus method, of class GaussianFraction.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        GaussianFraction subtrahend = null;
        GaussianFraction instance = null;
        GaussianFraction expResult = null;
        GaussianFraction result = instance.minus(subtrahend);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of times method, of class GaussianFraction.
     */
    @Test
    public void testTimes() {
        System.out.println("times");
        GaussianFraction multiplicand = null;
        GaussianFraction instance = null;
        GaussianFraction expResult = null;
        GaussianFraction result = instance.times(multiplicand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividedBy method, of class GaussianFraction.
     */
    @Test
    public void testDividedBy() {
        System.out.println("dividedBy");
        GaussianFraction divisor = null;
        GaussianFraction instance = null;
        GaussianFraction expResult = null;
        GaussianFraction result = instance.dividedBy(divisor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of negate method, of class GaussianFraction.
     */
    @Test
    public void testNegate() {
        System.out.println("negate");
        GaussianFraction instance = null;
        GaussianFraction expResult = null;
        GaussianFraction result = instance.negate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class GaussianFraction.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        GaussianFraction instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toHTMLString method, of class GaussianFraction.
     */
    @Test
    public void testToHTMLString() {
        System.out.println("toHTMLString");
        GaussianFraction instance = null;
        String expResult = "";
        String result = instance.toHTMLString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toTeXString method, of class GaussianFraction.
     */
    @Test
    public void testToTeXString() {
        System.out.println("toTeXString");
        GaussianFraction instance = null;
        String expResult = "";
        String result = instance.toTeXString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class GaussianFraction.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        GaussianFraction instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class GaussianFraction.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        GaussianFraction instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
