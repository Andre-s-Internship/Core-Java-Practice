package org.example;

import java.util.Scanner;

public class Array1D {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(printArray(arr));
    }

    static String printArray(int[] arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1) {
                result.append(arr[i]);
            } else {
                result.append(arr[i]).append("\n");
            }
        }
        return result.toString();
    }

    }

