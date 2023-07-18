/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;
import java.awt.ActiveEvent;
import java.awt.event.ActionListener;
import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;

public class Control implements ActionListener{
    private Vista vista;
    private Modelo modelo;
    
    public Control (Vista vista , Modelo modelo){
        this.vista=vista;
        this.modelo=modelo;
        this.vista.btnresta.addActionListener(this);
        this.vista.btnsumar.addActionListener(this);
        this.vista.btnmulti.addActionListener(this);
        this.vista.btndivi.addActionListener(this);
        
    }

    public void iniciar_vista(){
        vista.setTitle("Usted va a sumar por medio de imagen");
        vista.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setValor1(Integer.parseInt(vista.txtN1.getText()));
        modelo.setValor2(Integer.parseInt(vista.txtN2.getText()));
        modelo.sumar();
        vista.txtresult.setText(String.valueOf(modelo.getTotal()));  
        
        modelo.setValor3(Integer.parseInt(vista.txtN4.getText()));
        modelo.setValor4(Integer.parseInt(vista.txtN5.getText()));
        modelo.resta();
        vista.txtresultresta.setText(String.valueOf(modelo.getTotal2()));
        
        modelo.setValor5(Integer.parseInt(vista.txtN6.getText()));
        modelo.setValor6(Integer.parseInt(vista.txtN7.getText()));
        modelo.multi();
        vista.txtresultmulti.setText(String.valueOf(modelo.getTotal3()));
        
        modelo.setValor7(Integer.parseInt(vista.txtN7.getText()));
        modelo.setValor8(Integer.parseInt(vista.txtN8.getText()));
        modelo.divi();
        vista.txtresultdivi.setText(String.valueOf(modelo.getTotal4())); 
    }
    
    
}
