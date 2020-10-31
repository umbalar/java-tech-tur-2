package com.company;

import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Solution {
    public static Optional<BigInteger> dot(Stream<Long> a, Stream<Long> b){
        Long[] aVe = a.toArray(Long[]::new);
        Long[] bVe = b.toArray(Long[]::new);
        long res = 0;
        for (int i = 0; i < aVe.length;i++){
            res += aVe[i]*bVe[i];
        }
        return Optional.of(BigInteger.valueOf(res));
    }
}