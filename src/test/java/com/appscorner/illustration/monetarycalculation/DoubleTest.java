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
    public void testDoubleCalculations() {

        double two = 2.00;
        double dotOne = 1.10;
        double result = two - dotOne;

        System.out.println("Given:");
        System.out.println("two=" + two);
        System.out.println("dotOne=" + dotOne);

        System.out.println("");
        System.out.println("What is the result of: 2.00 - 0.10 ");

        System.out.print("inline calculated result = ");
        System.out.println(two - dotOne);

        System.out.print("precalculated result = ");
        System.out.println(result);

        String stringResult = Double.valueOf(result).toString();
        System.out.println("Result converted to a String = " + stringResult);

        String expected = "1.9";
        String actual = stringResult;

        assertEquals(message, expected, actual);
    }

}
