package simpleTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class SimpleTestClass {

    Calculator calc = new Calculator();

    @Test(groups = {"Regression"})
    public void testAddTwoPositiveValues() {
        int actualResult = calc.add(10, 5);
        assertEquals("10 + 5 must be 15", 15, actualResult);
    }

    @Test
    public void testSubtraction() {
        int actualResult = calc.sub(10, 5);
        assertEquals("10 - 5 must be 5", 5, actualResult);
    }

    @Test
    public void testMultiplication() {
        int actualResult = calc.mult(10, 5);
        assertEquals("10 * 5 must be 50", 50, actualResult);
    }

    @Test
    public void testDivision() {
        int actualResult = calc.div(10, 5);
        assertEquals("10 / 5 must be 2", 2, actualResult);
    }

    @Test
    public void testSquareRoot() {
        double actualResult = calc.sqrt(10);
        assertEquals("√10 must be 3.1622776601683795", 3.1622776601683795, actualResult);
    }

    @Test
    public void testExponent() {
        double actualResult = calc.pow(10);
        assertEquals("10^2 must be 100.0", 100.0, actualResult);
    }

}
