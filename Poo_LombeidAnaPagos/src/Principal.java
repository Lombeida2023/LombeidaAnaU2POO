
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Scanner scanner = new Scanner("System.out.println.in");
	
	
	

	public void Datos() {///Datos del personal ingresados por consola
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("==============================");
		System.out.println("Ingresa los datos del personal");
		System.out.println("==============================");
		System.out.println("Ingresa el nombre :");
		String nombre= scanner.nextLine();
		System.out.println("Ingresa la Edad :");
		int Edad=scanner.nextInt();
		System.out.println("Ingresa la cedula :");
		double Cedula=scanner.nextDouble();
		System.out.println("Ingresa el celular");
		int Celular=scanner.nextInt();
		System.out.println("Ingresa el sueldo");
		double sueldo=scanner.nextDouble();
		System.out.println("Ingresa la Direccion");
		String Direccion=scanner.nextLine();
		
	
		
	}
	
	
	
	public void menu() {
	      int opcionM;
	        Scanner scanner = new Scanner(System.in);
			System.out.println("==============================");
			System.out.println("MENU");
			System.out.println("==============================");
			System.out.println("1.Ingresa los datos del personal");
			System.out.println("==============================");
			System.out.println("2. Mostrar los datos ");
			System.out.println("3. Salir del programa ");
			System.out.println("Ingresa una opcion");
			System.out.println("==============================");
			opcionM=scanner.nextInt();
	do {
		
		 switch(opcionM){
			

			case 1:
				System.out.println("==============================");
			    System.out.println("1.Ingresa los datos del personal");
			    System.out.println("==============================");
				break;
			case 2:
				
				System.out.println("==============================");
		        System.out.println("1.Mostrar datos del personal");
		        System.out.println("==============================");
		        Datos();
				break;
			case 3:
				System.out.println("=========================================");
		        System.out.println("1.Muchas gracias por ingresar al programa");
		        System.out.println("=========================================");
				break;
			default:
				
				System.out.println("============================================");
				System.out.println("Opcion ingresada por el usuario es incorrecta");
				System.out.println("============================================");
			
		 }}while(opcionM>3);
	
	}
	
}
