	package entities;
	
	public class Triangle {
		
		public double a;
		public double b;
		public double c;
		public double p;
	
	public double calcularArea (/* Por eu n�o precisar de nenhum atributo que n�o esteja na pr�pria classe, eu deixo o par�ntese em branco */) {
		double p = (a+ b+ c)/2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	}