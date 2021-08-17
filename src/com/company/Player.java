package com.company;

public class Player {
    String name;
    int health;
    int attack;
    int gold;

    public Player(String name, int health, int attack, int gold){
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.gold = gold;
    }

    public void getStats(){
        System.out.printf("NAME: %s"+
                " HEALTH: %d" +
                " ATTACK: %d" +
                " GOLD: %d", this.name, this.health, this.attack, this.gold);
    }
}
