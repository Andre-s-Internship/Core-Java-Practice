package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Array2DTest {
    @Test
    @DisplayName("Test for finding max number 1")
    void testFindMaxHourglassOne() {
        int result = 19;
        int[][] arr = new int[][]{{1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0}, {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0}, {0, 0, 1, 2, 4, 0}};
        assertEquals(result, Array2D.findMaxHourGlass(arr));
    }


    @Test
    @DisplayName("Test for finding max number 2")
    void testFindMaxHourglassTwo() {
        int result = 7;
        int[][] arr = new int[][]{{1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
        assertEquals(result, Array2D.findMaxHourGlass(arr));
    }



    @Test
    @DisplayName("Test for finding an hourglass 1")
    void testFindHourGlassOne() {
        int[][] arr = new int[][]{{1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
        int[][] result = new int[][]{{1,1,1}, {0,1,0}, {1,1,1}};
        assertTrue(Arrays.deepEquals(result, Array2D.findHourGlass(arr, 0, 0)));
    }

    @Test
    @DisplayName("Test for finding an hourglass 2")
    void testFindHourGlassTwo() {
        int[][] arr = new int[][]{{1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0}, {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0}, {0, 0, 1, 2, 4, 0}};
        int[][] result = new int[][] {{2, 4, 4}, {0, 2, 0}, {1, 2, 4}};
        assertTrue(Arrays.deepEquals(result, Array2D.findHourGlass(arr, 3, 2)));
    }


    @Test
    @DisplayName("Test for sum of hourglass 1")
    void testSumHourglassOne() {
        int result = 19;
        int arr[][] = {{2, 4, 4}, {0, 2, 0}, {1, 2, 4}};
        assertEquals(result, Array2D.findSumHourglass(arr));
    }


    @Test
    @DisplayName("Test for sum of hourglass 2")
    void testSumHourglassTwo() {
        int result = 26;
        int arr[][] = {{3, 5, 7}, {0, 1, 0}, {3, 1, 6}};
        assertEquals(result, Array2D.findSumHourglass(arr));
    }

}