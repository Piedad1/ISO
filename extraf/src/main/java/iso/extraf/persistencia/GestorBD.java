package iso.extraf.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
	
	
}