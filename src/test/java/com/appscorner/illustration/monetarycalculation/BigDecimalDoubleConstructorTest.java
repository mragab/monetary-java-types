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
    public void testBigDecimalOffOfDoubleWithNew() {
        String actual = new BigDecimal(1.1d).toString();
        System.out.println("BigDecimal Off Of Double With New: " + actual);
        assertEquals(MoneyCalculationTest.message, "1.1", actual);
    }

    @Test
    public void testSubtractBigDecimalOffOfDoubleWithNew() {

        double two = 2.0;
        BigDecimal twoBigDecimal = new BigDecimal(two);
        double dotOne = 0.1;
        BigDecimal dotOneBigDecimal = new BigDecimal(dotOne);

        BigDecimal resultBigDecimal = twoBigDecimal.subtract(dotOneBigDecimal);

        System.out.println("Given:");
        System.out.println("two=" + twoBigDecimal);
        System.out.println("oneDotOne=" + dotOneBigDecimal);

        System.out.println("");
        System.out.println("What is the result of: 2.0 - 0.1 ");

        System.out.print("inline calculated result = ");
        System.out.println(twoBigDecimal.subtract(dotOneBigDecimal));

        System.out.print("precalculated result = ");
        System.out.println(resultBigDecimal);

        String stringResult = resultBigDecimal.toString();
        System.out.println("Result converted to a String = " + stringResult);

        String expected = "1.9";
        String actual = stringResult;

        assertEquals(MoneyCalculationTest.message, expected, actual);

    }

}
