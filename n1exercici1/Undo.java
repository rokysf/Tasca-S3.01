package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

	private static Undo instancia;

	private List<String> comandos;

	private Undo() {
		comandos = new ArrayList<>();
	}

	public static Undo crearInstancia() {
		if (instancia == null) {
			instancia = new Undo();
		}
		return instancia;
	}

	public void afegirComandos(String comando) {
		comandos.add(comando);
	}

	public void esborrarComandos() {
		if (!comandos.isEmpty()) {
			comandos.remove(comandos.size() - 1);
		} else {
			System.out.println("No hi han comandos per esborrar");
		}
	}

	public void llistarComandos() {
		if (!comandos.isEmpty()) {
			System.out.println("Llistat de comandos");
			for (String comando : comandos) {
				System.out.println(comando);
			}
		} else {
			System.out.println("No hi han comandos per llistar");
		}
	}
}
