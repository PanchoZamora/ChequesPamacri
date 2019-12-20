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
import java.sql.Types;
import java.util.ArrayList;

/**
 *
 * @author sebai
 */
public class MantenedorCheques {
    /*
    
        public int ingresar(id)
        public void modificiar(id)
        public void eliminar(id)
        public ArrayList listarCheques()
        public ArrayList listarChequesSinCobrar(estado)
    */
    
    public ArrayList listarChequesSinCobrar() throws Exception{
        
        ConexionBD conexion = new ConexionBD();
        ArrayList<Cheque> arrCheques = new ArrayList<>();
        try {
            
            Connection conn = conexion.getConnection();
            String query = "select * from cheque where estado = ?";
            PreparedStatement stmt=conn.prepareStatement(query);
            
            stmt.setString(1,"Cobrado");
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
    
    
}
