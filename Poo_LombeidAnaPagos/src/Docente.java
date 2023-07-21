import java.util.Scanner;

public  class Docente  extends Personal {
	
	public Docente(String nombre, int edad, double cedula, int celular, double sueldo, String direccion) {
		super(nombre, edad, cedula, celular, sueldo, direccion);
		// TODO Auto-generated constructor stub
	}
	String Sexo;
	String Departamento;
	
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	
	
public void datosDocente(){
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Ingresa el sexo del docente");
	String Sexo=scanner.nextLine();
	System.out.println("Ingresa el depatamento que pertenece el docente");
	String  Departamento =scanner.nextLine();
	
	
}

@Override
public void Pago() {
	// TODO Auto-generated method stub
	
}



	
	
}
