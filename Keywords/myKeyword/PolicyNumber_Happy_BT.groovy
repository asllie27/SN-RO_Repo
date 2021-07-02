package myKeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

/*import MobileBuiltInKeywords as Mobile
 import WSBuiltInKeywords as WS
 import WebUiBuiltInKeywords as WebUI*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PolicyNumber_Happy_BT {

	String fileLocation = "C:\\Users\\Asllie Sablan\\Katalon Studio\\GIT\\SN-RO_Repo\\Test Data\\Policy Number_BT.xlsx";
	String SheetName1 = "AL_Policy Number";
	String SheetName2 = "APD_Policy Number";

	@Keyword
	public void getALPolicyNumber(String AL_PolicyNumber) throws IOException{
		FileInputStream fis = new FileInputStream(fileLocation);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(SheetName1);
		int rowCount = sheet.getLastRowNum();// -sheet.getFirstRowNum();
		Row row = sheet.createRow(rowCount+1);
		Cell cell = row.createCell(0);
		//cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(AL_PolicyNumber);
		FileOutputStream fos = new FileOutputStream(fileLocation);
		workbook.write(fos);
		fos.close();

	}
	@Keyword
	public void getAPDPolicyNumber(String APD_PolicyNumber) throws IOException{
		FileInputStream fis = new FileInputStream(fileLocation);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(SheetName2);
		int rowCount = sheet.getLastRowNum();// -sheet.getFirstRowNum();
		Row row = sheet.createRow(rowCount+1);
		Cell cell = row.createCell(0);
		//cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(APD_PolicyNumber);
		FileOutputStream fos = new FileOutputStream(fileLocation);
		workbook.write(fos);
		fos.close();

	}
}
