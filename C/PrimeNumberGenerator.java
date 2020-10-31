package com.company;

public class PrimeNumberGenerator {
    int value;
    PrimeNumberGenerator(int start){
        value = start;
    }
    int GetNextPrime(){
        if (value<=2){
            return 2;
        }
        if (value % 2 == 0) {
            value+=1;
        }
        int d = 3;
        while (d * d <= value && value % d != 0) {
            d += 2;
        }
        if (d * d > value) {
            return value;
        }
        else {
            return new PrimeNumberGenerator(value + 2).GetNextPrime();
        }
    }
}
