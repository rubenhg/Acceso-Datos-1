import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class intermediario {

	ClaseA clasea;
	ClaseB claseb;
	Scanner teclado;

	public intermediario() {
		teclado = new Scanner(System.in); // Para leer las opciones de teclado
		clasea = new ClaseA();
		claseb = new ClaseB();
	}

	public void ejecucion() {
		int op = 0; // Opcion
		boolean salir = false;

		while (!salir) { // Estructura que repite el algoritmo del menu
							// principal hasta que se la condicion sea falsa
			// Se muestra el menu principal
			System.out.println(".......................... \n" + ".  1 Leer de teclado y escribir en fichero  \n"
					+ ".  2 Leer de fichero y escribir en pantalla \n" + ".  3 Salir \n"
					+ "..........................");
			try {
				op = teclado.nextInt(); // Se le da a la variable op el valor
										// del teclado
				System.out.println("OPCION SELECCIONADA:" + op);
				switch (op) {
				case 1:// Insertar Moneda
					tecladoFichero();
					break;
				case 2:// Retornar Monedas
					ficheroPantalla();
					break;
				case 3:// Salir
					salir = true;
					break;
				default:// No valido
					System.out.println("Opcion invalida: marque un numero de 1 a 3");
					break;
				}
			} catch (Exception e) {
				System.out.println("Excepcion por opcion invalida: marque un numero de 1 a 3");
				// flushing scanner
				// e.printStackTrace();
				teclado.next();
			}
		}

		// teclado.close();

	}

	private void ficheroPantalla() throws IOException {
		System.out.println("Pasamos datos de fichero a pantalla");

		Object ed = clasea.leerFichero();
		// ArrayList<String> ed = clasea.leerFichero();
		ArrayList<String> ed2 = (ArrayList<String>) ed;

		claseb.muestraPantalla(ed2);
		// claseb.muestraPantalla(ed);
		
		

	}

	private void tecladoFichero() throws IOException {
		System.out.println("Pasamos datos de teclado a fichero");
		Object ed = claseb.leerTeclado();
		clasea.guardarDatos(ed);

	}

}
