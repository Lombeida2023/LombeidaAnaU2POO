/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2tallerenclaseslombeidaana;

/**
 *
 * @author LOMBEIDA ANA
 */
public class Camion extends Vehiculo {
   private boolean Parabrisas;
   public String Color;
   private double Carga;

    public Camion(String numPlaca, String marca, int numRuedas, int estado) {
        super(numPlaca, marca, numRuedas, estado);
        this.numPlaca=numPlaca;
        this.marca=marca;
        this.numRuedas=numRuedas;
        this.Color=Color;
        this.Carga=Carga;
        
    }
    
    public void MostrarCamion() {
        
        System.out.println("TIPO DE VEHICULO: CAMION");
        System.out.println("PLACA : " + numPlaca);
        System.out.println("MARCA : " + marca);
        System.out.println("NUMERO DE RUEDAS: " + numRuedas);
    }
        
        public void onofparabtisas(){
        if(this.Parabrisas){
            this.Parabrisas=false;
            System.out.println("LAS PARABRISAS ESTAN EN ESTADO APAGADO");
        }else{
            this.Parabrisas=true;
            System.out.println("LAS PARABRISAS ESTAN EN ESTADO ENCENDIDO");
        }
    }
        
    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getCarga() {
        return Carga;
    }

    public void setCarga(double Carga) {
        this.Carga = Carga;
    }
}


