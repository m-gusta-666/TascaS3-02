package n2exercici1;

public class App {

	public static void main(String[] args) {
		
		
		
		BotigaSabates botiga = new BotigaSabates("Pepe");
		Pagament targeta = new PagamentTargeta(25);
		
		botiga.pagar(targeta);

	}

}
