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
public class BigDecimalDoubleValueOfTest {

    @Test
    public void testBigDecimalOffOfDoubleWithValueOfFactoryMethod() {
        String actual = BigDecimal.valueOf(1.1d).toString();
        System.out.println(">> BigDecimal.valueOf(1.1d) = " + actual);
        assertEquals(MoneyCalculationTest.message, "1.1", actual);
    }

    @Test()
    public void testSubtractBigDecimalOffOfDoubleValueOfFactoryMethod() {

        double two = 2.00d;
        BigDecimal twoBigDecimal = BigDecimal.valueOf(two);

        double oneDotOne = 1.10d;
        BigDecimal dotOneBigDecimal = BigDecimal.valueOf(oneDotOne);

        BigDecimal resultBigDecimal = twoBigDecimal.subtract(dotOneBigDecimal);

        System.out.println(">> Given:");
        System.out.println("    two (2.0d) = " + twoBigDecimal);
        System.out.println("    oneDotOne (1.1d) = " + dotOneBigDecimal);

        System.out.print(">> The result of: 2.00 - 1.10 = ");

        System.out.println(resultBigDecimal);

        String stringResult = resultBigDecimal.toString();
        System.out.println(">> Result converted to a String = " + stringResult);

        String expected = "0.9";
        String actual = stringResult;

        assertEquals(MoneyCalculationTest.message, expected, actual);

    }

}
