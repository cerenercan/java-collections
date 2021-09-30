package com.company.controlflow.readinguserinput;

import java.util.Scanner;

public class MinAndMaxNumber {

    private static final int MIN_NUM = Integer.MAX_VALUE;
    private static final int MAX_NUM = Integer.MIN_VALUE;


    public static void FindMinAndMax(){

        int minNumber = MIN_NUM, maxNumber = MAX_NUM;
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Enter number: ");
            if (scanner.hasNextInt()){

                int number = scanner.nextInt();
                if (number < minNumber)
                    minNumber = number;
                 else if (number > maxNumber)
                    maxNumber = number;
            } else {

                System.out.println("Invalid Input");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Minimum Number Entered: " +minNumber);
        System.out.println("Maximum Number Entered: " +maxNumber);
        scanner.close();

    }
}
