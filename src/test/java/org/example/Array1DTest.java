package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array1DTest {

    @Test
    @DisplayName("Test for array of length 3")
    void testArray1DOne() {
        String result = "10\n20\n30";
        assertEquals(result, Array1D.printArray(new int[]{10, 20, 30}));
    }

    @Test
    @DisplayName("Test for array of length 5")
    void testArray1DTwo() {
        String result = "10\n20\n30\n40\n50";
        assertEquals(result, Array1D.printArray(new int[]{10, 20, 30, 40, 50}));
    }

    @Test
    @DisplayName("Test for array of length 10")
    void testArray1DThree() {
        String result = "10\n20\n30\n40\n50\n60\n70\n80\n90\n100";
        assertEquals(result, Array1D.printArray(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100}));
    }

}