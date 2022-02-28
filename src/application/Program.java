package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Product product = new Product();
		System.out.println("Entre com dados do Produto:  ");
		System.out.println("Nome :  ");
		product.name = sc.nextLine();
		
		System.out.println("Preço:  ");
		product.price = sc.nextDouble();
		
		System.out.println("Quantidade em stock:  ");
		product.quantity = sc.nextInt();
		
		//System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		System.out.println();
		System.out.println("Product data :  " + product);
		
		System.out.println();
		System.out.println("Entre com o numero de produto:  ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Product data :  " + product);
		
		System.out.println();
		System.out.println("Entre com o numero de produto para remover:  ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Product data :  " + product);
		
		
		sc.close();
	}

}
