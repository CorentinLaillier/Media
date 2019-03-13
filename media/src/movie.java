import java.util.Scanner;

public class movie extends media{
	
	private String name;
	private String real;
	private String date;
	private String time;
	
	
	
	public movie(){
		
		this.setmovie();
		this.getmovie();
	}

    public void getmovie() {
    	
    	
    	    	
    }

	public void setmovie() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nom : ");
		String nom = sc.nextLine();
		System.out.print("Realisateur : ");
		String real = sc.nextLine();
		System.out.print("Durée en minutes : ");
		String time = sc.nextLine();
		System.out.print("Date de parution : ");
		String date = sc.nextLine();
		System.out.print("Prix : ");
		String prix = sc.nextLine();
		
	}
   
	 
}
