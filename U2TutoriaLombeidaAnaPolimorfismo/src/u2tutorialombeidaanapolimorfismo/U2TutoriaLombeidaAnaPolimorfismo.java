/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2tutorialombeidaanapolimorfismo;

import java.util.Scanner;

/**
 *
 * @author LOMBEIDA ANA
 */
public class U2TutoriaLombeidaAnaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
      String nombre,disciplina,sexo;
      int edad;
      int MenuOp;
      System.out.println("=======================");
      System.out.println("MENU DE OPCIONES");
      System.out.println("ESCOJA UNA OPCION");
      System.out.println("=======================");
      System.out.println("1.ATLETISMO");
      System.out.println("2.NATACION");
      System.out.println("3.SALIR");
      System.out.println("=======================");
        MenuOp = entrada.nextInt();
       
         switch( MenuOp){
           case 1:
               System.out.println("Ingrese los datos");
               System.out.println("Nombre : ");
               entrada.nextLine(); // Consumir carácter de nueva línea pendiente
               nombre=entrada.nextLine();
               System.out.println("Edad : ");
               edad=entrada.nextInt();
               System.out.println("Disciplina : ");
               entrada.nextLine(); // Consumir carácter de nueva línea pendiente
               disciplina=entrada.nextLine();
               System.out.println("Sexo : ");
               sexo=entrada.nextLine();
               System.out.println("Prueba : ");
               String prueba=entrada.nextLine();
               
               Atletismo atle= new Atletismo(nombre,edad,disciplina,sexo,prueba);
               atle.entrenamiento();
               atle.mostrardatos();
               break;
           case 2:
               System.out.println("Ingrese los datos");
               System.out.println("Nombre : ");
               nombre=entrada.nextLine();
               System.out.println("Edad : ");
               edad=entrada.nextInt();
               System.out.println("Disciplina : ");
               disciplina=entrada.nextLine();
               System.out.println("Sexo : ");
               sexo=entrada.nextLine();
               System.out.println("Prueba : ");
               String estilo=entrada.nextLine();
               
               Natacion nata= new Natacion(nombre,edad,disciplina,sexo,estilo);
               nata.entrenamiento();
               nata.mostrardatos();
               break;
               
           case 3:
              System.out.println("MUCHAS GRACIAS POR INGRESAR AL PROGRAMA"); 
              break;
              default:
                System.out.println("OPCION INCORRECTA VUELVA A INGRESAR UNA OPCION DENTRO DEL RANGO");
                break;
       }
       
      
    }
    
    }
    

