package com.company;

public class Skeleton extends Monster{
    String effect;

    public Skeleton(String name, int attack, int currHelth, int maxHealth, int goldDropped, String effect){
        super(name, currHelth, maxHealth, attack, goldDropped);
        this.effect = effect;
    }

    public void getVoid(){
        System.out.printf(this.name + "'s SPECIAL EFFECT: %s", this.effect);
    }
}
