package com.alejandromj.spring_boot1.configs;


import com.alejandromj.spring_boot1.models.*;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

@Slf4j
@Configuration
@Profile("default")
//@PropertySource("classpath:configs/stone.properties")   //extiendo stone.properties para poder inicializar los beans
@PropertySources({
        @PropertySource("classpath:configs/stone.properties"),
        @PropertySource("classpath:configs/mind_stone.properties"),
        @PropertySource("classpath:configs/power_stone.properties"),
        @PropertySource("classpath:configs/reality_stone.properties"),
        @PropertySource("classpath:configs/soul_stone.properties"),
        @PropertySource("classpath:configs/space_stone.properties"),
        @PropertySource("classpath:configs/time_stone.properties")
        })
public class StoneConfigs {

    @Value("${subtitles.url}") private String subtitlesUrl;
    @Value("${spring.profiles.active:default}") private String profile;

    // Valores de la gema de la mente.
    @Value("${stone.mind.color}") private String colorMind;
    @Value("${stone.mind.name}") private String nameMind;
    @Value("${stone.mind.location}") private String locationMind;
    @Value("${stone.mind.energy-level}")private Integer energyMind;

    // Valores de la gema del poder.
    @Value("${stone.power.color}") private String colorPower;
    @Value("${stone.power.name}") private String namePower;
    @Value("${stone.power.location}") private String locationPower;
    @Value("${stone.power.energy-level}")private Integer energyPower;

    // Valores de la gema de la realidad.
    @Value("${stone.reality.color}") private String colorReality;
    @Value("${stone.reality.name}") private String nameReality;
    @Value("${stone.reality.location}") private String locationReality;
    @Value("${stone.reality.energy-level}")private Integer energyReality;

    // Valores de la gema del alma.
    @Value("${stone.soul.color}") private String colorSoul;
    @Value("${stone.soul.name}") private String nameSoul;
    @Value("${stone.soul.location}") private String locationSoul;
    @Value("${stone.soul.energy-level}")private Integer energySoul;

    // Valores de la gema del espacio.
    @Value("${stone.space.color}") private String colorSpace;
    @Value("${stone.space.name}") private String nameSpace;
    @Value("${stone.space.location}") private String locationSpace;
    @Value("${stone.space.energy-level}")private Integer energySpace;

    //Valores de la gema del tiempo.
    @Value("${stone.time.color}") private String colorTime;
    @Value("${stone.time.name}") private String nameTime;
    @Value("${stone.time.location}") private String locationTime;
    @Value("${stone.time.energy-level}")private Integer energyTime;

    @PostConstruct
    public void init(){
        log.info("Loading subtitles: {}, with profile: {}", this.subtitlesUrl, profile);
    }

    //Los métodos tienen que ser públicos.
    @Bean(name = "mind", initMethod = "sendMind")
    //@Scope("prototype")
    //@Lazy   //Solo crea el beans cuando es necesario. Eager por defecto los crea todos al iniciar el programa.
    @ConditionalOnProperty(name = "stones.mind.enabled", havingValue = "true")
    public MindStone mindStone(){
        return new MindStone(colorMind, nameMind, locationMind, energyMind);
    }

    //Los métodos tienen que ser públicos.
    @Bean(name = "power", initMethod = "sendPower")
    //@Scope("prototype")
    //@Lazy   //Solo crea el beans cuando es necesario. Eager por defecto los crea todos al iniciar el programa.
    @ConditionalOnProperty(name = "stones.power.enabled", havingValue = "true")
    public PowerStone powerStone(){
        return new PowerStone(colorPower, namePower, locationPower, energyPower);
    }

    //Los métodos tienen que ser públicos.
    @Bean(name = "reality", initMethod = "sendReality")
    //@Scope("prototype")
    //@Lazy   //Solo crea el beans cuando es necesario. Eager por defecto los crea todos al iniciar el programa.
    @ConditionalOnProperty(name = "stones.reality.enabled", havingValue = "true")
    public RealityStone realityStone(){
        return new RealityStone(colorReality, nameReality, locationReality, energyReality);
    }

    //Los métodos tienen que ser públicos.
    @Bean(name = "soul", initMethod = "sendSoul")
    //@Scope("prototype")
    //@Lazy   //Solo crea el beans cuando es necesario. Eager por defecto los crea todos al iniciar el programa.
    @ConditionalOnProperty(name = "stones.soul.enabled", havingValue = "true")
    public SoulStone soulStone(){
        return new SoulStone(colorSoul, nameSoul, locationSoul, energySoul);
    }

    //Los métodos tienen que ser públicos.
    @Bean(name = "space", initMethod = "sendSpace")
    //@Scope("prototype")
    //@Lazy   //Solo crea el beans cuando es necesario. Eager por defecto los crea todos al iniciar el programa.
    @ConditionalOnProperty(name = "stones.space.enabled", havingValue = "true")
    public SpaceStone spaceStone(){
        return new SpaceStone(colorSpace, nameSpace, locationSpace, energySpace);
    }

    //Los métodos tienen que ser públicos.
    @Bean(name = "time", initMethod = "sendTime")
    //@Scope("prototype")
    //@Lazy   //Solo crea el beans cuando es necesario. Eager por defecto los crea todos al iniciar el programa.
    @ConditionalOnProperty(name = "stones.time.enabled")
    public TimeStone timeStone(){
        return new TimeStone(colorTime, nameTime, locationTime, energyTime);
    }

}
