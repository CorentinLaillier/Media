import java.util.Scanner;

public class music extends media{
	
	private String name;
	private String art;
	private String date;
	private String min;
	
	
public music(){
		
		this.setmusic();
		this.getmusic();
	}

    public void getmusic() {
    	
    	    	
    }

	public void setmusic() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom : ");
		String nom = sc.nextLine();
		System.out.println("Chanteur / compositeur : ");
		String real = sc.nextLine();
		System.out.println("Durée de l'album : ");
		String time = sc.nextLine();
		System.out.println("Date de parution : ");
		String date = sc.nextLine();
		System.out.println("Prix : ");
		String prix = sc.nextLine();
	}

}




