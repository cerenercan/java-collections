package com.company.controlflow.readinguserinput;

import java.util.Scanner;

public class UserInputChallenge {

    public static void ReadingUserInput(){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 1;

        while(counter <= 10){
            System.out.println("Enter number #"+(counter)+": ");
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                scanner.nextLine();
                sum += number;
                counter++;
            } else {
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }
        scanner.close();
        System.out.println("The sum of the 10 entered numbers is: " + sum);
    }
}
