package com.company.generic_types_example;

import java.util.ArrayList;

public class GenericArrayLists {
    public static void mainGenericArrayLists(){
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubles(items);
    }

    private static void printDoubles(ArrayList<Integer> items){
        for (int i : items){
            System.out.println(i * 2);
        }
    }
}
