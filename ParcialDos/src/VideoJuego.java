
public class VideoJuego {
	
	private final static int HorasEstimadasDef=10;
	private final static boolean entregadoDes= false;
	
	private String titulo;
	private int horasestimadas;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	public VideoJuego() {
	}

	public VideoJuego(String titulo, int horasestimadas) {
		super();
		this.titulo = titulo;
		this.horasestimadas = horasestimadas;
	}

	public VideoJuego(String titulo, int horasestimadas, String genero, String compañia) {
		super();
		this.titulo = titulo;
		this.horasestimadas = horasestimadas;
		this.genero = genero;
		this.compañia = compañia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasestimadas() {
		return horasestimadas;
	}

	public void setHorasestimadas(int horasestimadas) {
		this.horasestimadas = horasestimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	
	

}
