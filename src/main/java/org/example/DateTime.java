package org.example;

import java.time.LocalDate;
import java.util.Scanner;

class DateTime{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the Date");
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        System.out.println(findDay(day, month, year));
    }

    static String findDay(int day, int month, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }
}

//https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
