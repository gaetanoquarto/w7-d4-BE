package it.gaetano.esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Libro implements ElementoLibro{
	
	List<String> autori = new ArrayList<>();
	int prezzo;
	List<Sezione> sezioni = new ArrayList<>();
	
	public Libro(List<String> autori, int prezzo, List<Sezione> sezioni) {
		super();
		this.autori = autori;
		this.prezzo = prezzo;
		this.sezioni = sezioni;
	}

	@Override
	public void stampa() {
		System.out.println(Libro.class.getSimpleName() + " composto da: " + nPagine() + " con il costo di €" + prezzo);
	}
	
	public int nPagine() {
		int pagine = 0;
		for(Sezione s : sezioni) {
			 pagine += s.nPagine();
		}
		return pagine;
	}



}
