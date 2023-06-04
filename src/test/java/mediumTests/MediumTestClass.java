package mediumTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class MediumTestClass {

    Calculator calc = new Calculator();

    //TODO (**)
    //add tests for new method - average value
    @Test(groups = {"Smoke"})
    public void testAverageValue() {
        int actualResult = calc.avg(10, 5, 6);
        assertEquals("(10 + 5 +6) / 3 must be 7", 7, actualResult);
    }

    //TODO (**)
    //add tests for new method - even or odd
    @Test
    public void testEvenOrOdd() {
        boolean actualResult = calc.isEvenNumber(10);
        assertTrue("10 % 2 must be 0", actualResult);
    }

    @Test
    public void testGetBiggerNumber() {
        int actualResult = calc.getBiggerNumber(10, 5);
        assertEquals("10 > 5", 10, actualResult);
    }

}
