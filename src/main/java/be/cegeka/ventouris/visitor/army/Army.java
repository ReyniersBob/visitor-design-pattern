package be.cegeka.ventouris.visitor.army;

import be.cegeka.ventouris.visitor.enemies.EnemyVisitor;
import be.cegeka.ventouris.visitor.infanterie.Archer;
import be.cegeka.ventouris.visitor.infanterie.Captain;
import be.cegeka.ventouris.visitor.infanterie.Infanterie;
import be.cegeka.ventouris.visitor.infanterie.Soldier;

import java.util.ArrayList;
import java.util.Collection;

public class Army {

    private Captain captain;
    private Soldier soldier;
    private Archer archer;
    private Collection<Infanterie> army = new ArrayList<>();

    private Army() {
    }

    private Collection<Infanterie> getArmy(){
        addInfanterieToArmy(archer);
        addInfanterieToArmy(captain);
        addInfanterieToArmy(soldier);
        return army;
    }

    private void addInfanterieToArmy(Infanterie infanterie) {
        army.add(infanterie);
    }

    public void defendAgainst(EnemyVisitor visitor){
        getArmy().forEach(infanterie -> infanterie.defendAgainst(visitor));
    }

    public static class Builder{

        private Archer robin;
        private Soldier bohomir;
        private Captain america;

        public Builder withArcher(Archer archer){
            this.robin = archer;
            return this;
        }

        public Builder withSoldier(Soldier soldier){
            this.bohomir = soldier;
            return this;
        }

        public Builder withCaptain(Captain captain){
            this.america = captain;
            return this;
        }

        public Army build(){
            Army army = new Army();
            army.archer = this.robin;
            army.captain = this.america;
            army.soldier = this.bohomir;
            return army;
        }


    }

}
