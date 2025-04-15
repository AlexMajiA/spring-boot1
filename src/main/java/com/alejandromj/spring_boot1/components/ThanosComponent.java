package com.alejandromj.spring_boot1.components;


import com.alejandromj.spring_boot1.models.ThanosModel;
import com.alejandromj.spring_boot1.services.GuantletService;
import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@ConfigurationProperties(prefix = "thanos.config")
@AllArgsConstructor
public class ThanosComponent {

    private final GuantletService guantletService;
    private final ThanosModel thanosModel;

    @PostConstruct
    public void init(){
        log.info("Loading Thanos configs: {}", thanosModel);
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
