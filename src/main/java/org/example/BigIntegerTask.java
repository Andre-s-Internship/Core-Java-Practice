package org.example;
import java.util.*;
import java.math.BigInteger;


public class BigIntegerTask {
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            System.out.println(calculate(sc.next(), sc.next()));
        }

        static String calculate(String string1, String string2) {
            BigInteger first = new BigInteger(string1);
            BigInteger second = new BigInteger(string2);
            BigInteger addition = first.add(second);
            BigInteger multiplication = first.multiply(second);
            return addition + "\n" + multiplication;
        }
    }

