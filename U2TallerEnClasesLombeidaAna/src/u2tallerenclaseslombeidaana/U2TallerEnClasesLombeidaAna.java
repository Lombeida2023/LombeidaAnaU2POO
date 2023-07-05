/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2tallerenclaseslombeidaana;

/**
 *
 * @author LOMBEIDA ANA
 */
public class U2TallerEnClasesLombeidaAna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====================================================");
        Auto auto = new Auto("Automático", false, 0, "JP124D", "FORD", 4, 0);
        auto.Mostrarauto();
        auto.onofparabtisas();
        auto.addmulta();
        System.out.println("Multa: " + auto.getMulta());
        
        System.out.println("============================");

        Camion camion = new Camion("KJ124P", "HIMNO", 8, 0);
        camion.MostrarCamion();
        camion.onofparabtisas();
        camion.setColor("NEGRO");
        camion.setCarga(600.0);
        System.out.println("COLOR: " + camion.getColor());
        System.out.println("CARGA: " + camion.getCarga());
    }
}
