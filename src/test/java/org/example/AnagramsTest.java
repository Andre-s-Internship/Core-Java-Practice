package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {
    @Test
    @DisplayName("Test for ABC abc")
    void testAnagramOne() {
        assertTrue(Anagrams.isAnagram("ABC", "abc"));
    }

    @Test
    @DisplayName("Test for aNaGrAm MaRgAnA")
    void testAnagramTwo() {
        assertTrue(Anagrams.isAnagram("aNaGrAm", "MaRgAnA"));
    }

    @Test
    @DisplayName("Test for acb ABC")
    void testAnagramThree() {
        assertTrue(Anagrams.isAnagram("acb", "ABC"));
    }

    @Test
    @DisplayName("Test for anagram anagra")
    void testAnagramFour() {
        assertFalse(Anagrams.isAnagram("anagram", "anagra"));
    }

}