package com.company.controlflow.whilestatement;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        number = Math.abs(number);
        int inputNumber = number;

        int palindromeNumber = 0;

        while (inputNumber > 0) {

            int digit = inputNumber % 10;
            palindromeNumber += digit;
            palindromeNumber *= 10;
            inputNumber /= 10;
        }
        return (palindromeNumber / 10)== number;
    }
}
