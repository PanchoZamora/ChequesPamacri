package chequespamacri;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
 
public class PrintJava {
	public static void main(String[] args) throws IOException {
            
            File fileToPrint = new File("src/TmpCheque.xlsx");
		Desktop.getDesktop().print(fileToPrint);
	}
}