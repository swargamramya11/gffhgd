package excelutilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public String[][] testdata= new String[7][2];
	int row,column,i,j;
//method to read data from excel
public void read()
{
	File f=new File("src/test/resources/TEST_DATA/LoginDataaa.xlsx");
	try 
	{
	FileInputStream fis = new FileInputStream(f);
	@SuppressWarnings("resource")
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sh=wb.getSheet("Sheet1");
	for(row=1,i=0;row<7;row++,i++)
	{
	XSSFRow Row = sh.getRow(row);
	
	for(column=0,j=0;column<2;column++,j++)
	{
	XSSFCell cell=Row.getCell(column);
	testdata[i][j]=cell.getStringCellValue();
	}
	}
	}
	catch (FileNotFoundException e) 
	{
	e.printStackTrace();
	}
	catch (IOException e1) 
	{
	e1.printStackTrace();
	}
	catch(IncompatibleClassChangeError e)
	{
		e.printStackTrace();
		//log.update("Exception in incompatile class change error method");
	}
}
}
