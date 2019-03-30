package be.cegeka.ventouris.visitor.enemies;

import be.cegeka.ventouris.visitor.infanterie.Archer;
import be.cegeka.ventouris.visitor.infanterie.Captain;
import be.cegeka.ventouris.visitor.infanterie.Soldier;

public class Visitor1 implements EnemyVisitor {

    private int attackPoints = 6;
    private int healthPoints = 30;


    @Override
    public void attackSoldier(Soldier soldier) {
        System.out.println("Visitor1 attacks soldier");
        soldier.hit(attackPoints);
        if (soldier.isAlive) {
            System.out.println("Visitor gets hit by soldier");
            getHitBy(soldier.attack());
        }
        System.out.println("=========================");
    }

    @Override
    public void attackCaptain(Captain captain) {
        System.out.println("Visitor1 attacks captain");
        captain.hit(attackPoints);
        if (captain.isAlive) {
            System.out.println("Visitor gets hit by captain");
            getHitBy(captain.attack());
        }
        System.out.println("=========================");
    }

    @Override
    public void attackArcher(Archer archer) {
        System.out.println("Visitor1 attacks archer");
        archer.hit(attackPoints);
        if (archer.isAlive) {
            System.out.println("Visitor gets hit by archer");
            getHitBy(archer.attack());
        }
        System.out.println("=========================");
    }

    private void getHitBy(int attack) {
        this.healthPoints -= attack;
        System.out.println("Visitors' health dropped to " + this.healthPoints);
    }
}
