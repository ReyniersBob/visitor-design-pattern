package be.cegeka.ventouris.visitor;

import be.cegeka.ventouris.visitor.plunder.Plunder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VisitorDemoApplication {

	public static void main(String[] args) {

		Plunder.letThePlunderBegin();
	}

}
