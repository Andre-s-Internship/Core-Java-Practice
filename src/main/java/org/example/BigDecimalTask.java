package org.example;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

public class BigDecimalTask {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the count of numbers");
        int count = sc.nextInt();
        System.out.println("Please enter numbers");
        List<BigDecimal> bigDecimalList = new ArrayList<>();

        for(int i = 0; i < count; i ++) {
            bigDecimalList.add(new BigDecimal(sc.next()).negate());
        }
        Collections.sort(bigDecimalList);
        Collections.reverse(bigDecimalList);
        for (BigDecimal bigDecimal : bigDecimalList) {
            //DecimalFormat decimalFormat = new DecimalFormat("###########.##########"); // Pattern to retain decimal places
            //String formattedNumber = decimalFormat.format(bigDecimal);
            System.out.println(bigDecimal.toPlainString());
        }
    }
}
