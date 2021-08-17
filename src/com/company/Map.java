package com.company;
import java.util.*;

public class Map {
    boolean running = true;
    Scanner sc;
    FindMonster fm;
    // initialize the map with every spot beign 0
    public Map(){
        this.sc = new Scanner(System.in);
        this.fm = new FindMonster();
    }

    public void exploreMap(int currRowPlayer, int currColPlayer, Player player, ArrayList<Weapon> weapons, ArrayList<Monster> monsters){
        String[][] mapLayout = {
                {"0 ","0 ","0 ","0 ","0 "},
                {"0 ","0 ","0 ","0 ","0 "},
                {"0 ","0 ","0 ","0 ","0 "},
                {"0 ","0 ","0 ","0 ","0 "},
                {"0 ","0 ","0 ","0 ","0 "}};
        mapLayout[currColPlayer][currColPlayer] = "X "; // initial position

        while(running){
            for(int row = 0; row < mapLayout.length; row++){
                for(int col = 0; col < mapLayout[0].length; col++){
                    // X denotes where the play is on the map
                    System.out.print(mapLayout[row][col]);
                }
                System.out.println("");
            }

            System.out.print("> ");
            String input = sc.nextLine();

            if(input.equals("D") || input.equals("d")){
                if(currColPlayer == mapLayout.length - 1){
                    System.out.println("Out of bounds!");
                }else{
                    mapLayout[currRowPlayer][currColPlayer] = "0 ";
                    currColPlayer++;
                }
            }else if(input.equals("A") || input.equals("a")){
                if(currColPlayer == 0){
                    System.out.println("Out of bounds!");
                }else{
                    mapLayout[currRowPlayer][currColPlayer] = "0 ";
                    currColPlayer--;
                }
            }else if(input.equals("W") || input.equals("w")){
                if(currRowPlayer == 0){
                    System.out.println("Out of bounds!");
                }else{
                    mapLayout[currRowPlayer][currColPlayer] = "0 ";
                    currRowPlayer--;
                }
            }else if(input.equals("S") || input.equals("s")){
                if(currRowPlayer == mapLayout.length - 1){
                    System.out.println("Out of bounds!");
                }else{
                    mapLayout[currRowPlayer][currColPlayer] = "0 ";
                    currRowPlayer++;
                }
            }else{
                System.out.println("Invalid Option!");
            }

            mapLayout[currRowPlayer][currColPlayer] = "X ";

            int upperBound = 10;
            int lowerBound = 1;

            int rand = new Random().nextInt(upperBound - lowerBound + 1) + lowerBound;

            if(rand < monsters.size()){
                Battle battle = new Battle();
                battle.enterBattlePhase(player, monsters.get(rand));
            }
        }
    }
}
