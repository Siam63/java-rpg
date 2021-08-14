package com.company;
import java.util.*;

public class Boar extends Monster{
    String effect;

    public Boar(String name, int attack, int health, String effect){
        super(name, attack, health);
        this.effect = effect;
    }
}
