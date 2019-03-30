package be.cegeka.ventouris.visitor.infanterie;

import be.cegeka.ventouris.visitor.enemies.EnemyVisitor;

public class Soldier implements Infanterie {

    private int attackPoints = 5;
    private String offensiveWord = "fill in anything that comes to mind";
    private int health = 20;

    @Override
    public void attack() {
        System.out.println("attackSoldier");
    }

    @Override
    public void offend() {
        System.out.println(this.offensiveWord);
    }

    @Override
    public void hit(int attackPoints) {
        if (whatsMyHealth() > 0) {
            if (whatsMyHealth() - attackPoints > 0) {
                this.health -= attackPoints;
                System.out.println("Soldiers' health dropped to " + whatsMyHealth());
            } else {
                System.out.println("Soldier died");
            }
        } else {
            System.out.println("Soldier died");
        }
    }

    @Override
    public int whatsMyHealth() {
        return this.health;
    }

    @Override
    public void defend(EnemyVisitor visitor) {
        visitor.attackSoldier(this);
        offend();
        attack();
    }
}
