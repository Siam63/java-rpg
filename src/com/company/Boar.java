package com.company;
import java.util.*;

public class Boar extends Monster{
    String effect;

    public Boar(String name, int attack, int currHealth, int maxHealth, int goldDropped, String effect){
        super(name, attack, currHealth, maxHealth, goldDropped);
        this.effect = effect;
    }
}
