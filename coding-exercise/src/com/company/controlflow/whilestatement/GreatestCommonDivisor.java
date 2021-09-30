package com.company.controlflow.whilestatement;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first ,int second) {

        if(first < 10 || second < 10)
            return -1;


        int commonDivisor = Math.min(first, second);

        while (commonDivisor > 0){

            if(first % commonDivisor == 0 && second % commonDivisor == 0){
                return commonDivisor;
            }
            commonDivisor--;

        }
        return -1;
    }
}
