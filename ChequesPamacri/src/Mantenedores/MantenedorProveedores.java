/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenedores;

import Conexion.ConexionBD;
import Biblioteca.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class MantenedorProveedores {

    public MantenedorProveedores(){
        
    }
    
    public void ingresar(Proveedor ingreso) throws Exception{
        
        ConexionBD conexion = new ConexionBD();
        
        Connection conn = conexion.getConnection();
        String query = "INSERT INTO proveedor (`rutProveedor`, `nombreProveedor`, `plazo`, `tipo`) "
                     + "VALUES (?,?,?,?)";
        
        PreparedStatement stmt=conn.prepareStatement(query);

        stmt.setString(1,ingreso.getRut());
        stmt.setString(2,ingreso.getNombre());
        stmt.setInt(3,ingreso.getPlazo());
        stmt.setString(4,ingreso.getTipo());
        
        ResultSet rs=stmt.executeQuery();  
            
    }
    
    public void modificar(Proveedor modificado) throws Exception{
        
        ConexionBD conexion = new ConexionBD();
        Connection conn = conexion.getConnection();
        String query = "UPDATE proveedor SET "
                + " rutProveedor = ? ,"
                + " nombreProveedor = ? ,"
                + " plazo = ? ,"
                + " tipo = ? "
                + " WHERE idProveedor = ? ";
        
        PreparedStatement stmt=conn.prepareStatement(query);

        stmt.setString(1,modificado.getRut());
        stmt.setString(2,modificado.getNombre());
        stmt.setInt(3,modificado.getPlazo());
        stmt.setString(4,modificado.getTipo());
        stmt.setInt(5,modificado.getId());
        
        
        ResultSet rs=stmt.executeQuery();  
        
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
    
    public Proveedor obtenerDatosPorId(int id) throws Exception {
        
        ConexionBD conexion = new ConexionBD();

        try {
            
            Proveedor proveedorBuscado = new Proveedor();
            
            Connection conn = conexion.getConnection();
            String query = "select * from proveedor where idProveedor = ?";
            PreparedStatement stmt=conn.prepareStatement(query);
            
            stmt.setInt(1,id);
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
                aux.setId(rs.getInt(1)); // id
                aux.setRut(rs.getString(2));
                aux.setNombre(rs.getString(3));
                aux.setPlazo(rs.getInt(4));
                aux.setTipo(rs.getString(5));
                
                arrProveedores.add(aux);
            }
        
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
        return arrProveedores;
        
    }
    
    public void eliminar(int idProveedor) throws Exception{
        
        ConexionBD conexion = new ConexionBD();
        
        Connection conn = conexion.getConnection();
        String query = "Delete from proveedor where idProveedor = ?";
        PreparedStatement stmt=conn.prepareStatement(query);
        stmt.setInt(1,idProveedor);
        
        ResultSet rs=stmt.executeQuery();  
        
    }
    
}
