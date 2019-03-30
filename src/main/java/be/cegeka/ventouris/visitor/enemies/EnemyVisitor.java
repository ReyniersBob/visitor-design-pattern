package be.cegeka.ventouris.visitor.enemies;

import be.cegeka.ventouris.visitor.infanterie.Archer;
import be.cegeka.ventouris.visitor.infanterie.Captain;
import be.cegeka.ventouris.visitor.infanterie.Soldier;

public interface EnemyVisitor {

    void attackSoldier(Soldier soldier);
    void attackCaptain(Captain captain);
    void attackArcher(Archer archer);
}
