/**
 *
 */
package com.appscorner.illustration.monetarycalculation;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * @author pcrx4317
 * 
 */
public class BigDecimalStringConstructorTest {

    @Test
    public void testBigDecimalOffOfString() {
        String actual = new BigDecimal("1.1").toString();
        System.out.println("BigDecimal Off Of String: " + actual);
        assertEquals(MoneyCalculationTest.message, "1.1", actual);
    }

    @Test
    public void testSubtractBigDecimalOffOfStringWithNew() {

        String two = "2.00";
        BigDecimal twoBigDecimal = new BigDecimal(two);
        String dotOne = "0.10";
        BigDecimal dotOneBigDecimal = new BigDecimal(dotOne);

        BigDecimal resultBigDecimal = twoBigDecimal.subtract(dotOneBigDecimal);

        System.out.println("Given:");
        System.out.println("two=" + twoBigDecimal);
        System.out.println("oneDotOne=" + dotOneBigDecimal);

        System.out.println("");
        System.out.println("What is the result of: 2.00 - 0.10 ");

        System.out.print("inline calculated result = ");
        System.out.println(twoBigDecimal.subtract(dotOneBigDecimal));

        System.out.print("precalculated result = ");
        System.out.println(resultBigDecimal);

        String stringResult = resultBigDecimal.toString();
        System.out.println("Result converted to a String = " + stringResult);

        String expected = "1.90";
        String actual = stringResult;

        assertEquals(MoneyCalculationTest.message, expected, actual);

    }

}
