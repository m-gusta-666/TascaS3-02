package n2exercici1;

public class BotigaSabates {

	private String nom;
	
	public BotigaSabates(String nom) {
		this.nom = nom;
	}
	
	
	
	public void pagar(Pagament pagament) {
		Pasarela pasarela = new Pasarela(pagament,this);
		pasarela.run();
	}
	
	
	public void pagat() {
		System.out.println("S'ha realitzat el pagament");
	}
}
