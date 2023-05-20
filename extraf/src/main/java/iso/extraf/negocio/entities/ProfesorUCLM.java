package iso.extraf.negocio.entities;

public class ProfesorUCLM extends Profesor {

	public enum CategoriaProfesor {
		CATEDRATICO, TITULAR_UNIVERSIDAD, CONTRATADO_DOCTOR, AYUDANTE_DOCTOR, AYUDANTE, ASOCIADO
	}
	
	private Centro centroAdquisicion;
	private CategoriaProfesor categoria;

	public ProfesorUCLM() {

	}

	public ProfesorUCLM(String dni, String nombre, String apellidos, boolean doctor, CategoriaProfesor categoria) {
		super(dni, nombre, apellidos, doctor);
		this.categoria = categoria;
	}

}
