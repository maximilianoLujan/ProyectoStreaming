package StreamingV2;

public class Condicionvalor extends Condicion {

	private Comparable valor;
	private String nombre;
	
	public Condicionvalor(String nombre,Comparable valor) {
		this.valor = valor;
		this.nombre = nombre;
	}

	@Override
	public boolean cumple(Pelicula p) {
		Comparable valor = p.getValor(nombre);
		return valor.compareTo(this.valor)==0;
	}
	
	

}
