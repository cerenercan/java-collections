package com.company.controlflow.forstatement;

/*
Create for loop inclusively [1, 1000]
Sum all the numbers than can be divided both 3 and 5
For those numbers that meet the conditions, print the number.
Break the loop when you find 5 numbers that meet the conditions.
Print the sum of those numbers.
 */

public class SumThreeAndFiveChallenge {

    public static void SumChallenge(){

        int sum = 0;
        int count = 0;

        for(int i = 1 ; i <= 1000 ; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("The number: " + i);
                sum += i;
                count++;
                if(count == 5){
                    System.out.println("Sum of those 5 numbers is: " + sum);
                    break;
                }
            }
        }
    }


}
