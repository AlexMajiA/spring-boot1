package com.alejandromj.spring_boot1;

import com.alejandromj.spring_boot1.components.ThanosComponent;
import com.alejandromj.spring_boot1.services.GuantletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringBoot1Application implements CommandLineRunner {

@Autowired
private final GuantletService guantletService;

    public SpringBoot1Application(GuantletService guantletService) {
        this.guantletService = guantletService;
    }


//----------------------------------------------------------------------------------------------------------------------
/*
    @Autowired
    private ThanosComponent thanos;
*/


//----------------------------------------------------------------------------------------------------------------------

    /*
    @Autowired
    @Qualifier(value = "mind")
    private Stone mindStone;

    @Autowired
    @Qualifier(value = "power")
    private Stone powerStone;

    @Autowired
    @Qualifier(value = "reality")
    private Stone realityStone;

    @Autowired
    @Qualifier(value = "soul")
    private Stone soulStone;

    @Autowired
    @Qualifier(value = "space")
    private Stone spaceStone;

    @Autowired
    @Qualifier(value = "time")
    private Stone timeStone;
*/

//----------------------------------------------------------------------------------------------------------------------
 /*
    //En @Value se usa $ para llamar a variables y # para métodos.
    @Value(value = "${spring.application.name:default-value}")
        private String value ;

    @Value("${stones.mind.enabled}")
        private boolean mindEneable;
    @Autowired
        private PowerStone powerStone;
*/
//----------------------------------------------------------------------------------------------------------------------

	//@Autowired

	//Implemento la clase que extiende de la interfaz así, porque solo tengo una, en caso de haber más es necesario
	//marcar la principal con @Primary.
	//GuantletService guantletService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

       guantletService.useGuantlet("mind");


//----------------------------------------------------------------------------------------------------------------------

        //thanos.snap();



      //  System.out.println(value);
      //  System.out.println(powerStone);
      //  System.out.println(mindEneable);

//----------------------------------------------------------------------------------------------------------------------
    /*
        System.out.println(this.mindStone.toString());
        System.out.println(this.powerStone.toString());
        System.out.println(this.realityStone.toString());
        System.out.println(this.soulStone.toString());
        System.out.println(this.spaceStone.toString());
        System.out.println(this.timeStone.toString());

     */
    }
//----------------------------------------------------------------------------------------------------------------------

/*
	@Override
	public void run(String... args) throws Exception {
		this.guantletService.useFullPower();
	}
 */


}
