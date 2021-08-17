package com.company;
import java.util.*;

public class Monster {
    String name;
    int attack, maxHealth, currHealth, goldDropped;
    ArrayList<Monster> monsterList;

    public Monster(String name, int attack, int maxHealth, int currHealth, int goldDropped){
        this.name = name;
        this.attack = attack;
        this.maxHealth = maxHealth;
        this.currHealth = currHealth;
        this.goldDropped = goldDropped;
        this.monsterList = new ArrayList<Monster>();
    }

}
