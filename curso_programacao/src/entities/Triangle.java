	package entities;
	
	public class Triangle {
		
		public double a;
		public double b;
		public double c;
		public double p;
	
	public double calcularArea (/* Por eu não precisar de nenhum atributo que não esteja na própria classe, eu deixo o parêntese em branco */) {
		double p = (a+ b+ c)/2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	}