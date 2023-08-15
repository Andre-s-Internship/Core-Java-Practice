package org.example;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalTask {

    static String sortBigDecimal(List<String> stringList) {
        int count = stringList.size();
        Map<String, BigDecimal> decimalToStringMap = new HashMap<>();

        for (int i = 0; i < count; i++) {
            String input = stringList.get(i);
            BigDecimal decimal = new BigDecimal(input);
            decimalToStringMap.put(input, decimal);
        }

        List<Map.Entry<String, BigDecimal>> entryList = new ArrayList<>(decimalToStringMap.entrySet());
        entryList.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        String result = "";
        for (Map.Entry<String, BigDecimal> string : entryList) {
            result += string.getKey() + '\n';
        }
        return result;
    }
}
