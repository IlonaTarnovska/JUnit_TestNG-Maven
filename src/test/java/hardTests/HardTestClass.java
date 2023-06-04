package hardTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HardTestClass {

    Calculator calc = new Calculator();

    //TODO (**)
    //add tests for new method - divide by zero case
    @Test
    public void testMultipleParams() {
        int actualResult = calc.multipleParams(10, 5, 7, 3);
        assertEquals("sum of 10+5+7+3 should be 25", 25, actualResult);
    }

    //TODO (**)
    //add tests for new method - addition with multiple parameters

    @Test
    public void testDivideByZero() {
        int actualResult = calc.divideByZero(10, 0);
        assertEquals("10 / 0 must be -100", -100, actualResult);
    }

}
