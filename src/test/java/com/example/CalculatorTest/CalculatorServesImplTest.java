package com.example.CalculatorTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServesImplTest {
    private int num1 = 5;
    private int num2 = 1;
    CalculatorServesImpl calculatorServes = new CalculatorServesImpl();
    @Test
    void plus() {
        String act = calculatorServes.plus(num1,num2);
        String ex = num1 + "+" + num2 + "=" + (num1 + num2);
        assertEquals(act,ex);
    }
    @Test
    void minus() {
        String act = calculatorServes.minus(num1,num2);
        String ex = num1 + "-" + num2 + "=" + (num1 - num2);
        assertEquals(act,ex);
    }
    @Test
    void multiply() {
        String act = calculatorServes.multiply(num1,num2);
        String ex = num1 + "*" + num2 + "=" + (num1 * num2);
        assertEquals(act,ex);
    }

    @Test
    void divisionByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String divide = calculatorServes.divide(num1, num2);
        });
    }
    @Test
    void divide() {
        String act = calculatorServes.divide(num1,num2);
        String ex = num1 + "/" + num2 + "=" + (num1 / num2);
        assertEquals(act,ex);
    }
//or

    @Test
    void divideVariantTwo() {
        if (num2 == 0) {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                String divide = calculatorServes.divide(num1, num2);
            });
        }else {
            String act = calculatorServes.divide(num1,num2);
            String ex = num1 + "/" + num2 + "=" + (num1 / num2);
            assertEquals(act,ex);
        }

    }
}
