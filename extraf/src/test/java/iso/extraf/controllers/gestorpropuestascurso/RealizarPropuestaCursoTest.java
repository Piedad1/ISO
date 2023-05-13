package iso.extraf.controllers.gestorpropuestascurso;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import iso.extraf.negocio.controllers.GestorPropuestasCursos;
import iso.extraf.negocio.entities.CursoPropio;

public class RealizarPropuestaCursoTest {
	
	GestorPropuestasCursos gpc = new GestorPropuestasCursos();
	
	@Before
	public void init() {
		this.gpc = new GestorPropuestasCursos();
	}
	
	
	@Test
	public void debeCrearUnCursoPorDefectoSinId() {
		//When
		CursoPropio cp = gpc.realizarPropuestaCurso();
		
		//Then
		org.junit.Assert.assertNotNull(cp);
		org.junit.Assert.assertNull(cp.getId());
		
	}
	
	
	

}
