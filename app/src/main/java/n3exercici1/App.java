package n3exercici1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creem una instància de la classe Convertidor i la injectem al constructor del nostre Inventari
		ConvertidorMoneda convertidor = new ConvertidorMoneda();
		Inventari llistaCompra = new Inventari(convertidor);
		
		llistaCompra.afegirArticle(new Article("Pc",1045,"euro"));
		llistaCompra.afegirArticle(new Article("Cotxe",203456.45,"dollar"));
		llistaCompra.afegirArticle(new Article("Mobil",650.99,"dollar"));
		llistaCompra.afegirArticle(new Article("Mobil",650.99,"euro"));
		llistaCompra.afegirArticle(new Article("Boli",0.99,"dollar"));
		llistaCompra.afegirArticle(new Article("Llibreta",1.59,"euro"));
		
		
		llistaCompra.mostrarPreusDollar();
		System.out.println("-------------------------------------");
		llistaCompra.mostrarPreusEuro();
	}

}
