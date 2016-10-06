import java.util.*;


public class GardnerAlexProg2_5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Get user input
		System.out.print("Enter the subtotal and the gratuity rate: ");
		double sub = input.nextDouble();
		double gra = input.nextDouble();
		
		//convert
		gra = gra * 0.01;
		gra = gra * sub;
		double total = gra + sub;
		
		//Display results
		System.out.println("The gratuity is $" + gra + " and the total is $" + total);
		
		
	}
}