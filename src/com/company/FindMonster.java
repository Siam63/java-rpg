package com.company;
import java.util.*;

public class FindMonster {
    Scanner sc;
    Battle battle;
    public FindMonster(){
        this.sc = new Scanner(System.in);
        this.battle = new Battle();
    }

    public void getMonsterAtRandom(ArrayList<Monster> monsters) {
        int upperBound = 10;
        int lowerBound = 1;
        // get random number between 1 and 5
        int rand = new Random().nextInt(upperBound - lowerBound + 1) + lowerBound;

        if (rand <= monsters.size()) {
            System.out.println("A " + monsters.get(rand).name + " has been spotted!");
            System.out.println("Go into battle? [Y/N]");
            System.out.print("> ");
            String choice = sc.nextLine();

            if (choice.equals("Y") || choice.equals("y")) {
                battle.enterBattlePhase(monsters.get(rand));
            }
        }
    }
}
