
public class DesarrolladorFrontend extends Empleado implements OperacionEmpleado {

	private int aniosExperienciaBoo;
	private boolean experienciaCloud;
	
	public DesarrolladorFrontend(int aniosExperienciaBoo, boolean experienciaCloud) {
		this.aniosExperienciaBoo = aniosExperienciaBoo;
		this.experienciaCloud = experienciaCloud;
	}

	public DesarrolladorFrontend() {
	}

	public int getAniosExperienciaBoo() {
		return aniosExperienciaBoo;
	}

	public void setAniosExperienciaBoo(int aniosExperienciaBoo) {
		this.aniosExperienciaBoo = aniosExperienciaBoo;
	}

	public boolean isExperienciaCloud() {
		return experienciaCloud;
	}

	public void setExperienciaCloud(boolean experienciaCloud) {
		this.experienciaCloud = experienciaCloud;
	}
	
	public   void Empleado() {
	}
	
private double Aumento=3;

public  void OperacionEmpleado() {

}

@Override
public void devolverSalario() {
	// TODO Auto-generated method stub
	
}
}