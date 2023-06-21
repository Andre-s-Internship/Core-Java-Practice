package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigIntegerTaskTest {

    @Test
    @DisplayName("Test for 1234567898765432123456789 and 1234567898765432123456789")
    void testBigIntegerOne() {
        String result = "2469135797530864246913578" + "\n1524157896662094260021335314738613077274750190521";
        assertEquals(result, BigIntegerTask.calculate("1234567898765432123456789", "1234567898765432123456789"));
    }
    @Test
    @DisplayName("Test for 9876543212345678987654321 and 9876543212345678987654321")
    void testBigIntegerTwo() {
        String result = "19753086424691357975308642" + "\n97546105825331503862216125712543820210333789971041";
        assertEquals(result, BigIntegerTask.calculate("9876543212345678987654321", "9876543212345678987654321"));
    }

}