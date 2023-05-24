package iso.extraf.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GestorBD {
	public static GestorBD conectarBD() {
		Connection conn = null;
		try {
			// db parameters
			conn = DriverManager.getConnection("jdbc:sqlite:db.sqlite3");

			System.out.println("--- Conectado a base de datos ---");

			return new GestorBD(conn);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return null;
	}

	private Connection conn;

	public GestorBD(Connection conn) {
		this.conn = conn;
	}

	public void desconectar() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Object[]> select(String sql) {

		PreparedStatement stmt;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.execute();
			ResultSet rs = stmt.getResultSet();
			List<Object[]> filas = new ArrayList<>();
			int numColumnas = rs.getMetaData().getColumnCount();
			
			
			// Cada fila un array de objetos
			while (rs.next()) {
				Object[] fila = new Object[numColumnas];
				
				for(int i = 1; i < numColumnas; i++) {
					fila[i-1] = rs.getObject(i);
				}
				
				filas.add(fila);
			}
			
			return filas;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		return null;
	}

}