package org.example;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static junit.framework.TestCase.assertEquals;

public class PrimeNumberTest {

    @Test
    @DisplayName("Test for 11")
    public void testPrimeOne() {
        assertEquals("Prime", PrimeNumber.isPrime(11));
    }

    @Test
    @DisplayName("Test for 2")
    public void testPrimeTwo() {
        assertEquals("Prime", PrimeNumber.isPrime(2));
    }

    @Test
    @DisplayName("Test for 12")
    public void testPrimeThree() {
        assertEquals("Is not prime", PrimeNumber.isPrime(12));
    }

    @Test
    @DisplayName("Test for 128")
    public void testPrimeFour() {
        assertEquals("Is not prime", PrimeNumber.isPrime(128));
    }

    @Test
    @DisplayName("Test for 13")
    public void testPrimeFive() {
        assertEquals("Prime", PrimeNumber.isPrime(13));
    }

}