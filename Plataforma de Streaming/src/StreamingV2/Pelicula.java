package StreamingV2;

import java.util.HashMap;
import java.util.Map;

public class Pelicula {
	
	private Map<String,Comparable> pelicula;
	
	public Pelicula() {
		pelicula = new HashMap<String, Comparable>();
	}
	public void setValor(String c,Comparable valor) {
		pelicula.put(c,valor);
	}
	public Comparable getValor(String valor) {
		return pelicula.get(valor);
	}
	public boolean contieneAtributo(String nombre) {
		return pelicula.containsKey(nombre);
	}
	@Override
	public String toString() {
		return "Pelicula [pelicula=" + pelicula + "]";
	}
	
}
