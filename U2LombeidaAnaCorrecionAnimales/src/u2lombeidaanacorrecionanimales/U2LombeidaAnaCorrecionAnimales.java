/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2lombeidaanacorrecionanimales;

/**
 *
 * @author LOMBEIDA ANA
 */
public class U2LombeidaAnaCorrecionAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         System.out.println("======================================");
         System.out.println("DATOS DE LOS ANIMALES INGRESADOS");
         Perro perro =new Perro("Labrador",3,"Fido");
         Gato gato =new Gato ("Naranja",5,"Garfield");
         Pajaro pajaro=new Pajaro("Piolin" ,1 ,true);
        System.out.println("======================================");
         
        perro.ladrar();
        System.out.println(" Raza del perro es: "+perro.getRaza());
         gato.maullar();
        System.out.println(" Color del gato es: "+gato.getColor());
        pajaro.cantar();
        System.out.println(" ¿Vuela el pajaro? "+pajaro.isVuela());
        System.out.println("======================================");
    }
   
}
