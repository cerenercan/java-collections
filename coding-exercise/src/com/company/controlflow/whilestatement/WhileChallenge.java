package com.company.controlflow.whilestatement;

public class WhileChallenge {

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 10){
            return -1;
        }

        while (number > 0){
            int leastSignificant = number % 10;
            sum += leastSignificant;
            number /= 10;
        }
        return sum;
    }
}
