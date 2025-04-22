package com.alejandromj.spring_boot1.components;


import com.alejandromj.spring_boot1.services.GuantletService;
import com.alejandromj.spring_boot1.utils.AvengerNotifier;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
//@Lazy

public class Thanos implements ApplicationEventPublisherAware, ResourceLoaderAware {

    private final GuantletService guantletService;

   private ApplicationEventPublisher publisher;
    @PostConstruct
        public void init(){
            AvengerNotifier.sendNotification(this.getClass());
        }


        public void snap(){
            log.info("Thanos snap");
            this.guantletService.useFullPower();
            this.publisher.publishEvent(new ThanosEvent(this));
        }

        @PreDestroy
        public void destroy(){
        log.warn("BATTLE END");
        }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        final Resource resource = resourceLoader.getResource("classpath:configs/stone.properties");

        if (!resource.isReadable()){
            throw new IllegalStateException("Cant create Thanos because not exist confid file");
        }
    }

    public static class ThanosEvent extends ApplicationEvent{

            public ThanosEvent(Object source) {
                super(source);  //publish in context
            }
        }



}
