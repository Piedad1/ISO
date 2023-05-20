package iso.extraf.controllers;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;

import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Spy;

import iso.extraf.negocio.controllers.GestorPropuestasCursos;
import iso.extraf.negocio.entities.CursoPropio;
import iso.extraf.persistencia.CursoPropioDAO;
import static org.junit.Assert.assertTrue;

public class GestorPropuestaCursoTest {
	GestorPropuestasCursos gpc;

	@Before
	public void init() {
		this.gpc = new GestorPropuestasCursos();
	}

	@Test
	public void realizarPropuestaCurso_debe_crear_un_curso_vacio_sin_id() {
		// When
		CursoPropio cp = gpc.realizarPropuestaCurso();

		// Then
		org.junit.Assert.assertNotNull(cp);
		org.junit.Assert.assertNull(cp.getId());
	}

	@Test
	public void realizarPropuestaCurso_debe_crear_un_curso_vacio_sin_persistirlo() {
		// Given
		CursoPropioDAO dao = new CursoPropioDAO();
		CursoPropioDAO daoSpy = spy(dao);

		// When
		CursoPropio cp = gpc.realizarPropuestaCurso(daoSpy);

		// Then
		verifyNoInteractions(daoSpy);
	}
}
