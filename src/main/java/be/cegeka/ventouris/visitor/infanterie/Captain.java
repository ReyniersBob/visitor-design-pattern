package be.cegeka.ventouris.visitor.infanterie;

import be.cegeka.ventouris.visitor.enemies.EnemyVisitor;

public class Captain implements Infanterie {

    private int attackPoints = 10;
    private String offensiveWord = "fill in anything that comes to mind";
    private int health = 40;

    @Override
    public void attack() {
        System.out.println("You go right ahead, i'll be there soon");
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
                System.out.println("Captains' health dropped to " + whatsMyHealth());
            } else {
                System.out.println("Captain died");
            }
        } else {
            System.out.println("Captain died");
        }
    }

    @Override
    public int whatsMyHealth() {
        return this.health;
    }

    @Override
    public void defend(EnemyVisitor visitor) {
        visitor.attackCaptain(this);
        offend();
        attack();
    }
}
