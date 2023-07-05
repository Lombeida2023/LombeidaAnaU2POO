/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2lombeidaanacorrecionanimales;

/**
 *
 * @author LOMBEIDA ANA
 */
public class Perro extends Animal {
    private String raza;

    public Perro(String raza, int edad, String nombre) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void ladrar(){
    System.out.println(" El perro "+this.nombre+" Esta ladrandro :");
    }
}
