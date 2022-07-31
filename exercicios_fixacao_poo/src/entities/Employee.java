package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	public double newSalary;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	public double IncreaseSalary(double percentage) {
		 this.grossSalary = grossSalary + ((grossSalary * percentage) / 100);
		 return grossSalary - tax;
	}
}
