/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenedores;

import Conexion.ConexionBD;
import Biblioteca.Cheque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Types;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author sebai
 */
public class MantenedorCheques {
    /*
        public void eliminar(id)
    */
    
    public void ingresar(Cheque cheque) throws Exception{
        
        ConexionBD conexion = new ConexionBD();
        
        Connection conn = conexion.getConnection();
        String query = "INSERT INTO cheque (`fecha`, `nroCheque`, `monto`, `cobro`, `estado`, `nroFactura`, `Proveedor_idProveedor`) "
                     + "VALUES (?,?,?,?,?,?,?)";
        PreparedStatement stmt=conn.prepareStatement(query);

        stmt.setDate(1,java.sql.Date.valueOf(cheque.getFechaEmision()));
        stmt.setString(2,cheque.getNroCheque());
        stmt.setDouble(3,cheque.getMonto());
        if (cheque.getFechaCobro()==null) {
            stmt.setNull(4,Types.NULL);
        }
        else{
            stmt.setDate(4,java.sql.Date.valueOf(cheque.getFechaCobro()));
        }
        stmt.setString(5,cheque.getEstado());
        stmt.setString(6,cheque.getNroFactura());
        stmt.setInt(7,cheque.getIdProveedor());
        
        int i = stmt.executeUpdate();
        if (i > 0) {
            System.out.println("Ingreso Exitoso");
        } else {
            throw new Exception("No se pudo ingresar");
        }
    }
    
    public void modificar(Cheque modificado) throws Exception{
        
        ConexionBD conexion = new ConexionBD();
        
        Connection conn = conexion.getConnection();
        String query = "UPDATE cheque SET "
                + " fecha = ? ,"
                + " nroCheque = ? ,"
                + " monto = ? ,"
                + " cobro = ? ,"
                + " estado = ? ,"
                + " nroFactura = ? ,"
                + " Proveedor_idProveedor = ? "
                + " WHERE idCheque = ? ";
        
        PreparedStatement stmt=conn.prepareStatement(query);

        stmt.setDate(1,java.sql.Date.valueOf(modificado.getFechaEmision()));
        stmt.setString(2,modificado.getNroCheque());
        stmt.setDouble(3,modificado.getMonto());
        stmt.setDate(4,java.sql.Date.valueOf(modificado.getFechaCobro()));
        stmt.setString(5,modificado.getEstado());
        stmt.setString(6,modificado.getNroFactura());
        stmt.setInt(7,modificado.getIdProveedor());
        stmt.setInt(8, modificado.getId());
        ResultSet rs=stmt.executeQuery();  
        
    }
    
    public Cheque obtenerChequePorId(int idCheque) throws Exception{
        
        ConexionBD conexion = new ConexionBD();
        
        try {
            
            Connection conn = conexion.getConnection();
            String query = "select * from cheque where idCheque = ? ORDER BY idCheque ASC";
            PreparedStatement stmt=conn.prepareStatement(query);
            
            stmt.setInt(1,idCheque);
            ResultSet rs=stmt.executeQuery();  
            Cheque obtenido = new Cheque();
            if (rs.next()) {
                obtenido.setId(rs.getInt(1));
                obtenido.setFechaEmision(rs.getDate(2).toLocalDate());
                obtenido.setNroCheque(rs.getString(3));
                obtenido.setMonto(rs.getInt(4));
                obtenido.setFechaCobro(rs.getDate(5).toLocalDate());
                obtenido.setEstado(rs.getString(6));
                obtenido.setNroFactura(rs.getString(7));
                obtenido.setIdProveedor(rs.getInt(8));
            }
            else{
                throw new Exception("No se ha encontrado nada");
            }
                
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
        return null;
    }
    
    public Cheque obtenerChequePorNroCheque(int nroCheque) throws Exception{
        
        ConexionBD conexion = new ConexionBD();
        
        try {
            
            Connection conn = conexion.getConnection();
            String query = "select * from cheque where nroCheque = ?";
            PreparedStatement stmt=conn.prepareStatement(query);
            
            stmt.setInt(1,nroCheque);
            ResultSet rs=stmt.executeQuery();  
            Cheque obtenido = new Cheque();
            if (rs.next()) {
                obtenido.setId(rs.getInt(1));
                obtenido.setFechaEmision(rs.getDate(2).toLocalDate());
                obtenido.setNroCheque(rs.getString(3));
                obtenido.setMonto(rs.getInt(4));
                obtenido.setFechaCobro(rs.getDate(5).toLocalDate());
                obtenido.setEstado(rs.getString(6));
                obtenido.setNroFactura(rs.getString(7));
                obtenido.setIdProveedor(rs.getInt(8));
            }
            else{
                throw new Exception("No se ha encontrado nada");
            }
            return obtenido;
                
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }
    
    public ArrayList listarChequesSinCobrar() throws Exception{
        
        ConexionBD conexion = new ConexionBD();
        ArrayList<Cheque> arrCheques = new ArrayList<>();
        try {
            
            Connection conn = conexion.getConnection();
            String query = "select * from cheque where estado = 'Sin Cobrar' ORDER BY idCheque ASC";
            PreparedStatement stmt=conn.prepareStatement(query);
            
            ResultSet rs=stmt.executeQuery();  
            
            
            Cheque aux;
            while (rs.next()) {                
                aux = new Cheque();
                aux.setId(rs.getInt(1));
                aux.setFechaEmision(rs.getDate(2).toLocalDate());
                aux.setNroCheque(rs.getString(3));
                aux.setMonto(rs.getDouble(4));
                aux.setFechaCobro(rs.getDate(5).toLocalDate());
                aux.setEstado(rs.getString(6));
                aux.setNroFactura(rs.getString(7));
                aux.setIdProveedor(rs.getInt(8));
                
                arrCheques.add(aux);
            }
        
        } catch (Exception e) {
            //exception throw porque fecha cobro es igual a nula. Corregir en la clase.
            throw new Exception(e.getMessage());
        }
        
        return arrCheques;
        
    }
    
    public ArrayList listarChequesIncompletos() throws Exception{
        
        ConexionBD conexion = new ConexionBD();
        ArrayList<Cheque> arrCheques = new ArrayList<>();
        try {
            
            Connection conn = conexion.getConnection();
            String query = "SELECT * FROM `cheque` WHERE nroFactura is null OR cobro is null";
            PreparedStatement stmt=conn.prepareStatement(query);
            
            ResultSet rs=stmt.executeQuery();  
            
            
            Cheque aux;
            while (rs.next()) {                
                aux = new Cheque();
                aux.setId(rs.getInt(1));
                aux.setFechaEmision(rs.getDate(2).toLocalDate());
                aux.setNroCheque(rs.getString(3));
                aux.setMonto(rs.getDouble(4));
                aux.setFechaCobro(rs.getDate(5).toLocalDate());
                aux.setEstado(rs.getString(6));
                aux.setNroFactura(rs.getString(7));
                aux.setIdProveedor(rs.getInt(8));
                
                arrCheques.add(aux);
            }
        
        } catch (Exception e) {
            //exception throw porque fecha cobro es igual a nula. Corregir en la clase.
            throw new Exception(e.getMessage());
        }
        
        return arrCheques;
        
    }
    
    public ArrayList listarCheques() throws Exception{
        
        ConexionBD conexion = new ConexionBD();
        ArrayList<Cheque> arrCheques = new ArrayList<>();
        try {
            
            Connection conn = conexion.getConnection();
            String query = "select * from cheque ORDER BY idCheque ASC";
            PreparedStatement stmt=conn.prepareStatement(query);
            
            
            ResultSet rs=stmt.executeQuery();  
            
            
            Cheque aux;
            while (rs.next()) {                
                aux = new Cheque();
                aux.setId(rs.getInt(1));
                aux.setFechaEmision(rs.getDate(2).toLocalDate());
                aux.setNroCheque(rs.getString(3));
                aux.setMonto(rs.getDouble(4));
                aux.setFechaCobro(rs.getDate(5).toLocalDate());
                aux.setEstado(rs.getString(6));
                aux.setNroFactura(rs.getString(7));
                aux.setIdProveedor(rs.getInt(8));
                
                arrCheques.add(aux);
            }
        
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
        return arrCheques;
        
    }
    
    public void eliminar(int idCheque) throws Exception{
        
        ConexionBD conexion = new ConexionBD();
        
        Connection conn = conexion.getConnection();
        String query = "Delete from cheque where idCheque = ?";
        PreparedStatement stmt=conn.prepareStatement(query);
        stmt.setInt(1,idCheque);
        
        ResultSet rs=stmt.executeQuery();  
        
    }
    
    // Busquedas dinamicas
    
    
    public ArrayList listarChequesPorFecha(LocalDate fecha) throws Exception{
        
        ConexionBD conexion = new ConexionBD();
        ArrayList<Cheque> arrCheques = new ArrayList<>();
        try {
            
            Connection conn = conexion.getConnection();
            String query = "select * from cheque where fecha = ? ORDER BY idCheque ASC";
            PreparedStatement stmt=conn.prepareStatement(query);
            
            stmt.setDate(1,java.sql.Date.valueOf(fecha));
            ResultSet rs=stmt.executeQuery();  
            
            
            Cheque aux;
            while (rs.next()) {                
                aux = new Cheque();
                aux.setId(rs.getInt(1));
                aux.setFechaEmision(rs.getDate(2).toLocalDate());
                aux.setNroCheque(rs.getString(3));
                aux.setMonto(rs.getDouble(4));
                aux.setFechaCobro(rs.getDate(5).toLocalDate());
                aux.setEstado(rs.getString(6));
                aux.setNroFactura(rs.getString(7));
                aux.setIdProveedor(rs.getInt(8));
                
                arrCheques.add(aux);
            }
        
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
        return arrCheques;
        
    }
    
    public int cantidadChequesSinCobrar() throws SQLException, Exception{
        
        ConexionBD conexion = new ConexionBD();
        
        Connection conn = conexion.getConnection();
        String query = "Select count(*) from cheque where estado = 'Sin Cobrar';";
        PreparedStatement stmt=conn.prepareStatement(query);
        
        ResultSet rs=stmt.executeQuery();  
        rs.next();
        int cantidad = rs.getInt(1);
        
        return cantidad;
        
    }
    
    public int cantidadChequesIncompletos() throws SQLException, Exception{
        
        ConexionBD conexion = new ConexionBD();
        
        Connection conn = conexion.getConnection();
        String query = "SELECT count(*) FROM `cheque` WHERE nroFactura is null OR cobro is null";
        PreparedStatement stmt=conn.prepareStatement(query);
        
        ResultSet rs=stmt.executeQuery();  
        rs.next();
        int cantidad = rs.getInt(1);
        
        return cantidad;
        
    }
    
}
