package Streaming;

public class Condiciondirector extends Condicion {

	private String director;
	
	public Condiciondirector(String director) {
		this.director = director;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		return (p.getDirector() == this.director);
	}

}
