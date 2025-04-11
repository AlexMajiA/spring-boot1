package com.alejandromj.spring_boot1.configs;


import com.alejandromj.spring_boot1.models.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

@Configuration
//@PropertySource("classpath:configs/stone.properties")   //extiendo stone.properties para poder inicializar los beans
@PropertySources({
        @PropertySource("classpath:configs/stone.properties"),
        @PropertySource("classpath:configs/mind_stone.properties"),
        @PropertySource("classpath:configs/power_stone.properties"),
        @PropertySource("classpath:configs/reality_stone.properties"),
        @PropertySource("classpath:configs/soul_stone.properties"),
        @PropertySource("classpath:configs/time_stone.properties")
        })
public class StoneConfigs {

    //Los métodos tienen que ser públicos.
    @Bean(name = "mind")
    @Scope("prototype")
    @ConditionalOnProperty(name = "stones.mind.enabled", havingValue = "true")

    public MindStone mindStone(){
        return new MindStone();
    }

    //Los métodos tienen que ser públicos.
    @Bean(name = "power")
    @Scope("prototype")
    @ConditionalOnProperty(name = "stones.power.enabled", havingValue = "true")
    public PowerStone powerStone(){
        return new PowerStone();
    }

    //Los métodos tienen que ser públicos.
    @Bean(name = "reality")
    @Scope("prototype")
    @ConditionalOnProperty(name = "stones.reality.enabled", havingValue = "true")
    public RealityStone realityStone(){
        return new RealityStone();
    }

    //Los métodos tienen que ser públicos.
    @Bean(name = "soul")
    @Scope("prototype")
    @ConditionalOnProperty(name = "stones.soul.enabled", havingValue = "true")
    public SoulStone soulStone(){
        return new SoulStone();
    }

    //Los métodos tienen que ser públicos.
    @Bean(name = "space")
    @Scope("prototype")
    @ConditionalOnProperty(name = "stones.space.enabled", havingValue = "true")
    public SpaceStone spaceStone(){
        return new SpaceStone();
    }

    //Los métodos tienen que ser públicos.
    @Bean(name = "time")
    @Scope("prototype")
    @ConditionalOnProperty(name = "stones.time.enabled")
    public TimeStone timeStone(){
        return new TimeStone();
    }

}
