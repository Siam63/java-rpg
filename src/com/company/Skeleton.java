package com.company;

public class Skeleton extends Monster{
    String effect;

    public Skeleton(String name, int attack, int health, String effect){
        super(name, health, attack);
        this.effect = effect;
    }

    public void getVoid(){
        System.out.printf(this.name + "'s SPECIAL EFFECT: %s", this.effect);
    }
}
