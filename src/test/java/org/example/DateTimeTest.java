package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeTest {
    @Test
    @DisplayName("Test for Jun 20 2023")
    void testDateOne() {
        String result = DateTime.findDay(21, 06, 2023);
        assertEquals("WEDNESDAY", result);
    }

    @Test
    @DisplayName("Test for Jan 2 2021")
    void testDateTwo() {
        String result = DateTime.findDay(2, 1, 2021);
        assertEquals("SATURDAY", result);
    }

    @Test
    @DisplayName("Test for Dec 9 1991")
    void testDateThree() {
        String result = DateTime.findDay(9, 12, 1991);
        assertEquals("MONDAY", result);
    }

    @Test
    @DisplayName("Test for Feb 5 2001")
    void testDateFour() {
        String result = DateTime.findDay(05, 02, 2001);
        assertEquals("MONDAY", result);
    }

}