/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenedores;

import Conexion.ConexionBD;
import Biblioteca.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franc
 */
public class MantenedorUsuario {

    public boolean validarUsuario(Usuario usrConectado) throws Exception {
        
        ConexionBD conexion = new ConexionBD();

        try {
            Connection conn = conexion.getConnection();
            String query = "select * from usuario where nomUsuario = ? AND contrasena = ?";
            PreparedStatement stmt=conn.prepareStatement(query);
            
            stmt.setString(1,usrConectado.getNomUsuario());
            stmt.setString(2,usrConectado.getContrasena());
            ResultSet rs=stmt.executeQuery();  
            
            if(rs.next()){
                conn.close(); 
                return true;
                
            }
            else{
                conn.close(); 
                return false;
            }
            
        } catch (Exception ex) {
            throw new Exception("ERROR: " + ex.getMessage());
        }
    }

    public Usuario obtenerDatos(Usuario usrConectado) throws Exception {
        
        ConexionBD conexion = new ConexionBD();

        try {
            Connection conn = conexion.getConnection();
            String query = "select * from usuario where nomUsuario = ? AND contrasena = ?";
            PreparedStatement stmt=conn.prepareStatement(query);
            
            stmt.setString(1,usrConectado.getNomUsuario());
            stmt.setString(2,usrConectado.getContrasena());
            ResultSet rs=stmt.executeQuery();  
            
            if(rs.next()){
                
                usrConectado.setId(rs.getInt(1)); // id
                usrConectado.setNombre(rs.getString(2)); // NOMBRE
                usrConectado.setCorreo(rs.getString(3)); // CORREO
                usrConectado.setRol(rs.getString(4)); // ROL
                usrConectado.setNomUsuario(rs.getString(5)); //NOMBRE USUARIO
                conn.close(); 
                
                return usrConectado;

                
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
