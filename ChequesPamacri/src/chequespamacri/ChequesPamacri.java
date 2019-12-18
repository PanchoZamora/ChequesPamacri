/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chequespamacri;

import Conexion.ConexionBD;
import Mantenedores.MantenedorProveedores;
import Mantenedores.MantenedorUsuario;
import chequespamacri.Biblioteca.Proveedor;
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
        
        /*Login nuevaInstancia = new Login();
        
        nuevaInstancia.setLocationRelativeTo(null);
        nuevaInstancia.setVisible(true);
        

        ConexionBD conn = new ConexionBD();
        try {
            conn.getConnection();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }*/

        try {
                    MantenedorProveedores nuevoMantenedor = new MantenedorProveedores();
        
        Proveedor aux = new Proveedor();
        
        aux.setRut("99.586.280-8 ");
        
        aux = nuevoMantenedor.obtenerDatosPorRut(aux);
        
        System.out.println("ID : " + aux.getId());
        System.out.println("Proveedor : " + aux.getNombre());
        System.out.println("Rut : " + aux.getRut());
        System.out.println("Tipo : " + aux.getTipo());
        System.out.println("Plazo : " + aux.getPlazo());
        
        } catch (Exception e) {
            System.out.println("FALLO POR " + e.getMessage());
        }
        
        
        
        
    }
    
}
