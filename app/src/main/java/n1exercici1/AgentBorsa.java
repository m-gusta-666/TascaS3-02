package n1exercici1;

import java.util.ArrayList;

public class AgentBorsa {

	
	private String nom;
	private ArrayList<AgenciaBorsa> agencies;
	
	public AgentBorsa(String nom) {
		this.nom = nom;
		agencies = new ArrayList<AgenciaBorsa>();
	}
	
	public void afegirAgencia(AgenciaBorsa agencia) {
		agencies.add(agencia);
	}
	
	
	public void notificarPujada() {
		agencies.forEach(a->a.update("pujat"));
		System.out.println();
		System.out.println("L'agent " + nom + " ha notificat a totes les agencies de la pujada");
		System.out.println("------------------------------------------");
	}
	
	
	public void notificarBaixada() {
		agencies.forEach(a->a.update("baixat"));
		System.out.println();
		System.out.println("L'agent " + nom + " ha notificat a totes les agencies de la baixada");
		System.out.println("------------------------------------------");
	}
}
