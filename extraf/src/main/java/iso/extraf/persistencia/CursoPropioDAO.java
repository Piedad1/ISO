package iso.extraf.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

import iso.extraf.negocio.entities.CursoPropio;
import iso.extraf.negocio.entities.Estudiante;

public class CursoPropioDAO {
	private Connection dbConnection;

    public CursoPropioDAO() {
        try {

            this.dbConnection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "1234");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public CursoPropioDAO getDAO() {
        return new CursoPropioDAO();
    }

    public void realizarMatriculacion(CursoPropio curso, Estudiante estudiante) {



    }
}
