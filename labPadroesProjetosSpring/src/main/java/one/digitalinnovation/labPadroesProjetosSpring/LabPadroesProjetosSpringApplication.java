package one.digitalinnovation.labPadroesProjetosSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
/*
 * Os seguintes módulos foram selecionados
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 */


@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetosSpringApplication.class, args);
	}

}
