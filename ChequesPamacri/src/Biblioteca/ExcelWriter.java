package Biblioteca;

import Mantenedores.MantenedorProveedores;
import java.io.FileNotFoundException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ExcelWriter {

    private static String[] columns = {"Fecha", "N°Cheque", "Monto", "Nombre Proveedor","Rut Proveedor","Factura","Fecha Cobro","Estado"};
    
    public void generarExcelCheques(ArrayList<Cheque> listaCheques, String nombreArchivo ) throws FileNotFoundException, IOException, Exception{
        // Create a Workbook
        Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

        /* CreationHelper helps us create instances of various things like DataFormat, 
           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
        CreationHelper createHelper = workbook.getCreationHelper();

        // Create a Sheet
        Sheet sheet = workbook.createSheet("Cheques");

        // Create a Font for styling header cells
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Create a Row
        Row headerRow = sheet.createRow(0);

        // Create cells
        for(int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }

        // Create Cell Style for formatting Date
        CellStyle dateCellStyle = workbook.createCellStyle();
        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        // Create Other rows and cells with employees data
        int rowNum = 1;
        Mantenedores.MantenedorProveedores mp = new MantenedorProveedores();
        for(Cheque cheque: listaCheques) {
            
            Proveedor proveedor = mp.obtenerDatosPorId(cheque.getIdProveedor());
            
            Row row = sheet.createRow(rowNum++);

            Cell fechaCell = row.createCell(0);
            fechaCell.setCellValue(cheque.getFechaEmision());
            fechaCell.setCellStyle(dateCellStyle);

            row.createCell(1).setCellValue(cheque.getNroCheque());
            
            row.createCell(2).setCellValue(cheque.getMonto());
            
            row.createCell(3).setCellValue(proveedor.getNombre());
            
            row.createCell(4).setCellValue(proveedor.getRut());
            
            row.createCell(5).setCellValue(cheque.getNroFactura());
            
            Cell fechaCell2 = row.createCell(6);
            fechaCell2.setCellValue(cheque.getFechaCobro());
            fechaCell2.setCellStyle(dateCellStyle);
            
            row.createCell(7).setCellValue(cheque.getEstado());
        }

		// Resize all columns to fit the content size
        for(int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Guardar");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(chooser, "El archivo fue guardado en " + chooser.getSelectedFile());
        } else {
          System.out.println("No Selection ");
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream(chooser.getSelectedFile() + "/"+nombreArchivo+".xlsx");
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();
    };

}