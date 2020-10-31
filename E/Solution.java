package com.company;

import java.util.*;
import java.util.stream.*;

public class Solution {
    public static Stream<String> max(int n, Stream<String> lines){
        String[] a = lines.toArray(String[]::new);
        LinkedList<String> out = new LinkedList<>();
        for (int j = 0; j < a.length-1; j++) {
            for (int i = 0; i < a.length - 1 - j; i++) {
                if (Integer.parseInt(a[i].split(" ")[1]) < Integer.parseInt(a[i + 1].split(" ")[1])) {
                    String temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        if (n == 1){
            out.add(a[0].split(" ")[0]);
            for (int i = 0; i< a.length-1; i++){
                if (Integer.parseInt(a[i].split(" ")[1]) == Integer.parseInt(a[i+1].split(" ")[1])){
                    out.add(a[i+1].split(" ")[0]);
                }
                else {
                    break;
                }
            }
        }
        else {
            int k = 1;
            for (int i = 0; i < a.length - 1; i++) {
                if (Integer.parseInt(a[i].split(" ")[1]) != Integer.parseInt(a[i + 1].split(" ")[1])) {
                    k += 1;
                }
                if (k == n) {
                    out.add(a[i + 1].split(" ")[0]);
                }
                if (k > n) {
                    break;
                }
            }
        }
        Collections.sort(out);
        return out.stream();
    }
}