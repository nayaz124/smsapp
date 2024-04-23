package exceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	DataFormatter formatter = new DataFormatter();

	@Test(dataProvider = "Testdata")
	public void testcase(String label, String weight) {
		System.out.println(label + weight);

	}

	@DataProvider(name = "Testdata")
	public Object[][] get_data() throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Ayaz Ahmad\\OneDrive - 83Incs.com\\Documents\\Demodata.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowscount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colcount = row.getLastCellNum();
		Object data[][] = new Object[rowscount - 1][colcount];

		for (int i = 0; i < rowscount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colcount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formatter.formatCellValue(cell);
			}
		}

		return data;

	}

}
