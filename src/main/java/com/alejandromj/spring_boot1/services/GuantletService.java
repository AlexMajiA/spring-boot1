package com.alejandromj.spring_boot1.services;

import org.springframework.context.ApplicationContextAware;

public interface GuantletService extends ApplicationContextAware {

void useGuantlet(String stoneName);

//Metodo para usar el guante con las 6 gemas.
void useFullPower();

}
