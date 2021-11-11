package StreamingV2;

import Streaming.Condicion;
import Streaming.Pelicula;

public class Condicionand extends Condicionbinaria {

	public Condicionand(Condicion c1, Condicion c2) {
	super(c1, c2);
}
	@Override
	public boolean cumple(Pelicula p) {
		return(super.getC1().cumple(p) && super.getC2().cumple(p));
	}


}
