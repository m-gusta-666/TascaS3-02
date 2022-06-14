package n2exercici1;

public class Pasarela {

	
	private Pagament pagament;
	private BotigaSabates botiga;

	
	
	public Pasarela(Pagament pagament, BotigaSabates botiga) {
		this.pagament = pagament;
		this.botiga = botiga;
		
	}


	public void run() {
		pagament.executar();
		botiga.pagat();
	}
}
