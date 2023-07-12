/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2lombeidaanalab3;

import java.util.Scanner;

/**
 *
 * @author LOMBEIDA ANA
 */
public class U2LombeidaAnaLab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scanner = new Scanner(System.in);
        ///Se utiliza para crear una instancia de la clase Scanner en Java. La clase Scanner 
        //proporciona métodos para leer la entrada del usuario desde la consola u otras fuentes de entrada.
        System.out.println("==================================================================");
        System.out.println("                UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE           ");
        System.out.println("                               LABORATORIO 3                      ");
        System.out.println("==================================================================");
        System.out.println("                      JERARQUIA DE PRODUCTOS                      ");
        System.out.println("                 PROGRAMACION ORIENTADA A OBJETOS                 ");
        System.out.println("                         JAVIER CEVALLOS                          ");
        System.out.println("                  LOMBEIDA FAJARDO ANA ELIZABETH                  ");
        System.out.println("==================================================================");
        scanner.nextLine();//Se utiliza para leer una linea de texto
        // Crear productos estándar
        ProductoEstandar producto1 = new ProductoEstandar("Producto 1", 15.0, "Sección A");
        ProductoEstandar producto2 = new ProductoEstandar("Producto 2", 25.0, "Sección B");
      
    
        // Crear productos ofertados
        ProductoOfertado producto3 = new ProductoOfertado("Producto 3", 30.0, 2);
        ProductoOfertado producto4 = new ProductoOfertado("Producto 4", 35.0, 2);
        ProductoOfertado producto5 = new ProductoOfertado("Producto 5", 40.0, 2);

        
        // Calcular el precio total del pedido teniendo en cuenta 5 unidades de cada producto
        int unidadesPedidas = 5;
        double totalPedido = producto1.obtenerPrecioPedido(unidadesPedidas)
                + producto2.obtenerPrecioPedido(unidadesPedidas)
                + producto3.obtenerPrecioPedido(unidadesPedidas)
                + producto4.obtenerPrecioPedido(unidadesPedidas)
                + producto5.obtenerPrecioPedido(unidadesPedidas);

        System.out.println("Total del pedido: $" + totalPedido);
    }
           
    }
    

        
        
        
        
        
    
    

