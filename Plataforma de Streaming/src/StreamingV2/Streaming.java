package StreamingV2;
import java.util.*;

import Streaming.Condicion;
import Streaming.Pelicula;
public class Streaming {
	private ArrayList<Pelicula> peliculas;
	Condicion rentable;
	public Streaming(Condicion ren) {
		this.rentable = ren;
		peliculas = new ArrayList<Pelicula>(); 
	}
	public void addPelicula(Pelicula p) {
		if (!peliculas.contains(p)) {
			peliculas.add(p);
		}
	}
	public ArrayList<Pelicula> getPeliculas(){
		ArrayList<Pelicula> auxiliar = peliculas;
		return auxiliar;
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
		return "Streaming [peliculas=" + peliculas + ", rentable=" + rentable + "]";
	}
	
}
