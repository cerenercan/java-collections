package com.company.generic_classes_example;

public class MainGenericClasses {

    public static void mainGenerics(){
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        BasketballPlayer jordan = new BasketballPlayer("Jordan");

        //There is a bug that you can add different sports people to the same sports team.
        Team footballTeam = new Team("Some Football Team");
        footballTeam.addPlayer(joe);
        footballTeam.addPlayer(pat);
        footballTeam.addPlayer(jordan);

        System.out.println(footballTeam.numberOfPlayers());

    }
}
