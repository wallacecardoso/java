package exercicios_fixacao_poo;
import java.util.Locale;
import java.util.Scanner;

import entities.Student;


public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student estudante = new Student();
		Locale.setDefault(Locale.US);
		
		String resultado;
		
			System.out.print("Enter the student name: ");
			estudante.name = sc.nextLine();
			
			System.out.print("Enter 1º trim. points: ");
			estudante.points1 = sc.nextDouble();
			System.out.print("Enter 2º trim. points: ");
			estudante.points2 = sc.nextDouble();
			System.out.print("Enter 3º trim. points: ");
			estudante.points3 = sc.nextDouble();
			
			System.out.println();
			System.out.printf("FINAL GRADE = %.2f %n", estudante.notaFinal());
			resultado = estudante.result();
			System.out.println(resultado);
		
		
		sc.close();
		
		
		/*  Employee funcionario = new Employee();
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
		
		*/
		
		
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
