package be.cegeka.ventouris.visitor;

import be.cegeka.ventouris.visitor.army.Army;
import be.cegeka.ventouris.visitor.enemies.Visitor1;
import be.cegeka.ventouris.visitor.infanterie.Archer;
import be.cegeka.ventouris.visitor.infanterie.Captain;
import be.cegeka.ventouris.visitor.infanterie.Soldier;
import be.cegeka.ventouris.visitor.plunder.Plunder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VisitorDemoApplication {

	public static void main(String[] args) {

		Plunder.letThePlunderBegin(createArmy(), new Visitor1());
	}

	private static Army createArmy() {
		return new Army.Builder()
				.withArcher(new Archer())
				.withCaptain(new Captain())
				.withSoldier(new Soldier())
				.build();
	}

}
