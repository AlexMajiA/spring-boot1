package com.alejandromj.spring_boot1.models;

import com.alejandromj.spring_boot1.utils.AvengerNotifier;
import lombok.ToString;
import lombok.extern.java.Log;

@ToString (callSuper = true)
@Log
public class TimeStone extends Stone{

    public TimeStone(
            String colorProperty,
            String nameProperty,
            String locationProperty,
            Integer energyLevelProperty
    ) {
        super(colorProperty, nameProperty, locationProperty, energyLevelProperty);
    }

    public void sendTime(){
        AvengerNotifier.sendNotification(TimeStone.class);
    }

    @Override
    public void usePower() {

        //Business logic
        System.out.println("Control time: " + super.toString());
    }


}
