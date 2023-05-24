package iso.extraf;

import java.util.List;

import iso.extraf.persistencia.GestorBD;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		GestorBD gbd = GestorBD.conectarBD();
		
		List<Object[]> resultado = gbd.select("SELECT * FROM cursospropios");
		
		System.out.println(resultado.size());
		
		for (Object[] fila : resultado) {
			
			for (Object columna : fila) {
				System.out.print(columna + "\t");
			}
			
			System.out.println();
		}
	}
}

