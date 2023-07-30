package com.example.CalculatorTest;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {
    private final CalculatorServesImpl calculatorServes = new CalculatorServesImpl();
    public static Stream<Arguments> plusParams() {
        return Stream.of(
                Arguments.of(2,2,2+"+"+2+"="+(2+2)),
                Arguments.of(3,3,3+"+"+3+"="+(3+3)),
                Arguments.of(4,4,4+"+"+4+"="+(4+4))
                );
    }
    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of(8,2,8+"-"+2+"="+(8-2)),
                Arguments.of(8,3,8+"-"+3+"="+(8-3)),
                Arguments.of(8,4,8+"-"+4+"="+(8-4))
        );
    }
    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of(2,2,2+"*"+2+"="+(2*2)),
                Arguments.of(3,3,3+"*"+3+"="+(3*3)),
                Arguments.of(4,4,4+"*"+4+"="+(4*4))
        );
    }
    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of(6,2,6+"/"+2+"="+(6/2)),
                Arguments.of(6,3,6+"/"+3+"="+(6/3)),
                Arguments.of(6,1,6+"/"+1+"="+(6/1))
        );
    }
    @ParameterizedTest
    @MethodSource("plusParams")
    void plus(int num1,int num2, String ex) {
        String act = calculatorServes.plus(num1, num2);
        assertEquals(ex,act);
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    void minus(int num1,int num2, String ex) {
        String act = calculatorServes.minus(num1, num2);
        assertEquals(ex,act);
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    void multiply(int num1,int num2, String ex) {
        String act = calculatorServes.multiply(num1, num2);
        assertEquals(ex,act);
    }

    @ParameterizedTest
    @MethodSource("divideParams")
    void divide(int num1,int num2, String ex) {
        String act = calculatorServes.divide(num1, num2);
        assertEquals(ex,act);
    }
}