package lca;
import org.apache.poi.openxml4j.opc.Package;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import java.util.Iterator;
import java.io.*;
 
public class xlsx {
 
     
    public static void main(String[] args) {
     xlsx rid=new  xlsx();
        try{
           // rid.ReadSheet();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
         
         
 
    }
   /*  public void ReadSheet() throws Exception
        {
            String filename = "C:\\Save\\Excel\\Product_2015.12.21_14.58.32.xlsx";
           // FileInputStream fis = null;
            try {
               // fis = new FileInputStream(filename);
                 
                XSSFWorkbook workbook;
                workbook= new XSSFWorkbook(filename);
                XSSFSheet sheet = workbook.getSheetAt(0);
                Iterator rows = sheet.rowIterator();
                int number=sheet.getLastRowNum();
                System.out.println(" number of rows"+ number);
                while (rows.hasNext())
                {
      
                    XSSFRow row = ((XSSFRow) rows.next());
                    Iterator cells = row.cellIterator();
                    while(cells.hasNext())
                    {
                        XSSFCell cell = (XSSFCell) cells.next();
                        String Value=cell.getStringCellValue();
                        System.out.println(Value);
                    }
                 }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                
            }*/
        
}
