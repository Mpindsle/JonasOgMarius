import java.util.Scanner;
public class Bro {
	public static void main(String[] args){
			
		Scanner sc1 = new Scanner(System.in);
			
		System.out.println("Hei! Hva heter du?");
			
		String svar = sc1.nextLine();
			
		if(svar = "Marius") {
       			System.out.println("Marius is in. We're locked and loaded.");
		}else{
       			System.out.println("Hmm ok.. Kanskje du kan finne en som heter Marius?");
      		}
	}
}
