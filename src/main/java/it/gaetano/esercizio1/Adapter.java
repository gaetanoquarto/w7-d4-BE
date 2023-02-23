package it.gaetano.esercizio1;

import java.time.LocalDate;

public class Adapter implements DataSource{

	
	private Info i;
	
	public Adapter(Info i) {
		this.i = i;
	}
 	
	
	@Override
	public String getNomeCompleto() {
		return i.getNome() + " " + i.getCognome();
	}

	@Override
	public int getEta() {
		LocalDate currentDate = LocalDate.now();
		int eta = currentDate.getYear() - i.getDataDiNascita().getYear();
		
		return eta;
	}

}
