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
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class MantenedorProveedores {
    /*
        public int ingresar(id)
        public void modificiar(id)
        public void eliminar(id)
        public ArrayList listarProveedores()
    */
    public MantenedorProveedores(){
        
    }
    
    
    public Proveedor obtenerDatosPorRut(String rut) throws Exception {
        
        ConexionBD conexion = new ConexionBD();

        try {
            
            Proveedor proveedorBuscado = new Proveedor();
            
            Connection conn = conexion.getConnection();
            String query = "select * from proveedor where rutProveedor = ?";
            PreparedStatement stmt=conn.prepareStatement(query);
            
            stmt.setString(1,rut);
            ResultSet rs=stmt.executeQuery();  
            
            if(rs.next()){
                
                proveedorBuscado.setId(rs.getInt(1)); // id
                proveedorBuscado.setRut(rs.getString(2));
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
    
    public Proveedor obtenerDatosPorNombre(String nombre) throws Exception {
        
        ConexionBD conexion = new ConexionBD();

        try {
            
            Proveedor proveedorBuscado = new Proveedor();
            
            Connection conn = conexion.getConnection();
            String query = "select * from proveedor where nombreProveedor = ?";
            PreparedStatement stmt=conn.prepareStatement(query);
            
            stmt.setString(1,nombre);
            ResultSet rs=stmt.executeQuery();  
            
            if(rs.next()){
                
                proveedorBuscado.setId(rs.getInt(1)); // id
                proveedorBuscado.setRut(rs.getString(2));
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
    
    public ArrayList listarProveedores() throws Exception{
        
        ConexionBD conexion = new ConexionBD();
        ArrayList<Proveedor> arrProveedores = new ArrayList<>();
        try {
            
            Connection conn = conexion.getConnection();
            String query = "select * from proveedores";
            PreparedStatement stmt=conn.prepareStatement(query);
            
            
            ResultSet rs=stmt.executeQuery();  
            
            
            Proveedor aux;
            while (rs.next()) {                
                aux = new Proveedor();
                aux.setId(rs.getInt(1));
                aux.setRut(query);
                
                arrCheques.add(aux);
            }
        
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
        return arrCheques;
        
    }
}
