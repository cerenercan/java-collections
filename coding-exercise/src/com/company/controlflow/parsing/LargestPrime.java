package com.company.controlflow.parsing;

public class LargestPrime {

    public static int getLargestPrime(int number) {

        int greatestPrime = 0;
        if (number <= 1) {
            return -1;
        }

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                greatestPrime = i;
                number /= i;
                i = 1;
            }
        }
        return greatestPrime;
    }


}
