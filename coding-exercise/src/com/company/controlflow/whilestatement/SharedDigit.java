package com.company.controlflow.whilestatement;

public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {

        if(number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99)
            return false;

        int firstDigitNumOne = (number1 / 10) % 10;
        int firstDigitNumTwo = (number2 / 10) % 10;
        int lastDigitNumOne = number1 % 10;
        int lastDigitNumTwo = number2 % 10;


        return (firstDigitNumOne == firstDigitNumTwo || firstDigitNumOne == lastDigitNumTwo ||
                lastDigitNumOne == firstDigitNumTwo || lastDigitNumOne == lastDigitNumTwo);


    }
}
