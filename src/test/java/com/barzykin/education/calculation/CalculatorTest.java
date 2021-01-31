package com.barzykin.education.calculation;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    @Test
    public void sumPositive() {
        //given
        int a = 4;
        int b = 5;
        int expectedResult = 9;
        //when
        int actualResult = Calculator.sum(a, b);
        //then
        assertEquals(expectedResult, actualResult);
    }
}