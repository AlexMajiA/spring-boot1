package com.alejandromj.spring_boot1;

import com.alejandromj.spring_boot1.services.GuantletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot1Application {

	@Autowired

	//Implemento la calse que extiende de la interfaz asñi, porque solo tengo una, en caso de haber más es necesario
	//marcar la principal con @Primary.
	GuantletService guantletService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}





}
