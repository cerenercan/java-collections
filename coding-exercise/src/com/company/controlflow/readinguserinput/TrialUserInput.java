package com.company.controlflow.readinguserinput;

import java.util.Scanner;

public class TrialUserInput {

    public static void UserInputReading(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year: ");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){

            int birthYear = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2021 - birthYear;

            if (age >= 0 && age <= 100){
                System.out.println("Your age is: " + age);
                System.out.println("Your name is: "+ name);
            } else
                System.out.println("Invalid birth year.");
        } else
            System.out.println("Invalid input of birth year");
        scanner.close();
    }
}
