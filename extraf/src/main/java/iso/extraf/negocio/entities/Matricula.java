package iso.extraf.negocio.entities;

import java.util.Date;
///////
import iso.extraf.persistencia.CursoPropioDAO;


public class Matricula {
	private static CursoPropioDAO dao = new CursoPropioDAO();
    private Date fecha;
    private boolean pagado;
    private String atribute;

    public Matricula() {

    }

    public Matricula(Date fecha, boolean pagado, String atribute) {
        this.fecha = fecha;
        this.pagado = pagado;
        this.atribute = atribute;
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

    public String getAtribute() {
        return atribute;
    }

    public void setAtribute(String atribute) {
        this.atribute = atribute;
    }

    public static boolean realizarMatriculacion(CursoPropio curso, Estudiante estudiante) {
        dao.realizarMatriculacion(curso, estudiante);
        boolean result = true;
        return result;
    }
}
