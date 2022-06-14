package n1exercici1;

public class AgenciaBorsa {

	
	private String nom;
	
	public AgenciaBorsa(String nom) {
		this.nom = nom;	
	}
	
	
	public void update(String s) {
		System.out.println("L'agència " + nom + " ha estat notificada que la borsa ha " + s);
	}
	
	
}
