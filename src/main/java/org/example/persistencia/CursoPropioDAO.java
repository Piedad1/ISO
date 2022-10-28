package org.example.persistencia;

import org.example.model.CursoPropio;
import org.example.model.Estudiante;

import java.sql.Connection;
import java.sql.DriverManager;

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
