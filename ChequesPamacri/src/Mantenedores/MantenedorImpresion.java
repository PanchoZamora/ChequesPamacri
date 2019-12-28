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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 *
 * @author Francisco
 */
public class MantenedorImpresion {
    
    public void generarCheque(Cheque ingresado, Proveedor proveedor) throws FileNotFoundException, IOException {
        
        Cheque datosCheque = ingresado;
        Proveedor provCheque = proveedor;
        
        
        
        InputStream inp = new FileInputStream("src/TmpCheque.xlsx");
        Workbook wb = WorkbookFactory.create(inp);
        Sheet sheet = wb.getSheetAt(0);
        Row row= sheet.getRow(7);
        Cell cell = row.getCell(1);
        String week = cell.getRichStringCellValue().getString();
        cell.setCellValue("18:00"); 
        FileOutputStream fileOut = new FileOutputStream("src/TmpCheque.xlsx");
        wb.write(fileOut);
        fileOut.close();

        
    }

    public void imprimir() throws Exception {
        try {
            File fileToPrint = new File("src/TmpCheque.xlsx");
            Desktop.getDesktop().print(fileToPrint);
        } catch (IOException ex) {
            throw new Exception("Ha ocurrido un error al imprimir : "+ ex.getMessage());
        }
    }
    
}
