package com.alejandromj.spring_boot1.models;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString (callSuper = true)
@Log
public class SpaceStone extends Stone {


    public SpaceStone() {

        //SUPER = Se refiere al constructor del padre.
        super();
    }

    @Override
    public void usePower() {
        //Business logic
        System.out.println("Manipulate all space: " + super.toString());
    }

}
