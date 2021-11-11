package Streaming;

public class Condicionanio extends Condicion {
	private int anio;
		
	public Condicionanio(int anio) {
		super();
		this.anio = anio;
	}
	public boolean cumple(Pelicula p) {
		if (p.getAnioestreno() < this.anio) {
			return true;
		}
		return false;
	}

}
