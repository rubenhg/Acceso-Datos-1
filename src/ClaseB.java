import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ClaseB {
	// lectura fichero escritura datos

	public Scanner scan = new Scanner(System.in);

	public ArrayList<String> leerTeclado() {
  //
		System.out.print("¿Cuantas películas queires? : ");
		int numPeliculas = scan.nextInt();
		System.out.println("");
		ArrayList<String> auxiliar = new ArrayList<String>();
		for (int i = 0; i < numPeliculas; i++) {

			System.out.print("La pelicula seleccionada es: ");
			auxiliar.add(scan.next());

			System.out.print("El autor es: ");
			auxiliar.add(scan.next());

			// System.out.println("Pasa por aqui");

			// System.out.println(auxiliar);

		}
		return auxiliar;

	}

	public void muestraPantalla(ArrayList<String> Arr) {

		for (int i = 0; i < Arr.size(); i++) {
			System.out.println(Arr.get(i));
		}

	}

}
