package com.example.CalculatorTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServesImplTest {
    CalculatorServesImpl calculatorServes = new CalculatorServesImpl();
    @Test
    void plus() {
        int num1 = 5;
        int num2 = 1;
        String ex = calculatorServes.plus(num1,num2);
        String act = 5 + "+" + 1 + "=" + (5 + 1);
        assertEquals(ex,act);
    }
    @Test
    void minus() {
        int num1 = 6;
        int num2 = 2;
        String act = calculatorServes.minus(num1,num2);
        String ex = 6 + "-" + 2 + "=" + (6 - 2);
        assertEquals(act,ex);
    }
    @Test
    void multiply() {
        int num1 = 5;
        int num2 = 2;
        String act = calculatorServes.multiply(num1,num2);
        String ex = 5 + "*" + 2 + "=" + (5 * 2);
        assertEquals(act,ex);
    }

    @Test
    void divisionByZero() {
        int num1 = 5;
        int num2 = 0;
        String exceptedMessage = "Деление на 0";
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculatorServes.divide(num1, num2);
        });
        assertEquals(exceptedMessage, exception.getMessage());
    }

    @Test
    void divide() {
        int num1 = 6;
        int num2 = 3;
        String act = calculatorServes.divide(num1,num2);
        String ex = 6 + "/" + 3 + "=" + (6 / 3);
        assertEquals(act,ex);
    }

}
