package n2exercici1;

public class ContacteEspanya implements Contacte {
	private String nom;
	private String telefon;
	private String adreça;
	private String ciutat;
	private final String pais = "Espanya";
	private final String prefixTelefon ="+34";
			
	public ContacteEspanya(String nom, String telefon, String adreça, String ciutat) {
		this.nom = nom;
		this.telefon = telefon;
		this.adreça = adreça;
		this.ciutat = ciutat;
	}

	@Override
	public String mostrarInformacio() {
		return "Nom: " + nom + ", Telefon: " + prefixTelefon + telefon + " (" + pais + "), Ciutat: " + ciutat + ", Adreça: " + adreça;
    
	}

}
