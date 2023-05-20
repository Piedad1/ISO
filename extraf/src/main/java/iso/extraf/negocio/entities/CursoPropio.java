package iso.extraf.negocio.entities;

import java.util.Date;
import java.util.List;
import java.util.*;
import iso.extraf.persistencia.*;

public class CursoPropio {
	
	public enum TipoCurso {
		MASTER, EXPERTO, ESPECIALISTA, FORMACION_AVANZADA, FORMACION_CONTINUA, MICROCREDENCIALES, CORTA_DURACION
	}

	public enum EstadoCurso {
		PROPUESTO, VALIDADO, PROPUESTA_RECHAZADA, EN_MATRICULACION, EN_IMPARTICION, TERMINADO
	}
	
	private String id;
	private String nombre;
	private int ects;
	private Date fechaInicio;
	private Date fechaFin;
	private double tasaMatricula;
	private int edicion;
	private List<Materia> materias;
	private Centro centro;
	private List<Matricula> matriculas;
	private Profesor director;
	private Profesor secretario;
	private CursoPropioDAO dao;
	private TipoCurso tipo;
	private EstadoCurso estado;

	public CursoPropio(CursoPropioDAO dao) {
		this.materias = new ArrayList();
		this.dao = dao;
	}

	public CursoPropio() {
		this(new CursoPropioDAO());
	}

	public CursoPropio(String id, String nombre, int ects, Date fechaInicio, Date fechaFin, double tasaMatricula,
			int edicion, Profesor director, Profesor secretario, TipoCurso tipo, EstadoCurso estado) {
		this();
		this.id = id;
		this.nombre = nombre;
		this.ects = ects;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tasaMatricula = tasaMatricula;
		this.edicion = edicion;
		this.director = director;
		this.secretario = secretario;
		this.tipo = tipo;
		this.estado = estado;
	}

	public CursoPropioDAO getDao() {
		return dao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEcts() {
		return ects;
	}

	public void setEcts(int ects) {
		this.ects = ects;
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

	public double getTasaMatricula() {
		return tasaMatricula;
	}

	public void setTasaMatricula(double tasaMatricula) {
		this.tasaMatricula = tasaMatricula;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

}
