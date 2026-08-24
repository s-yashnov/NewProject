package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5.0, calculator.add(2, 3), 0.0001);
        assertEquals(-1.0, calculator.add(-4, 3), 0.0001);
    }

    @Test
    void testSubtract() {
        assertEquals(1.0, calculator.subtract(4, 3), 0.0001);
        assertEquals(-7.0, calculator.subtract(-4, 3), 0.0001);
    }

    @Test
    void testMultiply() {
        assertEquals(12.0, calculator.multiply(4, 3), 0.0001);
        assertEquals(0.0, calculator.multiply(0, 5), 0.0001);
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), 0.0001);
        assertEquals(-2.5, calculator.divide(-5, 2), 0.0001);
    }

    @Test
    void testDivideByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
