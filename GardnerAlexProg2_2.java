import java.util.*;


public class GardnerAlexProg2_2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Get user input
		System.out.print("Enter the radius and lenght of a cylinder: ");
		double rad = input.nextDouble();
		double len = input.nextDouble();
		
		//convert
		double area = rad * rad * Math.PI;
		double area2 = Math.round(area * 100) / 100.0;
		double vol = area * len;
		vol = Math.round(vol * 100) / 100.0;
		
		
		//Display results
		System.out.println("The area is " + area2);
		System.out.println("The volume is " + vol);
		
	}
}