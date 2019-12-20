/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chequespamacri;

import Biblioteca.Cheque;
import Mantenedores.MantenedorCheques;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class TEST {
    
    public static void main(String[] args) throws IOException, PrinterException, Exception {
        // TODO code application logic here
        
        // TEST 
        
        /*Cheque prueba = new Cheque();
        
        System.out.println("TEST " + prueba.getFechaEmision());
        
        System.out.println(prueba.getFechaEmision().getMonth());
        
        Login nuevo = new Login();
        nuevo.setVisible(true);
        
        /*
        ExcelDocument ed = new ExcelDocument("input.xlsx", new ExcelConvertOptions());

        // Print to the default printer
        ed.printToDefaultPrinter(null);

        // Print to a named printer
        ed.print("my printer", null);
        */
        
        
        Mantenedores.MantenedorCheques mant = new MantenedorCheques();
        
        try {
            
            ArrayList<Cheque> aux = mant.listarChequesSinCobrar();
            for (Cheque cheque : aux) {
                System.out.println(cheque.toString());
            }
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
    
    
}
