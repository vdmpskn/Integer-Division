package com.foxminded.vdmpskn.integerdivison;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.InputMismatchException;
import java.util.Scanner;

class DivisionCreatorTest {
    DivisionCreator divisionCreator = new DivisionCreator();

    @Test
    void shouldMakeDivision() {
        String expected =   "_17491│40\n" +
                " 160  │---\n" +
                " ---  │437\n" +
                " _149\n" +
                "  120\n" +
                "  ---\n" +
                "  _291\n" +
                "   280\n" +
                "   ---\n" +
                "    11\n";
        assertEquals(expected, divisionCreator.createDivision(17491, 40));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            divisionCreator.createDivision(1034, 0);
        });
    }

    @Test
    void testDividentLessThenDivisor() {
        assertThrows(IllegalArgumentException.class, () -> {
            divisionCreator.createDivision(1034, 2048);
        });
    }

    @ParameterizedTest
    @CsvSource({
            "-1034, 15",
            "1034, -15",
            "-1034, -15"
    })
    void testInputNumberWithNegativeValue(int dividend, int divisor) {
        assertThrows(IllegalArgumentException.class, () -> {
            divisionCreator.createDivision(dividend, divisor);
        });
    }

}
