/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2tallerenclaseslombeidaana;

/**
 *
 * @author LOMBEIDA ANA
 */
public class Auto extends Vehiculo {
    private String Transmision;
    private boolean Parabrisas;
    private int Multa;

    public Auto(String Transmision, boolean Parabrisas, int Multa, String numPlaca, String marca, int numRuedas, int estado) {
        super(numPlaca, marca, numRuedas, estado);
        this.Transmision = Transmision;
        this.Parabrisas = Parabrisas;
        this.Multa = Multa;
        this.numPlaca=numPlaca;
        this.numRuedas=numRuedas;
    }
    public void Mostrarauto() {
  
        System.out.println("CLASE DE VEHICULO: AUTO");
        System.out.println("PLACA: " + numPlaca);
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

     public void setMulta(int multa) {
        this.Multa = Multa;
    }
    
    public void addmulta(){
        this.Multa ++;
    }
    
         public int getMulta() {
        return Multa;
    }

    
    
}
