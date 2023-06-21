package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {

    private static final String IP_REGEX = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    private static final Pattern IP_PATTERN = Pattern.compile(IP_REGEX);
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter IP address to validate");
        System.out.println(isValidIPAddress(sc.next()));
    }


    public static String isValidIPAddress(String ipAddress) {
            return IP_PATTERN.matcher(ipAddress).matches() ? "Valid" : "Not valid";
        }
    }

