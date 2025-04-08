package com.alejandromj.spring_boot1.configs;


import com.alejandromj.spring_boot1.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StoneConfigs {

    //Los métodos tienen que ser públicos.
    @Bean(name = "mind")
    @Scope("prototype")
    public MindStone mindStone(){
        return new MindStone();
    }

    //Los métodos tienen que ser públicos.
    @Bean(name = "power")
    @Scope("prototype")
    public PowerStone powerStone(){
        return new PowerStone();
    }

    //Los métodos tienen que ser públicos.
    @Bean(name = "reality")
    @Scope("prototype")
    public RealityStone realityStone(){
        return new RealityStone();
    }

    //Los métodos tienen que ser públicos.
    @Bean(name = "soul")
    @Scope("prototype")
    public SoulStone soulStone(){
        return new SoulStone();
    }

    //Los métodos tienen que ser públicos.
    @Bean(name = "space")
    @Scope("prototype")
    public SpaceStone spaceStone(){
        return new SpaceStone();
    }

    //Los métodos tienen que ser públicos.
    @Bean(name = "time")
    @Scope("prototype")
    public TimeStone timeStone(){
        return new TimeStone();
    }

}
