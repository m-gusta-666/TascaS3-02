package n3exercici1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Inventari {

	NumberFormat formatter = new DecimalFormat("#0.00");     
	
	private ArrayList<Article> articles;
	private ConvertidorMoneda convertidor;
	
	
	public Inventari(ConvertidorMoneda convertidor) {
		
		articles = new ArrayList<Article>();
		this.convertidor = convertidor;
	}
	
	
	public void afegirArticle(Article article) {
		articles.add(article);
	}
	
	
	public void mostrarPreusDollar() {
		
		System.out.println("Mostrant preus dels articles en dollars");
		
		for (int i=0 ; i<articles.size() ; i++) {
			if (articles.get(i).getMoneda().equals("euro")) {
				System.out.println(formatter.format(convertidor.euroToDollar(articles.get(i).getPreu())));
			} else {
				System.out.println(formatter.format(articles.get(i).getPreu()));
			}
		}
	}
	
	public void mostrarPreusEuro() {
		
		System.out.println("Mostrant preus dels articles en euros");
		
		for (int i=0 ; i<articles.size() ; i++) {
			if (articles.get(i).getMoneda().equals("dollar")) {
				System.out.println(formatter.format(convertidor.dollarToEuro(articles.get(i).getPreu())));
			} else {
				System.out.println(formatter.format(articles.get(i).getPreu()));
			}
		}
	}
	
	
}
