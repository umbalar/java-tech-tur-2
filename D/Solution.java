package com.company;

import java.util.*;
import java.util.stream.*;

public class Solution {
    public static Stream<Double> average(int count, Stream<String> data){
        Double[] a = data.map((s -> s.split(" "))).map((s) -> Double.parseDouble(s[1])).toArray(Double[]::new);
        LinkedList<Double> out = new LinkedList<>();
        for (int i = 0; i<a.length/count; i++){
            double summ = 0;
            for (int j = 0; j<count; j++){
                summ += a[i*count+j];
            }
            out.add(summ/count);
        }
        return out.stream();
    }
}
