/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2lombeidaanacorrecionanimales;

/**
 *
 * @author LOMBEIDA ANA
 */
public class Pajaro extends Animal{
    
    private boolean vuela;

    public Pajaro(String nombre, int edad, boolean vuela) {
        super(nombre, edad);
        this.vuela = vuela;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;  
        
    }
    
     public void cantar(){
    System.out.println(" El pajaro "+this.nombre+" Esta cantando :");
    }
    
}
   

