package com.company.controlflow.parsing;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){

        int bigBag = bigCount * 5;

        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
        if(smallCount>=(goal-bigBag)){
            return smallCount >= goal % 5;
        }
        return false;
    }
}
