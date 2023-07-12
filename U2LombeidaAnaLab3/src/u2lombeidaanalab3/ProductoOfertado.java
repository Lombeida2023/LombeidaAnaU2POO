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
public class ProductoOfertado extends Productos {
   private int dias;///Atributos

    public ProductoOfertado(String nombre, double par, int dias) {
        super(nombre, precio);
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    
      
   @Override
    public double obtenerPrecioPedido(int unidadesPedidas) {
        double precioTotal = getPrecio();

        if (dias == 1) {
            precioTotal *= 0.8; // Aplicar 20% de descuento
        } else if (dias == 2 || dias == 3) {
            precioTotal *= 0.85; // Aplicar 15% de descuento
        } else if (dias > 3) {
            precioTotal *= 0.9; // Aplicar 10% de descuento
        }
        return precioTotal * unidadesPedidas;
    }
} 
    
    


 

