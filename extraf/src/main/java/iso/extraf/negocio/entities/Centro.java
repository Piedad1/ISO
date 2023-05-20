package iso.extraf.negocio.entities;

import java.util.List;

//////
public class Centro {
	private String nombre;
	private String localizacion;
	private List<ProfesorUCLM> plantilla;

	public Centro() {
	}

	public Centro(String nombre, String localizacion) {
		this.nombre = nombre;
		this.localizacion = localizacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
}
