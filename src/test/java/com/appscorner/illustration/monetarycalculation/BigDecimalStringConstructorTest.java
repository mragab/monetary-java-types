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
        System.out.println(">> new BigDecimal(\"1.1\") = " + actual);
        assertEquals(MoneyCalculationTest.message, "1.1", actual);
    }

    @Test
    public void testSubtractBigDecimalOffOfStringConstructor() {

        String two = "2.00";
        BigDecimal twoBigDecimal = new BigDecimal(two);
        String oneDotOne = "1.10";
        BigDecimal dotOneBigDecimal = new BigDecimal(oneDotOne);

        BigDecimal resultBigDecimal = twoBigDecimal.subtract(dotOneBigDecimal);

        System.out.println(">> Given:");
        System.out.println("    two=" + twoBigDecimal);
        System.out.println("    oneDotOne=" + dotOneBigDecimal);

        System.out.print(">> The result of: 2.00 - 1.10 = ");

        System.out.println(resultBigDecimal);

        String stringResult = resultBigDecimal.toString();
        System.out.println(">> Result converted to a String = " + stringResult);

        String expected = "0.90";
        String actual = stringResult;

        assertEquals(MoneyCalculationTest.message, expected, actual);

    }

}
