package simpleTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class SimpleTestClass {

    Calculator calculator = new Calculator();

    @Test(groups = {"Regression"})
    public void testAddTwoPositiveValues() {
        int actualResult = calculator.add(10, 5);
        assertEquals("10 + 5 must be 15", 15, actualResult);
    }

    @Test
    public void testSubtraction() {
        int actualResult = calculator.sub(10, 5);
        assertEquals("10 - 5 must be 5", 5, actualResult);
    }

    @Test
    public void testMultiplication() {
        int actualResult = calculator.mult(10, 5);
        assertEquals("10 * 5 must be 50", 50, actualResult);
    }

    @Test
    public void testDivision() {
        int actualResult = calculator.div(10, 5);
        assertEquals("10 / 5 must be 2", 2, actualResult);
    }

    @Test
    public void testSquareRoot() {
        double actualResult = calculator.sqrt(10);
        assertEquals("√10 must be 3.1622776601683795", 3.1622776601683795, actualResult);
    }

    @Test
    public void testExponent() {
        double actualResult = calculator.pow(10);
        assertEquals("10^2 must be 100.0", 100.0, actualResult);
    }

}
