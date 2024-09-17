package src;

import org.junit.Assert;
import src.Calculator;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    double firstNumber = 1.0;
    double secondNumber = 2.0;
    double result;
    @org.junit.jupiter.api.Test
    void testAdd() {
         result = calculator.add(firstNumber,secondNumber);
        Assert.assertEquals(3.0, result, 0.1); // delta  (0.1) angiver hvor stor en margin tallet må lande forkert.
    }

    @org.junit.jupiter.api.Test
    void testSubtract() {
         result = calculator.subtract(firstNumber,secondNumber);
        Assert.assertEquals(-1.09, result, 0.1);
    }

    @org.junit.jupiter.api.Test
    void testMultiply() {
        result = calculator.multiply(firstNumber,secondNumber);
        Assert.assertEquals(2.0, result, 0.1);
    }

    @org.junit.jupiter.api.Test
    void testDivide() {
       result = calculator.divide(firstNumber,secondNumber);
        Assert.assertEquals(0.5, result, 0.1);
    }
}
