
public class Serie {

	private final static int numTempsDef=3;
	private final static boolean entregadoDes= false;
	
 private String titulo;
 private int numerodetemporadas;
 private boolean entregado;
 private String genero;
 private String creador;

 
 

public Serie() {
	
}


public Serie(String titulo, String creador) {
	
	this.titulo = titulo;
	this.creador = creador;
}


public Serie(String titulo, int numerodetemporadas, String genero, String creador) {
	
	this.titulo = titulo;
	this.numerodetemporadas = numerodetemporadas;
	this.genero = genero;
	this.creador = creador;
}


public String getTitulo() {
	return titulo;
}


public void setTitulo(String titulo) {
	this.titulo = titulo;
}


public int getNumerodetemporadas() {
	return numerodetemporadas;
}


public void setNumerodetemporadas(int numerodetemporadas) {
	this.numerodetemporadas = numerodetemporadas;
}


public String getGenero() {
	return genero;
}


public void setGenero(String genero) {
	this.genero = genero;
}


public String getCreador() {
	return creador;
}


public void setCreador(String creador) {
	this.creador = creador;
}


@Override
public String toString() {
	return "Serie [titulo=" + titulo + ", numerodetemporadas=" + numerodetemporadas + ", entregado=" + entregado
			+ ", genero=" + genero + ", creador=" + creador + "]";
}


public void entregar() {
	this.entregado = true;
}

public void devolver() {
	this.entregado = false;
	
}
public boolean isEntregado() {
return false;
}
 
 public void compareTo(Object a) {
	 
 }
 
}

