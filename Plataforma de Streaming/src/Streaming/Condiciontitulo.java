package Streaming;

public class Condiciontitulo extends Condicion {
	private String palabra;
	
	public Condiciontitulo(String pa) {
		super();
		this.palabra = pa;
	}
	@Override
	public boolean cumple(Pelicula p) {
		return (p.getTitulo() == palabra );
	}

}
