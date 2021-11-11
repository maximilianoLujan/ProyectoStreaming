package Streaming;

public class Main {

	public static void main(String[] args) {
		Pelicula p = new Pelicula("hola","hola", "hola","hola",2015, 95.2, 15);
		Pelicula p2 = new Pelicula("otro","hola", "hola","hola",2000, 100, 15);
		p.addActor("maxi");
		p.addActor("nacho");
		p2.addActor("nacho");
		Condicion c = new Condicionactor("nacho");
		Streaming s = new Streaming(c);
		s.addPelicula(p2);
		s.addPelicula(p);
		
		Condicion c4 = new Condicionactor("nacho");
		Condicion c1 = new Condicionduracion(102);
		
		Condicionbinaria c3 = new Condicionand(c4,c1);
		
		
		System.out.println(s.buscarPeliculas(c3));
		

	}

}
