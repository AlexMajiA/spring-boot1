package com.alejandromj.spring_boot1.utils;


import com.alejandromj.spring_boot1.components.Thanos;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

//Los packages utils, deben llevar siempre métodos estáticos.
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AvengerNotifier {


    public static void sendNotification(Class<?> clazz){     //clazz = nombre de la clase, class es una palabra reservada.
        log.warn("Attention new class created: {}", clazz.getName());


        if (clazz.equals(Thanos.class)){
            log.warn("DANGER START BATTLE!!!");
        }
    }

    public static void sendNotification(String msg){
        log.info(msg);
    }
}
