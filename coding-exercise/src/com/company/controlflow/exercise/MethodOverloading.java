package com.company.controlflow.exercise;

public class MethodOverloading {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if(feet >= 0 && inches >= 0 && inches <= 12){
            double centimeter = (feet * 12) * (2.54);
            centimeter += inches * (2.54);
            return centimeter ;
        }

        return -1;

    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double feet = (int)(inches / 12);
            double remainderInches = (int)(inches % 12);
            System.out.println(inches + " inches = " + feet + " feet and " + remainderInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainderInches);

        }

        return -1;
    }
}
