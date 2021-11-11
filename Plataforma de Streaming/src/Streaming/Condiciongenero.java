package Streaming;

public class Condiciongenero extends Condicion {
	private String genero;
	
	public Condiciongenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		return (p.getGenero().contains(genero));
	}

}
