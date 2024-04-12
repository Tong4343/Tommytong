package com.example.calcuator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.calculator.Calculator;
import org.junit.jupiter.api.Test;
class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testSubtract() {
        assertEquals(-1, calculator.subtract(2, 3), "2 - 3 should equal -1");
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
    }
}
