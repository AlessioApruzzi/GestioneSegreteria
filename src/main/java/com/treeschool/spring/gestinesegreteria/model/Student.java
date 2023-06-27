package com.treeschool.spring.gestinesegreteria.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

    private int id;
    private String matricola, nome;
    private int eta;
}
