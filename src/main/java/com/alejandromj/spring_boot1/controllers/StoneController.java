package com.alejandromj.spring_boot1.controllers;


import com.alejandromj.spring_boot1.models.PowerStone;
import com.alejandromj.spring_boot1.models.Stone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Qualifier: Se usa para especificar qué bean concreto quieres que se inyecte.
 * @RestController: Anotación que marca esta clase como controlador REST, o sea, que
 * responde a peticiones HTTP devolviendo datos (normalmente en JSON).
 */

@RestController  //Spring crea una instancia de esta clase y la registra como un endpoint REST.
public class StoneController {

    private final Stone stone;

    //Constructor por parámetros,
    @Autowired
    public StoneController(@Qualifier ("power")Stone stone) {
        this.stone = stone;
    }

    /**
     * Spring Boot busca un Bean de tipo Stone que esté anotado con @Qualifier("power"), es decir, una gema que tú
     * has nombrado como "power" en algún lugar de tu configuración o clase.
     * Este Bean se inyecta automáticamente gracias a Spring.
     * ✅ Esto es una forma de Inyección de Dependencias, donde Spring se encarga de pasar el objeto Stone al constructor
     * sin que tú lo instancies.
     * @return
     */
    //Este metodo devuelve la gema inyectada, asumiendo que es de tipo PowerStone.
    @GetMapping
    public PowerStone powerStone() {
    return (PowerStone) this.stone;     //Convierte (cast) la variable stone a PowerStone.

    }



}
