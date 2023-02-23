package it.gaetano.esercizio2;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		

		ElementoLibro s1 = new Sottosezione(12);
		ElementoLibro s2 = new Sottosezione(15);
		ElementoLibro s3 = new Sottosezione(10);
		ElementoLibro s4 = new Sottosezione(5);
	
		Sezione sezione1 = new Sezione(new ArrayList<>() {{
			add(s1);
			add(s2);
			add(s3);
			add(s4);
		}});
		
		ElementoLibro s5 = new Sottosezione(10);
		ElementoLibro s6 = new Sottosezione(30);
		ElementoLibro s7 = new Sottosezione(5);
		ElementoLibro s8 = new Sottosezione(15);
		
		Sezione sezione2 = new Sezione(new ArrayList<>() {{
			add(s5);
			add(s6);
			add(s7);
			add(s8);
		}});
		
		ElementoLibro libro = new Libro(new ArrayList<>() {{
			add("J.K. Rowling");
			add("Dan Brown");
		}}, 30, new ArrayList<>() {{ 
			add(sezione1);
			add(sezione2);
			
		}});
		
		
		
		sezione1.stampa();
		sezione2.stampa();
		libro.stampa();
		

	}

}
