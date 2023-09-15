package n3exercici1;

public class Bicicleta implements Vehicle{

	@Override
	public void arrencar() {
		System.out.println("La bicicleta ha arrencat");
		
	}

	@Override
	public void accelerar() {
		System.out.println("La bicicleta ha accelerat");
		
	}

	@Override
	public void frenar() {
		System.out.println("La bicicleta ha frenat");
		
	}

}
