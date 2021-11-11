package Streaming;
import java.util.*;

public class Pelicula {
	private String titulo;
	private String sinopsis;
	private ArrayList<String> generos;
	private String director;
	private ArrayList<String> actores;
	private int anioestreno;
	private double duracion;
	private int edadminima;
	
	public Pelicula(){
		actores = new ArrayList<String>();
		generos = new ArrayList<String>();
	}

	public Pelicula(String titulo, String sinopsis, String genero, String director,
			int anioestreno, double duracion, int edadminima) {
		super();
		actores = new ArrayList<String>();
		generos = new ArrayList<String>();
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.director = director;
		this.anioestreno = anioestreno;
		this.duracion = duracion;
		this.edadminima = edadminima;
	}
	
	public ArrayList<String> getGenero() {
		ArrayList<String> auxiliar = new ArrayList<String>();
		auxiliar = generos;
		return auxiliar;
	}
	public void addGenero(String genero) {
		if (!generos.contains(genero)) {
			generos.add(genero);
		}
	}
	public ArrayList<String> getActores() {
		ArrayList<String> auxiliar = new ArrayList<String>();
		auxiliar = actores;
		return auxiliar;
	}
	public void addActor(String actor) {
		if (!actores.contains(actor)) {
			actores.add(actor);
		}
	}
	
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnioestreno() {
		return anioestreno;
	}

	public void setAnioestreno(int anioestreno) {
		this.anioestreno = anioestreno;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getEdadminima() {
		return edadminima;
	}

	public void setEdadminima(int edadminima) {
		this.edadminima = edadminima;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", sinopsis=" + sinopsis + ", genero=" + generos + ", director=" + director
				+ ", actores=" + actores + ", aÃ±oestreno=" + anioestreno + ", duracion=" + duracion + ", edadminima="
				+ edadminima + "]";
	}
}
