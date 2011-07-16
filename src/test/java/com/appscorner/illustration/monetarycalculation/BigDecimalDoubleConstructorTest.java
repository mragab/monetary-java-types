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
public class BigDecimalDoubleConstructorTest {

    @Test
    public void testBigDecimalOffOfDoubleConstructor() {
        String actual = new BigDecimal(1.1d).toString();
        System.out.println(">> new BigDecimal(1.1d) = " + actual);
        assertEquals(MoneyCalculationTest.message, "1.1", actual);
    }

    @Test
    public void testSubtractBigDecimalOffOfDoubleConstructor() {

        double two = 2.0d;
        BigDecimal twoBigDecimal = new BigDecimal(two);

        double oneDotOne = 1.1d;
        BigDecimal dotOneBigDecimal = new BigDecimal(oneDotOne);

        BigDecimal resultBigDecimal = twoBigDecimal.subtract(dotOneBigDecimal);

        System.out.println(">> Given:");
        System.out.println("    two (2.0d) = " + twoBigDecimal);
        System.out.println("    oneDotOne (1.1d) = " + dotOneBigDecimal);

        System.out.print(">> The result of: 2.0 - 1.1 = ");

        System.out.println(resultBigDecimal);

        String stringResult = resultBigDecimal.toString();
        System.out.println(">> Result converted to a String = " + stringResult);

        String expected = "0.9";
        String actual = stringResult;

        assertEquals(MoneyCalculationTest.message, expected, actual);

    }

}
