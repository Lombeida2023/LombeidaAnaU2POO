
public class Tecnico  extends Personal{
	
	String DedicacionAreaTrabajo;

	public Tecnico(String nombre, int edad, double cedula, int celular, double sueldo, String direccion) {
		super(nombre, edad, cedula, celular, sueldo, direccion);
		// TODO Auto-generated constructor stub
	}

	public String getDedicacionAreaTrabajo() {
		return DedicacionAreaTrabajo;
	}

	public void setDedicacionAreaTrabajo(String dedicacionAreaTrabajo) {
		DedicacionAreaTrabajo = dedicacionAreaTrabajo;
	}

	@Override
	public void Pago() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

	
}
