package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyFormatterTest {

    @Test
    @DisplayName("Test for 12")
    void testFormatterOne() {
        String result = "US: $12.00\nIndia: ₹12.00\nChina: ¥12.00\nFrance: 12,00 €";
        assertEquals(CurrencyFormatter.printResult(12), result);
    }

    @Test
    @DisplayName("Test for 10.9")
    void testFormatterTwo() {
        String result = "US: $10.90\nIndia: ₹10.90\nChina: ¥10.90\nFrance: 10,90 €";
        assertEquals(CurrencyFormatter.printResult(10.9), result);
    }
}