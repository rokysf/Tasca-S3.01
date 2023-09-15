package n3exercici1;

public class Accelerar implements Command{
	private Vehicle vehicle;
	
	public Accelerar(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	public void executar() {
		vehicle.accelerar();
	}

}
