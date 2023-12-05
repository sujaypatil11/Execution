package Basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadExcelDataTest {
@Test
public void Vtiger() throws EncryptedDocumentException, IOException
{
	FileInputStream fist=new FileInputStream("src\\test\\resources\\orgframe1.xlsx");
    Workbook wb=WorkbookFactory.create(fist);
    Sheet sh = wb.getSheet("Sheet1");
    Row rw = sh.getRow(0);
    Cell cl = rw.getCell(5);
    
 String data = cl.getStringCellValue();	
	
	System.out.println(data);
	 
}
}
