package it.shop;

import java.util.Random;

public class Prodotto {
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;

	public Prodotto(String nome, String descrizione) {
		this.codice = generaCodice();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = generaPrezzo();
		this.iva = (prezzo * 22) / 100;
	}

	public int getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public double getIva() {
		return iva;
	}

	private int generaCodice() {
		Random random = new Random();
		return random.nextInt(500);
	}

	private double generaPrezzo() {
		Random random = new Random();
		return random.nextInt(500);
	}

	public String nomeCodice() {
		return nome + codice;
	}

	double prezzoIvato() {
		return prezzo - iva;

	}

}
