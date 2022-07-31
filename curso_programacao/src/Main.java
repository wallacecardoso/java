import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Main {
	
	public static void main (String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	Triangle x,y;
	x = new Triangle();
	y = new Triangle();
	
		System.out.println("Enter the measures of triangle X");
		 x.a = sc.nextDouble();
		 x.b = sc.nextDouble();
		 x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.calcularArea();
		double areaY = y.calcularArea();
	
	sc.close();
	
	 System.out.printf("A �rea do tri�ngulo X �: %.4f%n", areaX);
	 System.out.printf("A �rea do tri�ngulo Y �: %.4f%n", areaY);

	 if (areaX > areaY) {
		 System.out.println("maior �rea �: do tri�ngulo X");
	 } else {
			 System.out.println("maior �rea �: do tri�ngulo Y");
		 }
	 }
	
}