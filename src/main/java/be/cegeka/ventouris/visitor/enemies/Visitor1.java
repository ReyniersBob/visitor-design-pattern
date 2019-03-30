package be.cegeka.ventouris.visitor.enemies;

import be.cegeka.ventouris.visitor.infanterie.Archer;
import be.cegeka.ventouris.visitor.infanterie.Captain;
import be.cegeka.ventouris.visitor.infanterie.Soldier;

public class Visitor1 implements EnemyVisitor {

    private int attackPoints = 6;
    private int healthPoints = 30;

    @Override
    public void attackSoldier(Soldier soldier) {
        soldier.hit(attackPoints);
    }

    @Override
    public void attackCaptain(Captain captain) {

    }

    @Override
    public void attackArcher(Archer archer) {

    }
}
