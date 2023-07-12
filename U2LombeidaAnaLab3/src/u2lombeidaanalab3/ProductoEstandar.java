/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2lombeidaanalab3;

/**
 *
 * @author LOMBEIDA ANA
 */

//Clase hija que hedera de la clase padre productos
public class ProductoEstandar extends Productos {
    private String selecion; //Atibuto

    public ProductoEstandar(String selecion, double par, String nombre) {
        super(nombre, precio);
        this.selecion = selecion;
    }
///Metoodos
    public String getSelecion() {
        return selecion;
    }

    public void setSelecion(String selecion) {
        this.selecion = selecion;
    }  
    
    @Override
    public double obtenerPrecioPedido(int unidadesPedidas) {
        double precioTotal = unidadesPedidas * getPrecio();
        if (unidadesPedidas >= 5) {
            precioTotal *= 0.9; // Aplicar 10% de descuento
        }
        return precioTotal;
    }
}






    
