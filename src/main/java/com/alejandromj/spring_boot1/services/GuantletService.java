package com.alejandromj.spring_boot1.services;

import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;

public interface GuantletService extends
        ApplicationContextAware,  //BeanFactoryAware es una versión simplificada de  ApplicationContextAware
        EnvironmentAware,
        BeanNameAware {

void useGuantlet(String stoneName);

//Metodo para usar el guante con las 6 gemas.
void useFullPower();

}
