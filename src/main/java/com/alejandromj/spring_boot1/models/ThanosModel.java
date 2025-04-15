package com.alejandromj.spring_boot1.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "thanos.config")  //el p`refijo hace alusión al prefijo de las configuraciones.
@AllArgsConstructor
@NoArgsConstructor
@Data  //Crea Setter, Getter, HashCode y ToString automáticamente.

public class ThanosModel {

    //Sufijos de los properties
    private String planet;
    private String galaxy;
    private Integer defaultDestructionLevel;

}
