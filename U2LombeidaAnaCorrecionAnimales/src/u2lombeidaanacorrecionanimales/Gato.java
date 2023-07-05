/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2lombeidaanacorrecionanimales;

/**
 *
 * @author LOMBEIDA ANA
 */
public class Gato extends Animal {
    private String color;

    public Gato(String color, int edad, String nombre) {
        super(nombre, edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    public void maullar(){
        
     System.out.println("El gato " + this.nombre + " Esta maullando.");
    }
}
