/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chequespamacri;

import chequespamacri.Biblioteca.*;
import com.qoppa.office.ExcelConvertOptions;
import com.qoppa.office.ExcelDocument;
import com.qoppa.office.OfficeException;
import java.awt.print.PrinterException;
import java.io.IOException;

/**
 *
 * @author franc
 */
public class TEST {
    
    public static void main(String[] args) throws IOException, OfficeException, PrinterException {
        // TODO code application logic here
        
        // TEST 
        
        Cheque prueba = new Cheque();
        
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
        
        
    }
    
    
    
}
