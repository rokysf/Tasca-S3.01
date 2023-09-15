package n3exercici1;

public class Avio implements Vehicle{

	@Override
	public void arrencar() {
		System.out.println("L'avió ha arrencat");
		
	}

	@Override
	public void accelerar() {
		System.out.println("L'avió ha accelerat");
		
	}

	@Override
	public void frenar() {
		System.out.println("El cotxe ha frenat");
		
	}

}
