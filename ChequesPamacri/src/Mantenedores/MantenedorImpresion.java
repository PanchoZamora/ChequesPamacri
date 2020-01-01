/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenedores;

import Biblioteca.Cheque;
import Biblioteca.Numero_a_Letra;
import Biblioteca.Proveedor;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author Francisco
 */
public class MantenedorImpresion {
    
   
    
    public void generarCheque(Cheque ingresado, Proveedor proveedor) throws FileNotFoundException, IOException {
        
        try {
            FileInputStream file = new FileInputStream(new File("src/TmpCheque.xlsx"));

            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Cell cell = null;

            
            // LLENADO DEL CHEQUE CON LOS DATOS CORRESPONDIENTES EN PLANTILLA 
           
                // NOMBRE DEL PROVEEDOR EN CELDA D6
                
                Row r = sheet.getRow(5); // FILA 6 
                if (r == null) {
                   r = sheet.createRow(5);
                }
                Cell c = r.getCell(3); // COLUMNA 4 ( D )
                if (c == null) {
                    c = r.createCell(3);
                }
                c.setCellValue(proveedor.getNombre().toUpperCase());

                // MONTO NUMERICO COSTADO SUPERIOR DERECHO F3
                r = sheet.getRow(2); // FILA 3
                if (r == null) {
                   r = sheet.createRow(2);
                }
                c = r.getCell(5);  // COLUMNA 6 ( F )
                if (c == null) {
                    c = r.createCell(5);
                }
                c.setCellValue(ingresado.getMonto());
                
                // MONTO NUMERICO EN TEXTO BAJO EL DESTINATARIO D7
                r = sheet.getRow(6); // FILA 7
                if (r == null) {
                   r = sheet.createRow(6);
                }
                c = r.getCell(3);  // COLUMNA 4 ( D )
                if (c == null) {
                    c = r.createCell(3);
                }
                Numero_a_Letra conversor = new Numero_a_Letra();
                c.setCellValue(conversor.Convertir(String.valueOf(ingresado.getMonto()), true));

                // DIA COSTADO DERECHO I5
                r = sheet.getRow(4); // FILA 5
                if (r == null) {
                   r = sheet.createRow(4);
                }
                c = r.getCell(8);  // COLUMNA 9 ( I )
                if (c == null) {
                    c = r.createCell(8);
                }
                c.setCellValue(ingresado.getFechaCobro().getDayOfMonth());
                
                // MES COSTADO DERECHO K5
                r = sheet.getRow(4); // FILA 5
                if (r == null) {
                   r = sheet.createRow(4);
                }
                c = r.getCell(10);  // COLUMNA 11 ( K )
                if (c == null) {
                    c = r.createCell(10);
                }
                c.setCellValue(ingresado.getFechaCobro().getMonthValue());
                
                // AÑO COSTADO DERECHO M5
                r = sheet.getRow(4); // FILA 5
                if (r == null) {
                   r = sheet.createRow(4);
                }
                c = r.getCell(12);  // COLUMNA 13 ( M )
                if (c == null) {
                    c = r.createCell(12);
                }
                c.setCellValue(ingresado.getFechaCobro().getYear());
                
                // MONTO NUMERICO INFERIOR DERECHO I 12
                r = sheet.getRow(11); // FILA 12
                if (r == null) {
                   r = sheet.createRow(11);
                }
                c = r.getCell(8);  // COLUMNA 6 ( I )
                if (c == null) {
                    c = r.createCell(8);
                }
                c.setCellValue(ingresado.getMonto());
            
            
            file.close();

            FileOutputStream outFile =new FileOutputStream(new File("src/TmpCheque.xlsx"));
            workbook.write(outFile);
            outFile.close();

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Error : La plantilla esta siendo usada o no se encuentra");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void imprimir() throws Exception {
        /*try {
            File fileToPrint = new File("src/TmpCheque.xlsx");
            Desktop.getDesktop().print(fileToPrint);
        } catch (IOException ex) {
            throw new Exception("Ha ocurrido un error al imprimir : "+ ex.getMessage());
        }*/
    }
    
}
