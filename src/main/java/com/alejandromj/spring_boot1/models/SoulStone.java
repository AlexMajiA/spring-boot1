package com.alejandromj.spring_boot1.models;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString (callSuper = true)
@Log
public class SoulStone extends Stone{


    public SoulStone() {

        super();
    }

    @Override
    public void usePower() {
        //Business logic
        System.out.println("Total control of person: " + super.toString());
    }

}
