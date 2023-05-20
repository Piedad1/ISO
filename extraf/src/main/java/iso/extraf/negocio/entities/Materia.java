package iso.extraf.negocio.entities;

//////
import java.util.Date;

public class Materia {
	private String nombre;
	private double horas;
	private Date fechaInicio;
	private Date fechaFin;
	private Profesor responsable;

	public Materia() {
	}

	public Materia(String nombre, double horas, Date fechaInicio, Date fechaFin, Profesor responsable) {
		this.nombre = nombre;
		this.horas = horas;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.responsable = responsable;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
}
