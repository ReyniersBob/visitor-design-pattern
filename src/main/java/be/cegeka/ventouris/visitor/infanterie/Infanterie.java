package be.cegeka.ventouris.visitor.infanterie;

import be.cegeka.ventouris.visitor.enemies.EnemyVisitor;

public interface Infanterie {

    void attack();

    void offend();

    void hit(int attackPoints);

    int whatsMyHealth();

    void defend(EnemyVisitor visitor);

}
