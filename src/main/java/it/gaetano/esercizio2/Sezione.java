package it.gaetano.esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements ElementoLibro{
	
	private List<Sottosezione> sottosezioni = new ArrayList<>();
	
	public Sezione(ArrayList arrayList) {
		this.sottosezioni = arrayList;

	}

	public List<Sottosezione> getSottosezioni() {
		return sottosezioni;
	}

	public void setSottosezioni(List<Sottosezione> sottosezioni) {
		this.sottosezioni = sottosezioni;
	}

	@Override
	public void stampa() {
		System.out.println(Sezione.class.getSimpleName() + " composta da: " + sottosezioni.size() + " sottosezioni con " + nPagine() + " pagine totali.");
	}


	public int nPagine() {
		int pagine = 0;
		for(Sottosezione s : sottosezioni) {
			 pagine += s.nPagine;
		}
		return pagine;
	}



}
