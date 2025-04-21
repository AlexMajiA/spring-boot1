package com.alejandromj.spring_boot1.models;

import com.alejandromj.spring_boot1.utils.AvengerNotifier;
import lombok.ToString;
import lombok.extern.java.Log;

/**
 * @ToString(callSuper = true):
 * Esta anotación de Lombok genera automáticamente un metodo toString() que incluye también el toString() de la clase
 * padre (Stone). Muy útil para ver toda la información cuando imprimes el objeto.
 */

//Llama al constructor del padre, como este tiene ToString, implementa sus hijos.
@ToString (callSuper = true)
@Log
public class MindStone extends Stone{


    public MindStone(
            String colorProperty,
            String nameProperty,
            String locationProperty,
            Integer energyLevelProperty
    ) {
        super(colorProperty, nameProperty, locationProperty, energyLevelProperty);
    }

    public void sendMind(){
        AvengerNotifier.sendNotification(MindStone.class);
    }

    @Override
    public void usePower() {
        //Business logic
        System.out.println("Mind control in stone: " + super.toString());

    }


}