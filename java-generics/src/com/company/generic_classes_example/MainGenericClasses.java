package com.company.generic_classes_example;

public class MainGenericClasses {

    public static void mainGenerics(){
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        BasketballPlayer jordan = new BasketballPlayer("Jordan");

        Team<FootballPlayer> footballTeam = new Team<>("Some Football Team");
        footballTeam.addPlayer(joe);

        System.out.println(footballTeam.numberOfPlayers());

    }
}
