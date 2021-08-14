package com.company;
import java.util.*;

public class Game {
    public boolean running = true;
    Menu menu;
    Scanner sc;
    Map map;

    public Game(){
        this.menu = new Menu();
        this.sc = new Scanner(System.in);
        this.map = new Map();
    }

    public void startGame(Player player, ArrayList<Weapon> weapons, ArrayList<Monster> monsters){
        System.out.printf("NAME: %s   HEALTH: %d", player.name, player.health);
        menu.initialzieGameRunningMenu();

        while(running){
            menu.viewGameRunningMenu();
            System.out.print("> ");
            String selectedOption = sc.nextLine();

            if(selectedOption.equals("1")){
                System.out.println("You are now exploring the map... W, A, S, D to move.");
                map.exploreMap(0,0, player, weapons, monsters);
            }else if(selectedOption.equals("2")){
                running = false;
            }else{
                System.out.println("Invalid Option.");
            }
        }
    }
}
