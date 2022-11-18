
public class DesarrolladorBackend implements OperacionEmpleado {

	private String Skill;
	private String ListaLenguajes;
	
	public DesarrolladorBackend(String skill, String listaLenguajes) {
		Skill = skill;
		ListaLenguajes = listaLenguajes;
	}

	public DesarrolladorBackend() {	
	}

	public String getSkill() {
		return Skill;
	}

	public void setSkill(String skill) {
		Skill = skill;
	}

	public String getListaLenguajes() {
		return ListaLenguajes;
	}

	public void setListaLenguajes(String listaLenguajes) {
		ListaLenguajes = listaLenguajes;
	}
	
	private double Aumento=5;
	
	public void OperacionEmpleado() {

	}

	@Override
	public void devolverSalario() {
		// TODO Auto-generated method stub
		
	}
	


}
