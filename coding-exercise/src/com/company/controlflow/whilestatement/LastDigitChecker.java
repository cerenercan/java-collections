package com.company.controlflow.whilestatement;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {

        if(number1 < 10 || number1 > 1000 || number2 < 10 || number2 > 1000 || number3 < 10 || number3 > 1000 ) {
            return false;
        }

        int number1LastDigit = number1 % 10;
        int number2LastDigit = number2 % 10;
        int number3LastDigit = number3 % 10;

        return (number1LastDigit == number2LastDigit || number1LastDigit == number3LastDigit ||
                number2LastDigit == number3LastDigit);
    }
}
