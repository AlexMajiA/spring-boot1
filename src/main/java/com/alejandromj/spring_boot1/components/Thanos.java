package com.alejandromj.spring_boot1.components;


import com.alejandromj.spring_boot1.services.GuantletService;
import com.alejandromj.spring_boot1.utils.AvengerNotifier;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
//@Lazy

public class Thanos {

    private final GuantletService guantletService;

    @PostConstruct
        public void init(){
            AvengerNotifier.sendNotification(this.getClass());
        }


        public void snap(){
            log.info("Thanos snap");
            this.guantletService.useFullPower();
        }

        @PreDestroy
        public void destroy(){
        log.warn("BATTLE END");
        }
}
