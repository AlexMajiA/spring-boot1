package com.alejandromj.spring_boot1.models;

import com.alejandromj.spring_boot1.utils.AvengerNotifier;
import lombok.ToString;
import lombok.extern.java.Log;

@ToString (callSuper = true)
@Log
public class PowerStone extends Stone {

    public PowerStone(
            String colorProperty,
            String nameProperty,
            String locationProperty,
            Integer energyLevelProperty
    ) {
        super(colorProperty, nameProperty, locationProperty, energyLevelProperty);
    }

    public void sendPower(){
        AvengerNotifier.sendNotification(PowerStone.class);
    }

    @Override

    public void usePower() {

        //Business logic
        System.out.println("Incrase power and energy: " + super.toString());
    }

}