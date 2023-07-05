/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2tallerenclaseslombeidaana;

/**
 *
 * @author LOMBEIDA ANA
 */
public class Vehiculo {
    String numPlaca;
    public String marca;
    public int numRuedas;
    private int estado;

    public Vehiculo(String numPlaca, String marca, int numRuedas, int estado) {///Contructores
        this.numPlaca = numPlaca;
        this.marca = marca;
        this.numRuedas = numRuedas;
        this.estado = estado;
    }

    
    ///Metodos Get y Set
    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}

    

