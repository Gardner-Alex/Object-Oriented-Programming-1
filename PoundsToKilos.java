import java.util.*;

public class PoundsToKilos{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Get user input
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		
		//conver pounds to kilograms
		double kilos = pounds * 0.454;
		kilos = Math.round(kilos * 100) / 100.0;
		
		/*NumberFormat formatter = NumberFormat.getInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);*/
		
		//Display results
		System.out.println(pounds + " pounds is " + formatter.format(kilos) + " kilograms");
		
	}
}