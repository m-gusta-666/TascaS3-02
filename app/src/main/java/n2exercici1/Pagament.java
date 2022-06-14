package n2exercici1;

public class Pagament {

	protected int quantitat;
	
	public Pagament(int quantitat) {
		this.quantitat = quantitat;
	}
	
	
	public void executar() {
		System.out.println("Executant el pagament de " + quantitat + " diners.");
	}
}
