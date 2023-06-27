package com.treeschool.spring.gestinesegreteria.beanconfiguration;

import com.treeschool.spring.gestinesegreteria.config.StudentManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public StudentManager getStudentManager(){
        return new StudentManager();
    }
}
