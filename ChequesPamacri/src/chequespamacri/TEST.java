/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chequespamacri;

import chequespamacri.Biblioteca.*;

/**
 *
 * @author franc
 */
public class TEST {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TEST 
        
        Cheque prueba = new Cheque();
        
        System.out.println("TEST " + prueba.getFechaEmision());
        
        System.out.println(prueba.getFechaEmision().getMonth());
        
   
        
    }
    
    
    
}
