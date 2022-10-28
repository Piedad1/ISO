package org.example;


import org.example.controller.GestorMatriculacionController;
import org.example.model.CursoPropio;
import org.example.model.Estudiante;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!!");
        Estudiante estudiante = new Estudiante();
        CursoPropio curso = new CursoPropio();
        GestorMatriculacionController.realizarMatriculacion(curso, estudiante);
    }
}