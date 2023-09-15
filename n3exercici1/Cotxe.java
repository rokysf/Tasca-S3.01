package n3exercici1;

public class Cotxe implements Vehicle{

	@Override
	public void arrencar() {
		System.out.println("El cotxe ha arrencat");
		
	}

	@Override
	public void accelerar() {
		System.out.println("El cotxe ha accelerat");
		
	}

	@Override
	public void frenar() {
		System.out.println("El cotxe ha frenat");
		
	}

}
