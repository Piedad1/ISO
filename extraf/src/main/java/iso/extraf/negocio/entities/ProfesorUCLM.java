package iso.extraf.negocio.entities;

public class ProfesorUCLM extends Profesor{

	private Centro centroAdquisicion;
	
	public ProfesorUCLM() {
		
    }
	
    public ProfesorUCLM(String dni, String nombre, String apellidos, boolean doctor) {
        super(dni, nombre, apellidos, doctor);
    }
    
    

}
