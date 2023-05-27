package iso.extraf;

import java.util.List;
import java.util.Map;

import iso.extraf.persistencia.GestorBD;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		GestorBD gbd = GestorBD.conectarBD();
		
		List<Map<String, Object>> resultado = gbd.select("SELECT * FROM cursospropios");
		
		System.out.println("Filas: " + resultado.size());
		
		for (Map<String, Object> fila : resultado) {
			
			System.out.println(fila.get("nombre") + " (" + fila.get("id") + ")");
		}
	}
}