package Streaming;

import java.util.ArrayList;

public class Streaming {
	private ArrayList<Pelicula> peliculas;
	private Condicion rentable;
	
	public Streaming(Condicion rentabilidad) {
		peliculas = new ArrayList<Pelicula>();
		this.rentable = rentabilidad;
	}
	public boolean esRentable(Pelicula p) {
		return (this.rentable.cumple(p));
	}
	public ArrayList<Pelicula> getCatalogo(){
		ArrayList<Pelicula> auxiliar = new ArrayList<Pelicula>();
		auxiliar = peliculas;
		return auxiliar;
		}
	public void addPelicula(Pelicula p) {
		if (!peliculas.contains(p)) {
			peliculas.add(p);
		}
	}
	public ArrayList<Pelicula> buscarPeliculas(Condicion c){
		ArrayList<Pelicula> auxiliar = new ArrayList<Pelicula>();
		for (int i = 0;i < peliculas.size();i++ ) {
			Pelicula p = peliculas.get(i);
			if (c.cumple(p)) {
				auxiliar.add(p);
			}
		}
		return auxiliar;
	}

	@Override
	public String toString() {
		return "Streaming [peliculas=" + peliculas + "]";
	}

	
	
}
