package be.cegeka.ventouris.visitor.plunder;

import be.cegeka.ventouris.visitor.army.Army;
import be.cegeka.ventouris.visitor.enemies.EnemyVisitor;

public class Plunder {

    public static void letThePlunderBegin(Army army, EnemyVisitor visitors) {
        army.defendAgainst(visitors);
    }

}
