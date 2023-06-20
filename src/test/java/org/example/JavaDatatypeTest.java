package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaDatatypeTest {

    @Test
    void findTypeForAll() {
        String actual = JavaDatatype.findType("0");
        String expected = "0 can be fitted in:\n" +
                "* byte\n" +
                "* short\n" +
                "* int\n" +
                "* long";
        assertEquals(expected, actual);
    }

    @Test
    void findTypeForShortIntLong() {
        String actual = JavaDatatype.findType("129"); //Max value of Byte +1
        String expected = "129 can be fitted in:\n" +
                "* short\n" +
                "* int\n" +
                "* long";
        assertEquals(expected, actual);
    }

    @Test
    void findTypeForIntLong() {
        String actual = JavaDatatype.findType("-32769"); //Min short value - 1
        String expected = "-32769 can be fitted in:\n" +
                "* int\n" +
                "* long";
        assertEquals(expected, actual);
    }

    @Test
    void findTypeForLong() {
        String actual = JavaDatatype.findType("2147483648"); //Max int value + 1
        String expected = "2147483648 can be fitted in:\n" +
                "* long";
        assertEquals(expected, actual);
    }

    @Test
    void findTypeForNotFit() {
        String actual = JavaDatatype.findType("9223372036854775808");
        String expected = "9223372036854775808 can't be fitted anywhere";
        assertEquals(expected, actual);
    }
}