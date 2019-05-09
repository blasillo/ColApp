package es.jcyl.colapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import es.jcyl.colapp.config.SeguridadConfig;
import es.jcyl.colapp.controladores.PrincipalCtrl;

@SpringBootApplication (exclude = { SecurityAutoConfiguration.class })
@ComponentScan(basePackageClasses=PrincipalCtrl.class)
public class ColappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColappApplication.class, args);
	}

}
