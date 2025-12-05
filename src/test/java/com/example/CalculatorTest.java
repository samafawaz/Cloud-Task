package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-4, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(4, 3));
        assertEquals(-7, calculator.subtract(-4, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, calculator.multiply(4, 3));
        assertEquals(-12, calculator.multiply(-4, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), 0.001);
        assertEquals(-2.0, calculator.divide(-6, 3), 0.001);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
