package com.alejandromj.spring_boot1.components;


import com.alejandromj.spring_boot1.services.GuantletService;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Thanos {

    private final GuantletService guantletService;

    @Autowired // es opcional porque ya tiene inyección de dependencias por Spring.
    public Thanos(GuantletService guantletService) {
        this.guantletService = guantletService;
    }


    public void snap(){
        // Instancio la clase Faker para pruebas.
        final var faker = new Faker();

        // Declaro variable para guardar los paises.
        final var country = faker.country().name();

        log.info("Thanos is using the gauntlet to perform snap in {}",country);

        this.guantletService.useFullPower();

        final var impacts = faker.random().nextInt(1000);

        log.info("Thanos is get make danger points {}", impacts);

    }


}
