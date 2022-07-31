package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return quantity * price;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name + ", R$ " + String.format("%.2f",price) + ", " + quantity + " unit(s)" + ". Total: R$ " + String.format("%.2f",totalValueInStock()) + ".";
	}
}
