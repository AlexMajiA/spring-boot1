package com.alejandromj.spring_boot1.models;

import com.alejandromj.spring_boot1.utils.AvengerNotifier;
import lombok.ToString;
import lombok.extern.java.Log;

@ToString (callSuper = true)
@Log
public class RealityStone extends Stone{

    public RealityStone(
            String colorProperty,
            String nameProperty,
            String locationProperty,
            Integer energyLevelProperty
    ) {
        super(colorProperty, nameProperty, locationProperty, energyLevelProperty);
    }

    public void sendReality(){
        AvengerNotifier.sendNotification(RealityStone.class);
    }

    @Override
    public void usePower() {
        //Business logic
        System.out.println("Alter reality: " + super.toString());
    }

}
