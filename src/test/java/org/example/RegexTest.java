package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexTest {

    @Test
    @DisplayName("Test for valid")
    void testRegexOne(){
        String result = "Valid";
        assertEquals(result, Regex.isValidIPAddress("192.08.145.01"));
    }

    @Test
    @DisplayName("Test for text input")
    void testRegexTwo(){
        String result = "Not valid";
        assertEquals(result, Regex.isValidIPAddress("a.b.c.d"));
    }

    @Test
    @DisplayName("Test for input greater than 255")
    void testRegexThree(){
        String result = "Not valid";
        assertEquals(result, Regex.isValidIPAddress("888.08.145.01"));
    }

    @Test
    @DisplayName("Test for longer input")
    void testRegexFour(){
        String result = "Not valid";
        assertEquals(result, Regex.isValidIPAddress("192.08.145.01.98"));
    }

}