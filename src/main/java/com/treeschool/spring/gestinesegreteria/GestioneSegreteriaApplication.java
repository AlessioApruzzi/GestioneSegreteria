package com.treeschool.spring.gestinesegreteria;

import com.treeschool.spring.gestinesegreteria.beanconfiguration.ApplicationConfig;
import com.treeschool.spring.gestinesegreteria.config.StudentManager;
import com.treeschool.spring.gestinesegreteria.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class GestioneSegreteriaApplication {

	static Logger logger = LoggerFactory.getLogger(ApplicationRunner.class);


	public static void main(String[] args) {

		logger.info("*** SYSTEM STARTUP ***");

		SpringApplication.run(com.treeschool.spring.gestinesegreteria.ApplicationRunner.class, args);

		logger.info("*** SYSTEM STARTUP - END ***");







	}

}
