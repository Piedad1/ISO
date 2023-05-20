package iso.extraf.negocio.entities;

//////
public class Estudiante {
	private String dni;
	private String nombre;
	private String apellido;
	private String titulacion;
	private String cualificacion;

	public Estudiante() {

	}

	public Estudiante(String dni, String nombre, String apellido, String titulacion, String cualificacion) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.titulacion = titulacion;
		this.cualificacion = cualificacion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public String getCualificacion() {
		return cualificacion;
	}

	public void setCualificacion(String cualificacion) {
		this.cualificacion = cualificacion;
	}
}
