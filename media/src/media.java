
import java.util.Scanner;


public class media {
	
	protected static String prix;
	
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
		System.out.println("Nombre de media ? : ");
		int nbr = sc.nextInt();
		
		
		for (int i = 0; i < nbr; i++) {
		
		System.out.println("Veuillez choisir le media a ajouter : ");
		System.out.println("Type du Media (1 = Movie, 2 = Book, 3 = CD) ? ");
		int choix = sc.nextInt();
		
		if (choix == 1)
		{
			movie movie = new movie();
		}
		
		if(choix == 2) {
			book book = new book();
		}
		
		if(choix == 3) {
			music music = new music();
		}
		

	}
		
		String tva = (String) (prix);
		String res = prix + tva;
		
		
		
		System.out.println("Voici le contenu de la bibliothèque : ");
		
		System.out.println("Le prix total pour les  est :" + prix +"€ HT, "+ tva + "€ TVA soit" + res);
		System.out.println("Le prix total pour les  est : " + prix +"€ HT," + tva +"€ TVA soit" + res );
		

		
}
	
}
