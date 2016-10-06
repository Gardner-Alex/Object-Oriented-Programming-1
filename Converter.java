import java.util.*;


public class Converter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Get user input
		System.out.print("Enter a degree in Celsius :");
		double cel = input.nextDouble();
		
		//convert
		double far= (9.0 / 5) * cel + 32;
		
		far = Math.round(far * 100) / 100.0;
		
		
		//Display results
		System.out.println(cel + " Celsius is " + far + " Fahrenheit");
		
	}
}