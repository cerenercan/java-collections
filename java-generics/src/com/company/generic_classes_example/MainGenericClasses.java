package com.company.generic_classes_example;

public class MainGenericClasses {

    public static void mainGenerics(){
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        BasketballPlayer jordan = new BasketballPlayer("Jordan");

        Team<FootballPlayer> footballTeam = new Team<>("Some Football Team");
        footballTeam.addPlayer(joe);

        Team<BaseballPlayer> baseballTeam = new Team<>("Some Baseball Team");
        baseballTeam.addPlayer(pat);

        Team<BasketballPlayer> basketballTeam = new Team<>("Some Basketball Team");
        basketballTeam.addPlayer(new BasketballPlayer("shaq"));
        basketballTeam.addPlayer(jordan);

        System.out.println(footballTeam.numberOfPlayers());
        System.out.println(baseballTeam.numberOfPlayers());
        System.out.println(basketballTeam.numberOfPlayers());

    }
}
