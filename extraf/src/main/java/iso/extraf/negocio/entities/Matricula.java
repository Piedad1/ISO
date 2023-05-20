package iso.extraf.negocio.entities;

import java.util.Date;
///////
import iso.extraf.persistencia.CursoPropioDAO;

public class Matricula {
	
	public enum ModoPago {
		TARJETA_CREDITO, TRANSFERENCIA
	}
	
	private static CursoPropioDAO dao = new CursoPropioDAO();
	private Date fecha;
	private boolean pagado;
	private CursoPropio titulo;
	private Estudiante estudiante;
	private ModoPago pago;
	public Matricula() {

	}

	public Matricula(Date fecha, boolean pagado, CursoPropio titulo, Estudiante estudiante, ModoPago pago) {
		this.fecha = fecha;
		this.pagado = pagado;
		this.titulo = titulo;
		this.estudiante = estudiante;
		this.pago = pago;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	public static boolean realizarMatriculacion(CursoPropio curso, Estudiante estudiante) {
		dao.realizarMatriculacion(curso, estudiante);
		boolean result = true;
		return result;
	}
}
