/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3lombeidaanap1.Controlador;

import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author LOMBEIDA ANA
 */
public class Conexion {
    
    private static final String drive=" com.mysql.Drive";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbcmysql://localhost:3306/estudiante";
    
    Connection conectar=null;
 public Connection conexion(){
        try{
            Class.forName(drive);
            conectar=(Connection) DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error de conexion"+e.getMessage());
                }
        return conectar;
    }
}
