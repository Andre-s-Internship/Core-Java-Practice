package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the first word");
        String first = sc.next();
        System.out.println("Enter the second word");
        String second = sc.next();
        System.out.println(isAnagram(first, second));
    }

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        Map<String, Integer> stringA = new HashMap<>();
        Map<String, Integer> stringB = new HashMap<>();
        fillLetters(a, stringA);
        fillLetters(b, stringB);
        return stringA.equals(stringB);
    }

    private static void fillLetters(String string, Map<String, Integer> stringMap) {
        for(int i = 0; i < string.length(); i++) {
        if(stringMap.get(String.valueOf(string.charAt(i))) != null) {
            stringMap.put(String.valueOf(string.charAt(i)), stringMap.get(String.valueOf(string.charAt(i))+1));
        } else  stringMap.put(String.valueOf(string.charAt(i)), 1);
        }
    }
}


// https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true