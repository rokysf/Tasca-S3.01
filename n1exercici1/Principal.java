package n1exercici1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Undo undo = Undo.crearInstancia();
		boolean menu = true;
		
		while(menu) {
			System.out.println("1. Afegir comando");
			System.out.println("2. Esborrar comando");
			System.out.println("3. Llistar historial");
			System.out.println("4. Sortir");
			System.out.println("Opcio: ");
			
			int opcio = sc.nextInt();
			sc.nextLine();
			
			switch(opcio) {
			case 1:
				System.out.println("Introdueix el comando a afegir");
				String comando = sc.nextLine();
				undo.afegirComandos(comando);
				break;
			case 2:
				undo.esborrarComandos();
				break;
			case 3:
				undo.llistarComandos();
				break;
			case 4:
				System.out.println("Sortint del programa");
				menu = false;
				break;
			default:
				System.out.println("L'opcio seleccionada no es valida");
					
			}
		}
	sc.close();
	}
}
