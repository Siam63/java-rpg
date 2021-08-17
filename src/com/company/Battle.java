package com.company;
import java.util.*;

public class Battle {
    boolean running = true;
    Scanner sc;

    public Battle(){
        this.sc = new Scanner(System.in);
    }

    public void enterBattlePhase(Player player, Monster monster){
        System.out.printf("A wild %s appeared!\n", monster.name);

        while(running){
            System.out.printf("%s'S HEALTH: %d        %s'S HEALTH: %d\n", player.name, player.health, monster.name,
                    monster.currHealth);
            System.out.println("1. ATTACK");
            System.out.println("2. FLEE");
            System.out.print("> ");
            String option = sc.nextLine();

            if(option.equals("1")){
                RandGenerator pl = new RandGenerator(player.attack, 0);
                RandGenerator mn = new RandGenerator(monster.attack, 0);
                int playerAttackDealt = pl.generateRandomNum();
                int monsterAttackDealt = mn.generateRandomNum();

                if(playerAttackDealt == 0){
                    System.out.println("You Missed!");
                }else{
                    System.out.printf("You dealt %d damage!\n", playerAttackDealt);
                    monster.currHealth -= playerAttackDealt;
                    if(monster.currHealth <= 0){
                        System.out.printf("Congrats! You have defeated the %s\n", monster.name);
                        RandGenerator mnGold = new RandGenerator(monster.goldDropped, 0);
                        player.gold += mnGold.generateRandomNum();
                        monster.currHealth = monster.maxHealth;
                        running = false;
                    }
                }

                if(monsterAttackDealt == 0){
                    System.out.printf("The %s missed!\n", monster.name);
                }else{
                    System.out.printf("The %s dealt %d damage!\n", monster.name, monsterAttackDealt);
                    player.health -= monsterAttackDealt;
                    if(player.health <= 0){
                        System.out.println("You have died... game over!");
                        System.exit(0);
                    }
                }
            }else if(option.equals("2")){
                System.out.println("You have fled the battle!");
                running = false;
            }
        }
    }
}
