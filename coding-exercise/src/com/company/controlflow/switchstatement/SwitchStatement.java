package com.company.controlflow.switchstatement;

public class SwitchStatement {

    public static void testingSwitch(int switchValue){

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            default:
                System.out.println("Value is neither 1 nor 2");
                break;
        }

    }

    public static void switchChallenge(char switchValue){

        switch (switchValue){
            case 'A':
                System.out.println("Value is 'A'");
                break;
            case 'B':
                System.out.println("Value is 'B'");
                break;
            case 'C':
                System.out.println("Value is 'C'");
                break;
            case 'D':
                System.out.println("Value is 'D'");
                break;
            case 'E':
                System.out.println("Value is 'E'");
                break;
            default:
                System.out.println("Not Found.");
                break;
        }
    }

    public static void switchChallenge(String switchValue) {

        switchValue = switchValue.toUpperCase();

        switch (switchValue){
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "FEBRUARY":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Finished.");
                break;
        }

    }
}
