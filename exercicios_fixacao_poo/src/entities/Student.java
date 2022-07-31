package entities;

public class Student {
	
	public String name, result, message;
	public double points1;
	public double points2;
	public double points3;
	public double nota;

	
	
	public double notaFinal() {
		return nota = points1 + points2 + points3;
	}
	public String result() {
		if (nota >= 60) {
			return result = "PASSED!";
		} else {
			double missing = 60 - nota;
			return message = String.format("FAILED! %nMISSING: %.2f ", missing);
		}
		
	}
}
