package com.alejandromj.spring_boot1.models;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString (callSuper = true)
@Log
public class PowerStone extends Stone {

    //Constantes.
    private static final String COLOR = "Purple";
    private static final String NAME = "Power Stone";
    private static final String LOCATION = "Nova Corps";
    private static final int ENERGY_lEVEL = 10;

    public PowerStone() {
        super(COLOR, NAME, LOCATION, ENERGY_lEVEL);
    }

    @Override

    public void usePower() {

        //Business logic
        System.out.println("Incrase power and energy: " + super.toString());
    }

}