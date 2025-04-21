package com.alejandromj.spring_boot1.models;

import com.alejandromj.spring_boot1.utils.AvengerNotifier;
import lombok.ToString;
import lombok.extern.java.Log;

@ToString (callSuper = true)
@Log
public class SoulStone extends Stone{


    public SoulStone(
            String colorProperty,
            String nameProperty,
            String locationProperty,
            Integer energyLevelProperty
    ) {
        super(colorProperty, nameProperty, locationProperty, energyLevelProperty);
    }

    public void sendSoul(){
        AvengerNotifier.sendNotification(SoulStone.class);
    }

    @Override
    public void usePower() {
        //Business logic
        System.out.println("Total control of person: " + super.toString());
    }

}
