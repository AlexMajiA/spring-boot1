package com.alejandromj.spring_boot1.models;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString (callSuper = true)
@Log
public class PowerStone extends Stone {

    public PowerStone() {

        super();
    }

    @Override

    public void usePower() {

        //Business logic
        System.out.println("Incrase power and energy: " + super.toString());
    }

}