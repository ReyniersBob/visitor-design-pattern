package be.cegeka.ventouris.visitor.infanterie;

import be.cegeka.ventouris.visitor.enemies.EnemyVisitor;

public interface Infanterie {

    int attack();

    void offendVisitor();

    void hit(int attackPoints);

    int whatsMyHealth();

    void defendAgainst(EnemyVisitor visitor);

}
