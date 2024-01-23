package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Sexo: ");
		char gender = sc.next().charAt(0);

		while (gender != 'M' && gender != 'F') {
			System.out.println("'M' para Masculino ou 'F' para Feminino ");
			gender = sc.next().charAt(0);

		}
		if (gender == 'M') {

		} else if (gender == 'F') {
		} else {
			System.out.println("'M' para Masculino ou 'F' para Feminino");
		}

		Bill bill = new Bill(gender, 0, 0, 0);

		System.out.println("Sexo: " + bill.gender);
		

		System.out.println("Digite a quantidade de cerveja");
		bill.beer = sc.nextInt();
		System.out.println("Quantidade de cervejas: " + bill.beer);
		

		System.out.println("Digite a quantidade de refrigerantes");
		bill.softDrink = sc.nextInt();
		System.out.println("Quantidade de refrigerantes: " + bill.softDrink);
		

		System.out.println("Digite a quantidade de espetinhos");
		bill.barbecue = sc.nextInt();
		System.out.println("Quantidade de espetinhos: " + bill.barbecue);
		

		System.out.println("");
		System.out.println("RELATÓRIO: ");
		System.out.printf("Consumo = R$ %.2f%n", bill.feeding());
		System.out.printf("Valor a pagar = R$ %.2f%n ", bill.total());
		
		
		
		sc.close();
	}

}
