package com.company.controlflow.forstatement;

public class ForStatement {

    public static void CalculateInterest(double amount, double interestRate){

         for (; interestRate < 9 ; interestRate++){
             double interest = amount * (interestRate / 100);
             System.out.println(amount + " at " + interestRate +"% interest = " + String.format("%.1f",interest));
         }

    }
}
