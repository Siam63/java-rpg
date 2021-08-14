package com.company;
import java.util.*;

public class Weapon {
    String name;
    int power;
    DataCollector dataCollector;

    public Weapon(String name, int power){
        this.name = name;
        this.power = power;
        this.dataCollector = new DataCollector();
    }

    public void getFirstWeapon(){
        System.out.println("FIRST WEAPON: " + dataCollector.weaponsList.get(0));
    }
}
