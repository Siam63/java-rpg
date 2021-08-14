package com.company;
import java.util.*;

public class Battle {
    boolean running = true;
    public Battle(){}

    public void enterBattlePhase(Monster monster){
        System.out.println("You have made it to the battle phase!");
        System.out.println("You are face to face with a: " + monster.name);
    }
}
