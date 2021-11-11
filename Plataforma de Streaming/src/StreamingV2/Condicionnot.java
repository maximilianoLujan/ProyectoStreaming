package StreamingV2;

import Streaming.Condicion;
import Streaming.Pelicula;

public class Condicionnot extends Condicion {
	private Condicion c;
	
	public Condicionnot(Condicionnot c) {
		this.c = c;
	}
	@Override
	public boolean cumple(Pelicula p) {
		return (!c.cumple(p));
	}
}
