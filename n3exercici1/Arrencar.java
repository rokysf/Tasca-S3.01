package n3exercici1;

public class Arrencar implements Command{
	private Vehicle vehicle;
	
	public Arrencar(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	public void executar() {
		vehicle.arrencar();
	}

}
