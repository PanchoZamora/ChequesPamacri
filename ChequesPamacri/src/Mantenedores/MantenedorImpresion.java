/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenedores;

import Biblioteca.Cheque;
import Biblioteca.Proveedor;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francisco
 */
public class MantenedorImpresion {
    
    public void generarCheque(Cheque ingresado, Proveedor proveedor) {
        
        
        
        
        
        
    }

    public void imprimir() throws Exception {
        try {
            File fileToPrint = new File("C:\\Users\\Francisco\\Desktop\\TmpCheque.xlsx");
            Desktop.getDesktop().print(fileToPrint);
        } catch (IOException ex) {
            throw new Exception("Ha ocurrido un error al imprimir : "+ ex.getMessage());
        }
    }
    
}
