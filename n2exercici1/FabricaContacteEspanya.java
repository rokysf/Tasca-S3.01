package n2exercici1;

public class FabricaContacteEspanya implements FabricaContacte{

	@Override
	public Contacte crearContacte(String nom, String telefon, String adreça, String ciutat) {
		return new ContacteEspanya(nom, telefon, adreça, ciutat);
	}

}
