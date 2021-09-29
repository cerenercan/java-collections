package com.company.controlflow.readinguserinput;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (true){
            System.out.println("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                break;
            }
        }
        long average =Math.round((double) sum /(double) counter);
        System.out.println("SUM = "+sum+" AVG = "+average);
        scanner.nextLine();
        scanner.close();
    }
}
