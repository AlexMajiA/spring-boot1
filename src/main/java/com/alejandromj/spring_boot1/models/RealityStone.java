package com.alejandromj.spring_boot1.models;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString (callSuper = true)
@Log
public class RealityStone extends Stone{

    public RealityStone() {
        super();
    }

    @Override
    public void usePower() {
        //Business logic
        System.out.println("Alter reality: " + super.toString());
    }

}
