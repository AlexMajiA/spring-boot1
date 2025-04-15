package com.alejandromj.spring_boot1.configs;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableConfigurationProperties  //Configura valores mediante properties sin utilizar el @Value
@PropertySource("classpath:configs/Thanos.properties")  //Carga el classpath con las configuraciones
public class ThanosConfigs {

}
