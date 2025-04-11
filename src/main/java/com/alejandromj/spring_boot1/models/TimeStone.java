package com.alejandromj.spring_boot1.models;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString (callSuper = true)
@Log
public class TimeStone extends Stone{

    public TimeStone() {

        super();
    }

    @Override
    public void usePower() {

        //Business logic
        System.out.println("Control time: " + super.toString());
    }

}
