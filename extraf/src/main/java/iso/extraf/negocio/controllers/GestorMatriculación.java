package iso.extraf.negocio.controllers;

import iso.extraf.negocio.entities.CursoPropio;
import iso.extraf.negocio.entities.Estudiante;
import iso.extraf.negocio.entities.Matricula;
///////
public class GestorMatriculación {

	public static boolean realizarMatriculacion(CursoPropio curso, Estudiante estudiante) {
        System.out.println("Hello world!");
        boolean result = Matricula.realizarMatriculacion(curso, estudiante);
        return true;
    }
	
}
