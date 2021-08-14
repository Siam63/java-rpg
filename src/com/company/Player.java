package com.company;

public class Player {
    String name;
    int health;

    public Player(String name, int health){
        this.name = name;
        this.health = health;
    }

    public void getStats(){
        System.out.printf("NAME: %s   HEALTH: %d", this.name, this.health);
    }
}
