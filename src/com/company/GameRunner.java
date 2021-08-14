package com.company;
import java.util.*;

public class GameRunner {
    boolean running = true;
    Menu menu;
    Game game;

    public GameRunner(){
        this.menu = new Menu();
        this.game = new Game();
    }

    public void startMainMenu(Player player, ArrayList<Weapon> weapons, ArrayList<Monster> monsters){
        menu.initialzieGameMenu();
        player.getStats();
        Scanner sc = new Scanner(System.in);

        while(running){
            menu.viewStartMenu();

            System.out.print("> ");
            String selectedOption = sc.nextLine();

            if(selectedOption.equals("X") || selectedOption.equals("x")){
                running = false;
            }else if(selectedOption.equals("1")){
                game.startGame(player, weapons, monsters);
            }else{
                System.out.println("Howdy!");
            }
        }
    }
}
