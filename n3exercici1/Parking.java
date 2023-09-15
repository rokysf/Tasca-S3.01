package n3exercici1;

public class Parking {

	public static void main(String[] args) {
		Cotxe cotxe = new Cotxe();
		Bicicleta bicicleta = new Bicicleta();
		Avio avio = new Avio();
		Vaixell vaixell = new Vaixell();
		
		Invoker invoker = new Invoker();
		
		Command arrencarCotxe = new Arrencar(cotxe);
		Command accelerarAvio = new Accelerar(avio);
		Command frenarVaixell = new Frenar(vaixell);
		Command arrencarBicicleta = new Arrencar(bicicleta);
		
		invoker.setComando(arrencarCotxe);
		invoker.executarComando();
		invoker.setComando(accelerarAvio);
		invoker.executarComando();
		invoker.setComando(frenarVaixell);
		invoker.executarComando();
		invoker.setComando(arrencarBicicleta);
		invoker.executarComando();

	}

}
