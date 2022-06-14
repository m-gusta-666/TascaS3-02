package n3exercici1;

public class Article {

	
	private String nom;
	private double preu;
	private String moneda;
	
	
	public Article(String nom, double preu, String moneda) {
		super();
		this.nom = nom;
		this.preu = preu;
		this.moneda = moneda;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getPreu() {
		return preu;
	}


	public void setPreu(double preu) {
		this.preu = preu;
	}


	public String getMoneda() {
		return moneda;
	}


	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	
	
	
}
