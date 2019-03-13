import java.util.Scanner;

public class book extends media{
	
	private String name;
	private String aut;
	private String date;
	private String page;
	
	
public book(){
		
		this.setbook();
		this.getbook();
	}

    public void getbook() {
    	
    	    	
    }

	public void setbook() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom : ");
		String nom = sc.nextLine();
		System.out.println("Auteur : ");
		String aut = sc.nextLine();
		System.out.println("Date de parution : ");
		String date = sc.nextLine();
		System.out.println("Nombre de page : ");
		String page = sc.nextLine();
		System.out.println("Prix : ");
		String prix = sc.nextLine();
	}

}



