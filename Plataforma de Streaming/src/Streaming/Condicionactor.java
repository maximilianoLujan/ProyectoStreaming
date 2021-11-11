package Streaming;

import java.util.ArrayList;

public class Condicionactor extends Condicion {

	private String actor;
	
	public Condicionactor(String actor) {
		this.actor = actor;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		ArrayList<String> auxiliar;
		auxiliar = p.getActores();
		return(auxiliar.contains(actor));
		
	}

}
