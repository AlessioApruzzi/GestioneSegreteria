package com.treeschool.spring.gestinesegreteria;

import com.treeschool.spring.gestinesegreteria.beanconfiguration.ApplicationConfig;
import com.treeschool.spring.gestinesegreteria.config.StudentManager;
import com.treeschool.spring.gestinesegreteria.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner implements CommandLineRunner {
    Logger logger = LoggerFactory.getLogger(ApplicationRunner.class);


    @Override
    public void run(String... args) throws Exception {

        logger.info("*** SPRING BOOT STARTUP - START ***");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        StudentManager studentManager = (StudentManager) ctx.getBean("getStudentManager");




        // Aggiungi 5 studenti
        studentManager.addStudent(new Student(1, "M001", "Mario Rossi", 20));
        studentManager.addStudent(new Student(2, "M002", "Luca Bianchi", 22));
        studentManager.addStudent(new Student(3, "F001", "Laura Verdi", 21));
        studentManager.addStudent(new Student(4, "F002", "Giulia Neri", 19));
        studentManager.addStudent(new Student(5, "M003", "Antonio Gialli", 23));

        // Stampa l'elenco degli studenti
        /*System.out.println("Elenco degli studenti:");
        for (
                Student studente : studentManager.getRegisteredStudents()) {
            System.out.println(studente);
        }

         */
        logger.info("* Elenco Studenti *");
        for (
                Student studente : studentManager.getRegisteredStudents()) {
            logger.info(studente.toString());
        }


        logger.info("*** SPRING BOOT STARTUP - END ***");
    }



}
