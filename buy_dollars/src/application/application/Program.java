package application;

import java.util.Locale;
import java.util.Scanner;

import util.Exchange;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("What is the dollar price?");
		double priceDollar = sc.nextDouble();
		System.out.print("How many dollars will be bought?");
		double dollarsBought = sc.nextDouble();
		double amount;
		amount = Exchange.converter(priceDollar, dollarsBought);
		System.out.printf("Amount to be paid in reais = %.2f", amount);
		
		
		
	}

}
