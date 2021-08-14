package com.company;
import java.util.*;

public class Menu {
    public Menu(){}
    ArrayList<String> menuOptions = new ArrayList<>();
    ArrayList<String> gameRunningOptions = new ArrayList<>();

    public void initialzieGameMenu(){
        menuOptions.add("Start Game");
        menuOptions.add("View Shop");
        menuOptions.add("View Shop");
        menuOptions.add("Exit Game\n");
    }

    public void initialzieGameRunningMenu(){
        gameRunningOptions.add("Explore Map");
        gameRunningOptions.add("Leave");
    }

    public void addOption(String newOptionText){
        menuOptions.add(newOptionText);
    }

    public void viewStartMenu(){
        System.out.println("");
        for (int i = 0; i < menuOptions.size(); i++) {
            System.out.println((i+1) + ". " + menuOptions.get(i));
        }
    }

    public void viewGameRunningMenu(){
        System.out.println("");
        for(int i = 0; i < gameRunningOptions.size(); i++){
            System.out.println((i+1) + ". " + gameRunningOptions.get(i));
        }
    }
}
