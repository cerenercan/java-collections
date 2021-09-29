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

        Team<FootballPlayer> fenerbahce = new Team<>("Fenerbahce");
        FootballPlayer footballPlayer = new FootballPlayer("Alex");
        fenerbahce.addPlayer(footballPlayer);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(footballTeam, 3, 8);

        footballTeam.matchResult(fremantle, 2, 1);

        System.out.println(footballTeam.numberOfPlayers());
        System.out.println(baseballTeam.numberOfPlayers());
        System.out.println(basketballTeam.numberOfPlayers());

        System.out.println(footballTeam.compareTo(fenerbahce));
        System.out.println(footballTeam.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(footballTeam));
        System.out.println(fenerbahce.compareTo(fremantle));

    }
}
