package com.alejandromj.spring_boot1.models;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString (callSuper = true)
@Log
public class SpaceStone extends Stone {


    public SpaceStone(
            String colorProperty,
            String nameProperty,
            String locationProperty,
            Integer energyLevelProperty
    ) {
        super(colorProperty, nameProperty, locationProperty, energyLevelProperty);
    }

    @Override
    public void usePower() {
        //Business logic
        System.out.println("Manipulate all space: " + super.toString());
    }

}
