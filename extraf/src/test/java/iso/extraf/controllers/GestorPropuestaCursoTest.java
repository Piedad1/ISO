package iso.extraf.controllers;

import static org.junit.Assert.assertTrue;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import iso.extraf.negocio.controllers.GestorPropuestasCursos;
import iso.extraf.negocio.entities.CursoPropio;
import static org.junit.Assert.assertTrue;

public class GestorPropuestaCursoTest{
		GestorPropuestasCursos gpc;
		
		@Before
		public void init() {
			this.gpc = new GestorPropuestasCursos();
		}
		
		@Test
		public void realizarPropuestaCurso_debe_crear_un_curso_por_defecto_sin_id() {
			//When
			CursoPropio cp = gpc.realizarPropuestaCurso();
			
			//Then
			org.junit.Assert.assertNotNull(cp);
			org.junit.Assert.assertNull(cp);
		}
}
