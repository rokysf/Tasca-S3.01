package n3exercici1;

public class Frenar implements Command{
	private Vehicle vehicle;
	
	public Frenar(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	public void executar() {
		vehicle.frenar();
		
	}

}
