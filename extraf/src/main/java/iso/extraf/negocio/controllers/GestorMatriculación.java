package iso.extraf.negocio.controllers;

import iso.extraf.negocio.entities.CursoPropio;
import iso.extraf.negocio.entities.Estudiante;
import iso.extraf.negocio.entities.Matricula;
import iso.extraf.negocio.entities.Matricula.ModoPago;
///////
public class GestorMatriculación {

	public static boolean realizarMatriculacion(CursoPropio curso, Estudiante estudiante) {
		boolean result = Matricula.realizarMatriculacion(curso, estudiante);
		return true;
	}

	public Matricula realizarPagoMatricula (CursoPropio curso, Estudiante estudiante) {
		return null;
	}
	
	private ModoPago realizarPagoTarjeta (CursoPropio curso, Estudiante estudiante) {
		return null;
	}
	
	private ModoPago realizarPagoTransferencia (CursoPropio curso, Estudiante estudiante) {
		return null;
	}
}
