package be.cegeka.ventouris.visitor.plunder;

import be.cegeka.ventouris.visitor.army.Army;
import be.cegeka.ventouris.visitor.enemies.Visitor1;

public class Plunder {

    public static void letThePlunderBegin(Army army, Visitor1 visitors) {
        army.defendAgainst(visitors);
    }

}
