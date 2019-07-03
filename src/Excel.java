import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("C://Users//welcome//Desktop//Maven9.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheetAt(0);
		int rowcount = ws.getLastRowNum();
		System.out.println(rowcount);
		int colcount = ws.getRow(0).getLastCellNum();
		System.out.println(colcount);
		for(int i=0;i<=rowcount;i++) {
			XSSFRow rows = ws.getRow(i);
			for(int j=0;j<colcount;j++) {
				String celldata = rows.getCell(j).toString();
				System.out.print("  " + celldata);
			}
			System.out.println();
			}
		}
		
		

	}


