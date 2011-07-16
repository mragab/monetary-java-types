/**
 *
 */
package com.appscorner.illustration.monetarycalculation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author pcrx4317
 * 
 */
public class DoubleTest {

    private final String message = "Binary floating-point is partiqularly ill-suited to monetary calculations, "
            + "at it is impossible to represent 0.1 or any other negative power of 10 exactly as a"
            + " finite length binary fraction [Java Puzzlers, page 8]";

    @Test
    public void testDoubleValueOfOneDotOne() {
        String actual = Double.valueOf(1.1d).toString();
        System.out.println(">> Double.valueOf(1.1d) = " + actual);
        assertEquals(MoneyCalculationTest.message, "1.1", actual);
    }

    @Test
    public void testDoubleValueOfDotNine() {
        String actual = Double.valueOf(0.9d).toString();
        System.out.println(">> Double.valueOf(0.9d) = " + actual);
        assertEquals(MoneyCalculationTest.message, "0.9", actual);
    }

    @Test
    public void testNewDoubleOneDotOne() {
        String actual = new Double(1.1d).toString();
        System.out.println(">> new Double(1.1d) = " + actual);
        assertEquals(MoneyCalculationTest.message, "1.1", actual);
    }

    @Test
    public void testNewDoubleDotNine() {
        String actual = new Double(0.9d).toString();
        System.out.println(">> new Double(0.9d) = " + actual);
        assertEquals(MoneyCalculationTest.message, "0.9", actual);
    }

    @Test
    public void testSubtractDouble() {

        double two = 2.00d;
        double oneDotOne = 1.10d;
        double result = two - oneDotOne;

        System.out.println(">> Given:");
        System.out.println("    two (2.0d) = " + two);
        System.out.println("    dotOne (1.1d) = " + oneDotOne);

        System.out.print(">> The result of: 2.00 - 1.10 = ");

        System.out.println(result);

        String stringResult = Double.valueOf(result).toString();
        System.out.println(">> Result converted to a String = " + stringResult);

        String expected = "0.9";
        String actual = stringResult;

        assertEquals(message, expected, actual);
    }

}
