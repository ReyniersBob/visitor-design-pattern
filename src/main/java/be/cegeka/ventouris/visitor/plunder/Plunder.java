package be.cegeka.ventouris.visitor.plunder;

import be.cegeka.ventouris.visitor.army.Army;
import be.cegeka.ventouris.visitor.enemies.Visitor1;
import be.cegeka.ventouris.visitor.infanterie.Archer;
import be.cegeka.ventouris.visitor.infanterie.Captain;
import be.cegeka.ventouris.visitor.infanterie.Soldier;

public class Plunder {

    public static void letThePlunderBegin() {
        Army army = createArmy();
        Visitor1 visitors = new Visitor1();
        army.defendAgainst(visitors);
    }

    private static Army createArmy() {
        return new Army.Builder()
                .withArcher(new Archer())
                .withCaptain(new Captain())
                .withSoldier(new Soldier())
                .build();
    }

}
