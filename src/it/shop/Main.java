package it.shop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserire nome prodotto: ");
		String nome = scanner.nextLine();
		System.out.println("Inserire descrizione prodotto: ");
		String descrizione = scanner.next();

		Prodotto prodotto1 = new Prodotto(nome, descrizione);

		System.out.println("Nome prodotto: " + prodotto1.getNome());
		System.out.println("Descrizione prodotto: " + prodotto1.getDescrizione());
		System.out.println("Codice prodotto: " + prodotto1.getCodice());
		System.out.println("Prezzo: " + prodotto1.getPrezzo());
		System.out.println("Iva: " + prodotto1.getIva());
		System.out.println("Nome+Codice: " + prodotto1.nomeCodice());
		System.out.println("Prezzo senza Iva:" + prodotto1.prezzoIvato());
		// System.out.println("Descrizione prodotto: " + prodotto1.getDescrizione());

		scanner.close();
	}
}
