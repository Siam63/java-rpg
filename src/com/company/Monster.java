package com.company;
import java.util.*;

public class Monster {
    String name;
    int attack, health;
    ArrayList<Monster> monsterList;

    public Monster(String name, int attack, int health){
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.monsterList = new ArrayList<Monster>();
    }

    public void monsterListInitialization(){
        Skeleton skeleton = new Skeleton("Skeleton", 5, 20, "Range");
        Skeleton boar = new Skeleton("Boar", 7, 10, "Piercing");
        monsterList.add(skeleton);
        monsterList.add(boar);
    }
}
