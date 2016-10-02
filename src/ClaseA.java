import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ClaseA {

	// lea fichero y escriba un fichero
	private FileReader fr;
	private BufferedReader br;
	private FileWriter fw;
	private BufferedWriter bw;
	String linea = new String();
	
	File fichero = new File("C:\\archivo.txt");

	public Object leerFichero() throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		// Fichero del que queremos leer

		try {
			fr = new FileReader(fichero);
			br = new BufferedReader(fr);

			while ((linea = br.readLine()) != null) {
				a.add(linea);
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return a;

	}

	public void guardarDatos(Object ed) throws IOException {

		fw = new FileWriter("C:\\archivo.txt");
		bw = new BufferedWriter(fw);

		@SuppressWarnings("unchecked")
		ArrayList<String> al = (ArrayList<String>) ed;
		for (int i = 0; i < al.size(); i++) {
			// System.out.println("pasa por aqui");
			// System.out.println(al.get(i));
			bw.write(al.get(i));
			bw.newLine();

		}
		bw.close();
	}

}
