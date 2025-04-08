package com.alejandromj.spring_boot1.models;

import lombok.ToString;
import lombok.extern.java.Log;

//Llama al constructor del padre, como este tiene ToString, implementa sus hijos.
@ToString (callSuper = true)
@Log
public class MindStone extends Stone{

    //Constantes.
    private static final String COLOR = "Yelow";
    private static final String NAME = "Power Stone";
    private static final String LOCATION = "Scepter";
    private static final int ENERGY_lEVEL = 4;

    public MindStone() {
        super(COLOR, NAME, LOCATION, ENERGY_lEVEL);
    }

    @Override
    public void usePower() {
        //Business logic
        System.out.println("Mind control in stone: " + super.toString());

    }


}