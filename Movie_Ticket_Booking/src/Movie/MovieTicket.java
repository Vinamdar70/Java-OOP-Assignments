package Movie;
import java.util.*;
public class MovieTicket {

	private static String MovieName;
	private  static String theatreName;
	private static double pricePerTicket=100.0;
	private static int numberOfTickets;
	int Total;
	public void CalculateTotal() {
		Total=numberOfTickets*100;
		System.out.println("Total price is: "+Total);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=== Movie Ticket Booking ===");
		System.out.println("Enter Movie Name: ");
		MovieName=sc.next();
		System.out.println("Enter Theatre Name: ");
		theatreName=sc.next();
		System.out.println("How many Ticket you want? ");
		numberOfTickets=sc.nextInt();
		MovieTicket t1=new MovieTicket();
		t1.CalculateTotal();
		System.out.println();
		System.out.println("Thank You for Visiting...Visit Again");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		

	}

}
