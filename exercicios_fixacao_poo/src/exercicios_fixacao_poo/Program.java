package exercicios_fixacao_poo;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Employee funcionario = new Employee();
		double percentage;
		
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.printf("Employee %s , $ %.2f", funcionario.name, funcionario.netSalary());
		System.out.println();
		System.out.print("Wich percentage to increase salary");
		percentage = sc.nextDouble();
		System.out.printf("Updated data: %s , $  %.2f", funcionario.name, funcionario.IncreaseSalary(percentage));
		
		sc.close();
		
		/*Rectangle retangulo = new Rectangle();
		
		double area, perimetro, diagonal;
		
		System.out.println("Enter rectangle width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		area = retangulo.calcularArea();
		perimetro = retangulo.calcularPerimetro();
		diagonal = retangulo.calcularDiagonal();
		
		System.out.printf("AREA = %.2f %n",area);
		System.out.printf("PERIMETER = %.2f %n",perimetro);
		System.out.printf("DIAGONAL = %.2f %n",diagonal);
		
		*/
		
	}

}
