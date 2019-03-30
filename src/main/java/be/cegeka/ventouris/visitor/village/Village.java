package be.cegeka.ventouris.visitor.village;

import be.cegeka.ventouris.visitor.army.Army;

import java.util.Random;

public class Village {

    private Army army;
    private int gold;

    public Village(Army army, int gold) {
        this.army = army;
        this.gold = gold;
    }

    private void plunderVillage(){
        this.gold -= new Random().nextInt(10);
        System.out.println("The village has " + this.gold + " left.");
    }
}
