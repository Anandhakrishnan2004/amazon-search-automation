package com.amazon.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dataprovider {

	@DataProvider(name = "search")
	public String[][] getexceldata() throws IOException {
	String [][] data = new String[1][1];
 String excelpath= "C:\\Users\\hridya.susil\\OneDrive - HCL Technologies Ltd\\Documents\\Amazon data.xlsx";
	 FileInputStream input1=new FileInputStream(excelpath);
	 XSSFWorkbook workbook=new XSSFWorkbook(input1);
	 XSSFSheet sheet=workbook.getSheet("Sheet1");
	 int rowcount=sheet.getPhysicalNumberOfRows();
	 for(int i=0;i<rowcount;i++)
	{
	 data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
	 System.out.println(data[i][0]);

	}
	return data;}

	@DataProvider(name = "search2")
	public String[][] getexceldata2() throws IOException {
	String [][] data = new String[1][1];
 String excelpath= "C:\\Users\\hridya.susil\\OneDrive - HCL Technologies Ltd\\Documents\\Amazon data.xlsx";
	 FileInputStream input1=new FileInputStream(excelpath);
	 XSSFWorkbook workbook=new XSSFWorkbook(input1);
	 XSSFSheet sheet=workbook.getSheet("Sheet2");
	 int rowcount=sheet.getPhysicalNumberOfRows();
	 for(int i=0;i<rowcount;i++)
	{
	 data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
	 System.out.println(data[i][0]);

	}
	return data;}
	
	
	@DataProvider(name = "search4")
	public String[][] getexceldata4() throws IOException {
	String [][] data = new String[1][1];
 String excelpath= "C:\\Users\\hridya.susil\\OneDrive - HCL Technologies Ltd\\Documents\\Amazon data.xlsx";
	 FileInputStream input1=new FileInputStream(excelpath);
	 XSSFWorkbook workbook=new XSSFWorkbook(input1);
	 XSSFSheet sheet=workbook.getSheet("Sheet4");
	 int rowcount=sheet.getPhysicalNumberOfRows();
	 for(int i=0;i<rowcount;i++)
	{
	 data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
	 System.out.println(data[i][0]);

	}
	return data;
	}
}