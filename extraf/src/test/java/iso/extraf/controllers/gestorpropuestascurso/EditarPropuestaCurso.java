package iso.extraf.controllers.gestorpropuestascurso;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import iso.extraf.negocio.controllers.GestorPropuestasCursos;
import iso.extraf.negocio.entities.CursoPropio;

public class EditarPropuestaCurso {
	GestorPropuestasCursos gpc;
	CursoPropio cursoTest1; 
	
	@Before
	public void init() {
		this.gpc = new GestorPropuestasCursos();
		Date inicio = new Date(2022,6,20);
		Date fin = new Date(2023,6,20);
		this.cursoTest1 = new CursoPropio("1", "prueba", 120, inicio, fin, 300d, 1);
	}
	
	
	@Test
	public void debeActualizarElCursoEnPersistencia() {
		
		this.gpc.editarPropuestaCurso(cursoTest1);
	}
}
