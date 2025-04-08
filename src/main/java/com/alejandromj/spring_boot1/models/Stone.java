package com.alejandromj.spring_boot1.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * La clase Stone es una clase abstracta base para todas las gemas. Define propiedades comunes y fuerza a las subclases
 * a implementar su poder (usePower()).
 */

/**
 * Anotaciones Lombok:
 * @Getter, @Setter: genera automáticamente los métodos get y set para todos los atributos.
 * @EqualsAndHashCode: genera equals() y hashCode() basados en todos los campos de la clase.
 * @ToString: genera un método toString() con los valores de los atributos.
 * Serializable: permite que los objetos Stone puedan convertirse en una secuencia de bytes (importante si los quieres
 * guardar en archivos, enviar por red o clonar).
 */

@Getter
@Setter
@EqualsAndHashCode
@ToString
public abstract class Stone implements Serializable {

    //Atributos
    protected String color;    //protected: para que las subclases (como MindStone) puedan acceder a ellos directamente.
    protected String name;
    protected String location;
    protected Integer energyLevel;
    protected Integer numberOfSides;

    //Añado una constante estática puesto que todas las gemas tienen 6 lados.
    public static final int NUMBER_SIDES =6;

    //Constructor.
    public Stone(String color, String name, String location, Integer energyLevel) {
        this.color = color;
        this.name = name;
        this.location = location;
        this.energyLevel = energyLevel;
        this.numberOfSides = NUMBER_SIDES;
    }

    /**
     * Metodo abstracto: obliga a que cada subclase (MindStone, PowerStone, etc.) implemente su propia versión del metodo.
     * Esto es clave para que cada gema tenga su propia lógica de uso.
     */
    public abstract void usePower();

    //Metodo normal (no abstracto), disponible para todas las subclases. Simula una operación de "limpieza" o reseteo de la gema.
    public void clear(){
        System.out.println("Cleaning stone");
    }

}
