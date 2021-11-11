package Streaming;

public class Condicionor extends Condicionbinaria {

	public Condicionor(Condicion c,Condicion c2) {
		super(c,c2);
	}
	@Override
	public boolean cumple(Pelicula p) {
		return (super.getC1().cumple(p)||super.getC2().cumple(p));
	}



}
