package com.company.generic_classes_example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class League<T extends Team>{

    private final String name;
    private final List<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team){
        if (league.contains(team)){
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable(){
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
