package n2exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Contacte> contactes = new ArrayList<Contacte>();
		boolean sortir = false;

		while (!sortir) {
			System.out.println("MENU");
			System.out.println("1. Afegir contacte d'Espanya");
			System.out.println("2. Afegir contacte d'Estats Units");
			System.out.println("3. Mostrar contactes");
			System.out.println("4. Sortir");

			int opcio = scanner.nextInt();
			scanner.nextLine();

			FabricaContacte nouContacte = null;

			switch (opcio) {
			case 1:
				nouContacte = new FabricaContacteEspanya();
				break;
			case 2:
				nouContacte = new FabricaContacteUSA();
				break;
			case 3:
				if (contactes.isEmpty()) {
					System.out.println("No hi han contactes a l'agenda");
				} else {
					System.out.println("Llista de contactes:");
					for (Contacte contacte : contactes) {
						System.out.println(contacte.mostrarInformacio());
					}
				}
				break;
			case 4:
				System.out.println("Fins Aviat.");
				sortir = true;
				break;
			default:
				System.out.println("Selecciona una opcio valida.");
				break;
			}

			if (opcio == 1 || opcio == 2) {
				System.out.println("Introdueix el nom del contacte:");
				String nom = scanner.nextLine();
				System.out.println("Introdueix el numero de telefon sense el prefix:");
				String telefon = scanner.nextLine();
				System.out.println("Introdueix l'adreça:");
				String adreça = scanner.nextLine();
				System.out.println("Introdueix la ciutat:");
				String ciutat = scanner.nextLine();

				Contacte contacte = nouContacte.crearContacte(nom, telefon, adreça, ciutat);
				contactes.add(contacte);
				System.out.println("Contacte afegit correctament.");
			}
		}

		scanner.close();
	}

}
