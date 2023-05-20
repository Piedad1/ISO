package iso.extraf.negocio.controllers;

import iso.extraf.negocio.entities.CursoPropio;
import iso.extraf.negocio.entities.CursoPropio.EstadoCurso;
import iso.extraf.persistencia.CursoPropioDAO;

public class GestorPropuestasCursos {
	public CursoPropio realizarPropuestaCurso() {
		return new CursoPropio();
	}

	public CursoPropio realizarPropuestaCurso(CursoPropioDAO dao) {
		return new CursoPropio(dao);
	}

	public CursoPropio editarPropuestaCurso(CursoPropio curso) {
		return curso;
	}
	
	public CursoPropio crearPropuestaCurso (CursoPropio curso) {
		curso.getDao().crearNuvoCurso(curso);
		return curso;
	}
	
	public EstadoCurso evaluarPropuesta(CursoPropio curso) {
		return null;
	}
	
}
