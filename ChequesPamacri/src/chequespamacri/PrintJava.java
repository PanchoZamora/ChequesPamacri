package chequespamacri;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
 
public class PrintJava {
	public static void main(String[] args) throws IOException {
		File fileToPrint = new File("C:\\Users\\Francisco\\Desktop\\TmpCheque.xlsx");
		Desktop.getDesktop().print(fileToPrint);
	}
}