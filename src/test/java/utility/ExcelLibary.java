package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibary implements Autoconstant
{
	public static  String getStringCellData(String sheet,int row,int cell) throws IOException
	{
		FileInputStream fio=new FileInputStream(excelpath);
		Workbook w=new XSSFWorkbook(fio);
		String cellvalue=w.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
	}
	public double getSNumericCellData(String sheet,int row,int cell) throws IOException
	{
		FileInputStream fio=new FileInputStream(excelpath);
		Workbook w=new XSSFWorkbook(fio);
		double cellvalue=w.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		return cellvalue;
	}
	public Boolean getBoolenCellData(String sheet,int row,int cell) throws IOException
	{
		FileInputStream fio=new FileInputStream(excelpath);
		Workbook w=new XSSFWorkbook(fio);
		 boolean cellvalue = w.getSheet(sheet).getRow(row).getCell(cell).getBooleanCellValue();
		return cellvalue;
	}
	public Date getDateCellData(String sheet,int row,int cell) throws IOException
	{
		FileInputStream fio=new FileInputStream(excelpath);
		Workbook w=new XSSFWorkbook(fio);
		Date cellvalue=w.getSheet(sheet).getRow(row).getCell(cell).getDateCellValue();
		return cellvalue;
	}
	public CellAddress getcellAdress(String sheet,int row,int cell) throws IOException
	{
		FileInputStream fio=new FileInputStream(excelpath);
		Workbook w=new XSSFWorkbook(fio);
		CellAddress cellvalue=w.getSheet(sheet).getRow(row).getCell(cell).getAddress();
		return cellvalue;
	}
	public int rowCount(String sheet) throws IOException
	{
		FileInputStream fio=new FileInputStream(excelpath);
		Workbook w=new XSSFWorkbook(fio);
			Sheet sheet1 = w.getSheet(sheet);
		int rownum = sheet1.getLastRowNum();
		return rownum;
	}
	public int cellCount(String sheet) throws IOException
	{
		FileInputStream fio=new FileInputStream(excelpath);
		Workbook w=new XSSFWorkbook(fio);
			Sheet sheet1 = w.getSheet(sheet);
		int rownum = sheet1.getLastRowNum();
		int cellcount=0;
		for(int i=0;i<=rownum;i++)
		{
		cellcount=	sheet1.getRow(i).getLastCellNum();
		}
		return cellcount;
	}
	
	
}
