package org.example.controller;

import org.example.model.CursoPropio;
import org.example.model.Estudiante;
import org.example.model.Matricula;

public class GestorMatriculacionController {

    public static boolean realizarMatriculacion(CursoPropio curso, Estudiante estudiante) {
        System.out.println("Hello world!");
        boolean result = Matricula.realizarMatriculacion(curso, estudiante);
        return true;
    }



}
