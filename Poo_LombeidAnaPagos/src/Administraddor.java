
public  class Administraddor extends Personal {
	
	String AdministrarHorarios;
	double SalarioPersonal;
	public Administraddor(String nombre, int edad, double cedula, int celular, double sueldo, String direccion) {
		super(nombre, edad, cedula, celular, sueldo, direccion);
		// TODO Auto-generated constructor stub
	}
	public String getAdministrarHorarios() {
		return AdministrarHorarios;
	}
	public void setAdministrarHorarios(String administrarHorarios) {
		AdministrarHorarios = administrarHorarios;
	}
	public double getSalarioPersonal() {
		return SalarioPersonal;
	}
	public void setSalarioPersonal(double salarioPersonal) {
		SalarioPersonal = salarioPersonal;
	}
	@Override
	public void Pago() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
