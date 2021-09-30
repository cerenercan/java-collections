package com.company.oop.inheritance.challenge;

public class Kia extends Car{

    private int roadServiceMonths;

    public Kia(int roadServiceMonths) {
        super("Kia", "4WD", 5, 5, 7, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public int getRoadServiceMonths() {
        return roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity == 0){
            stop();
            setCurrentGear(1);
        }
        else if (newVelocity > 0 && newVelocity <= 10)
            setCurrentGear(1);
        else if (newVelocity > 10 && newVelocity <= 20)
            setCurrentGear(2);
        else if (newVelocity > 20 && newVelocity <= 30)
            setCurrentGear(3);
        else if (newVelocity > 30 && newVelocity <= 40)
            setCurrentGear(4);
        else if (newVelocity > 40 && newVelocity <= 50)
            setCurrentGear(5);
        else if (newVelocity > 50 && newVelocity <= 60)
            setCurrentGear(6);
        else
            setCurrentGear(7);

        if (newVelocity > 0)
            changeVelocity(newVelocity, getCurrentDirection() );
    }
}
