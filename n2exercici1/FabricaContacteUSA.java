package n2exercici1;

public class FabricaContacteUSA implements FabricaContacte{

	@Override
	public Contacte crearContacte(String nom, String telefon, String adreça, String ciutat) {
		return new ContacteUSA(nom, telefon, adreça, ciutat);
	}

}
