package com.company;
import java.util.*;
import java.io.*;

public class DataCollector {
    Helper helper;
    ArrayList<Weapon> weaponsList;
    ArrayList<Monster> monsterList;
    GameRunner gameRunner;
    Player player;
    Menu menu;

    public DataCollector(){
        this.weaponsList = new ArrayList<>();
        this.gameRunner = new GameRunner();
        this.menu = new Menu();
        this.monsterList = new ArrayList<>();
        this.helper = new Helper();
    }

    public void initializeData(){
        String line = "";
        String splitBy = ",";
        String path = "Weapons.csv";
        String path2 = "Monsters.csv";

        try{
            BufferedReader br = new BufferedReader(new FileReader(path));

            while((line = br.readLine()) != null){
                String[] weapons = line.split(splitBy);
                weaponsList.add(new Weapon(weapons[0], Integer.parseInt(weapons[1])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            BufferedReader br = new BufferedReader(new FileReader(path2));

            while((line = br.readLine()) != null){
                String[] monsters = line.split(splitBy);
                monsterList.add(new Monster(monsters[0], Integer.parseInt(monsters[1]), Integer.parseInt(monsters[2]),
                        Integer.parseInt(monsters[3]), Integer.parseInt(monsters[4])));
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name, hero?");
        System.out.print("> ");
        String name = sc.nextLine();

        player = new Player(name, 100, 5, 100); // initialize the player object

        gameRunner.startMainMenu(player, weaponsList, monsterList);
    }
}
