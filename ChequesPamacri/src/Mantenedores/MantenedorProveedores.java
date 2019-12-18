/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenedores;

import Conexion.ConexionBD;
import chequespamacri.Biblioteca.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author franc
 */
public class MantenedorProveedores {
    
    public MantenedorProveedores(){
        
    }
    
    
    public Proveedor obtenerDatos(Proveedor proveedorBuscado) throws Exception {
        
        ConexionBD conexion = new ConexionBD();

        try {
            Connection conn = conexion.getConnection();
            String query = "select * from proveedor where rutProveedor = ?";
            PreparedStatement stmt=conn.prepareStatement(query);
            
            stmt.setString(1,proveedorBuscado.getRut());
            ResultSet rs=stmt.executeQuery();  
            
            if(rs.next()){
                
                proveedorBuscado.setId(rs.getInt(1)); // id
                proveedorBuscado.setNombre(rs.getString(3));
                proveedorBuscado.setPlazo(rs.getInt(4));
                proveedorBuscado.setTipo(rs.getString(5));
                conn.close(); 
                
                return proveedorBuscado;

                
            }
            else{
                conn.close(); 
                return null;
            }
            
        } catch (Exception ex) {
            throw new Exception("ERROR: " + ex.getMessage());
        }
    }
    
    
    
    
    
    
    
    
}
