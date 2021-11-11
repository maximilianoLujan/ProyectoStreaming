package Streaming;

public class Condicionduracion extends Condicion {
	private double duracion;
	
	public Condicionduracion(double duracion) {
		this.duracion = duracion;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		if (p.getDuracion() < this.duracion) {
			return true;
		}
		return false;
	}

}
