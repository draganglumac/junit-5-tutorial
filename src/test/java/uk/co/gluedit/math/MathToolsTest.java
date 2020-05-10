package uk.co.gluedit.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.IntStream;

public class MathToolsTest {

    @Test
    @DisplayName("Test successful decimal conversion")
    void testConvertToDecimalSuccess() {
        double result = MathTools.convertToDecimal(3, 4);
        Assertions.assertEquals(0.75, result);
    }

    @Test
    @DisplayName("Test division by zero throws IllegalArgumentException")
    void testConvertToDecimalInvalidDenominator() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> MathTools.convertToDecimal(3, 0)
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 2, 4, 6, 8, 10, 100, 1000})
    @DisplayName("Test even")
    void testIsEvenTrueForEvenNumbers(int number) {
        Assertions.assertTrue(MathTools.isEven(number));
    }

    @ParameterizedTest
    @MethodSource("generateOddNumbers")
    void testIsEvenFalseForOddNumbers(int number) {
        Assertions.assertFalse(MathTools.isEven(number));
    }

    static IntStream generateOddNumbers() {
        return IntStream.iterate(1, i -> i + 2).limit(500);
    }
}
