package org.example;

import java.util.*;

class JavaDatatype{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter count of the numbers you want to input");
        int count=sc.nextInt();
        System.out.println("Enter those numbers");
        for(int i=0;i<count;i++) {
            String n = sc.next();
            System.out.println(findType(n));
            System.out.println();
        }
    }
    static String findType(String s) {
        long x;
        try{
            x = Long.parseLong(s);
        }catch (Exception e) {
            return s + " can't be fitted anywhere";
        }
        String result = x + " can be fitted in:";
        if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
            result += "\n* byte";
        if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
            result += "\n* short";
        if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
            result += "\n* int";
        if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
            result += "\n* long";

        return result;
    }
}

// https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true

