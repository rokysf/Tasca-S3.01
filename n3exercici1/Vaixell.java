package n3exercici1;

public class Vaixell implements Vehicle{

	@Override
	public void arrencar() {
		System.out.println("El vaixell ha arrencat");
		
	}

	@Override
	public void accelerar() {
		System.out.println("El vaixell ha accelerat");
		
	}

	@Override
	public void frenar() {
		System.out.println("El vaixell ha frenat");
		
	}

}
