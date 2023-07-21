

import java.util.*;
public abstract class Personal {

	
	///Atributos
	String nombre;
	int Edad;
	double Cedula;
	int Celular;
	double Sueldo;
	String Direccion;
	
	
	
///Constructor
	public Personal(String nombre, int edad, double cedula, int celular, double sueldo, String direccion) {
		super();
		this.nombre = nombre;
		this.Edad = edad;
		this.Cedula = cedula;
		this.Celular = celular;
		this.Sueldo = sueldo;
		this.Direccion = direccion;
	}


///Metodos get y sett
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return Edad;
	}



	public void setEdad(int edad) {
		Edad = edad;
	}



	public double getCedula() {
		return Cedula;
	}



	public void setCedula(double cedula) {
		Cedula = cedula;
	}



	public int getCelular() {
		return Celular;
	}



	public void setCelular(int celular) {
		Celular = celular;
	}



	public double getSueldo() {
		return Sueldo;
	}



	public void setSueldo(double sueldo) {
		Sueldo = sueldo;
	}



	public String getDireccion() {
		return Direccion;
	}



	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
	
	public  abstract void  Pago();///metodo abstracto
	
	
	
}	

	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

