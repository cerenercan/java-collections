package com.company.generic_classes_example;

import java.util.ArrayList;

public class Team<T extends Player> {

    private final String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private final ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(player.getName() + " is already on this team.");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for the team " + this.name);
            return true;
        }
    }

    public int numberOfPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if (ourScore > theirScore){
            won++;
            message = " beat ";
        } else if (theirScore > ourScore){
            lost++;
            message = " lost to ";
        } else {
            tied++;
            message = " drew with ";
        }
        played++;

        if (opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }
}
