package be.cegeka.ventouris.visitor.village;

import be.cegeka.ventouris.visitor.army.Army;

public class Village {

    private Army army;
    private final int gold = 30;

    public Village(Army army) {
        this.army = army;
    }

}
