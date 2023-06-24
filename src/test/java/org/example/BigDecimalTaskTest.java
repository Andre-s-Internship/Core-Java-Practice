package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BigDecimalTaskTest {

    @Test
    @DisplayName("Test for BigDecimalList")
    void testBigDecimalList() {
        String result = "90\n" +
                "56.6\n" +
                "50\n" +
                "9\n" +
                "02.34\n" +
                "0.12\n" +
                ".12\n" +
                "0\n" +
                "000.000\n" +
                "-100\n";
        String[] input = {"9" ,"-100" , "50" , "0" , "56.6" , "0.12" ,"90" , ".12" , "02.34" , "000.000"};
        assertEquals(result, BigDecimalTask.sortBigDecimal(Arrays.asList(input)));
    }
}