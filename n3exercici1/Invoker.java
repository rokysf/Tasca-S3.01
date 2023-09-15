package n3exercici1;

public class Invoker {
	private Command comandament;
	
	public void setComando(Command comandament) {
		this.comandament = comandament;
	}

	public void executarComando() {
		comandament.executar();
	}
}
