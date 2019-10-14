/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chequespamacri;

import Conexion.ConexionBD;
import java.sql.SQLException;



/**
 *
 * @author franc
 */
public class ChequesPamacri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Login nuevaInstancia = new Login();
        
        nuevaInstancia.setLocationRelativeTo(null);
        nuevaInstancia.setVisible(true);
        

        ConexionBD conn = new ConexionBD();
        try {
            conn.getConnection();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        
        
    }
    
}
