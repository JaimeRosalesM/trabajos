
public class Empleado {

	private String Nombre;
	private String Apellidos;
	private String Direccion;
	private int DNI;
	private double Salario;
	private long Sexo;
	
	public Empleado(String nombre, String apellidos, String direccion, int dNI, double salario, long sexo) {
		
		Nombre = nombre;
		Apellidos = apellidos;
		Direccion = direccion;
		DNI = dNI;
		Salario = salario;
		Sexo = sexo;
	}

	public Empleado(String nombre, String apellidos, String direccion, int dNI, double salario) {
		
		Nombre = nombre;
		Apellidos = apellidos;
		Direccion = direccion;
		DNI = dNI;
		Salario = salario;
	}

	public Empleado(String direccion, int dNI, long sexo) {
		
		Direccion = direccion;
		DNI = dNI;
		Sexo = sexo;
	}

	public Empleado(String nombre, String apellidos, int dNI, double salario, long sexo) {
		Nombre = nombre;
		Apellidos = apellidos;
		DNI = dNI;
		Salario = salario;
		Sexo = sexo;
	}

	public Empleado() {
		
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public long getSexo() {
		return Sexo;
	}

	public void setSexo(long sexo) {
		Sexo = sexo;
	}
	
	double SalarioMinimo=980000;
	double DescuentoEPS=4;
	double DescuentoFP=4;
	
	
	
	
}
