package com.alejandromj.spring_boot1.services;

import com.alejandromj.spring_boot1.models.*;
import lombok.Getter;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


/**
 * Esta clase GuantletServiceImpl es un servicio de Spring que tiene todas las gemas del infinito como dependencias.
 * Spring se encarga de inyectarlas automáticamente cuando inicia la aplicación, gracias a:
 * @Service: Marca esta clase como un bean de servicio, gestionado por Spring.
 * @Autowired: Le dice a Spring que use inyección de dependencias en el constructor.
 * @Qualifier("..."): Le especifica cuál de los beans de tipo Stone debe usar.
 */

@Service
@Slf4j
@Getter
@Primary
@ConditionalOnBean(value = {
        MindStone.class,
        PowerStone.class,
        RealityStone.class,
        SoulStone.class,
        SpaceStone.class,
        TimeStone.class
})
//@ConditionalOnProperty
//@Log



public class GuantletServiceImpl implements GuantletService {

    //@Autowired = inyección de dependencias (DI)

    private final Stone mind;
    private final Stone power;
    private final Stone reality;
    private final Stone soul;
    private final Stone space;
    private final Stone time;

    //La inyección de dependencias recomendada para Spring Boot es mediante un constructor.
    //Constructor por parámetros.
    @Autowired
    public GuantletServiceImpl(
            @Qualifier("mind") Stone mind,
            @Qualifier("power") Stone power,
            @Qualifier("reality") Stone reality,
            @Qualifier("soul") Stone soul,
            @Qualifier("space") Stone space,
            @Qualifier("time") Stone time) {

        this.mind = mind;
        this.power = power;
        this.reality = reality;
        this.soul = soul;
        this.space = space;
        this.time = time;
    }


    @Override
    public void useGuantlet(String stoneName) {
        //log.info("Use stone: " + reality);

        switch (stoneName) {
            case "mind" -> log.info("Use stone: " + this.mind);
            case "power" -> log.info("Use stone: " + this.power);
            case "reality" -> log.info("Use stone: " + this.reality);
            case "soul" -> log.info("Use stone: " + this.soul);
            case "space" -> log.info("Use stone: " + this.space);
            case "time" -> log.info("Use stone: " + this.time);


            default -> throw new IllegalArgumentException("Invalid name");
        }
    }

    @Override
    public void useFullPower() {

        if (this.mind != null && this.power != null && this.reality != null
                && this.soul != null && this.space != null && this.time != null) {
            log.info("USING ALL POWER");
        } else {
            throw new IllegalStateException("Cant be using full power because service have field null");
        }
    }

}