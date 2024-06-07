package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver chormeBrowser() {
		 driver=new ChromeDriver();
		return driver;

	}
	
	public static WebDriver edgeBrowser() {
		 driver=new EdgeDriver();
		return driver;

	}
	
	
	public static  WebDriver launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			 driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			 driver=new FirefoxDriver();
		}
		return driver;

	}
	
	
	
	
	
	
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
	
	public static void implicitWait(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);

	}
	
	public static void sendkeys(WebElement e,String value) {
		e.sendKeys(value);

	}
	
	public static void click(WebElement e) {
		e.click();

	}
	
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;

	}
	
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;

	}
	
	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;

	}
	
	public static void quit() {
		driver.quit();

	}
	
	public static void moveToElement(WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(target);

	}
	
	public static void dragAndDrop(WebElement src,WebElement dest) {
		Actions a=new Actions(driver);
        a.dragAndDrop(src, dest);
	}
	
	public static void selectByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);

	}
	
	public static void refresh() {
		driver.navigate().refresh();

	}
	
//	public static String readExcel(String filename,String sheet,int row,int colunm) throws IOException {
//		
//		File f=new File("C:\\Users\\dell\\eclipse-workspace\\MavenFastrack\\src\\test\\resources\\Excel\\"+filename+".xlsx");
//		FileInputStream st=new FileInputStream(f);
//		Workbook w=new XSSFWorkbook(st);
//		Sheet s = w.getSheet(sheet);
//		Row r = s.getRow(row);                                 
//		Cell cell = r.getCell(colunm);
//		int type = cell.getCellType();
//		//type 1---string
//		//type 0---numbers,date		
//		String value=null;
//		if(type==1) {
//			 value = cell.getStringCellValue();
//		}
//		else {
//			if(DateUtil.isCellDateFormatted(cell)) {
//				Date dateCellValue = cell.getDateCellValue();
//				SimpleDateFormat si=new SimpleDateFormat("dd-MMM-yyyy");
//				 value = si.format(dateCellValue);
//			}
//			else {
//				double numericCellValue = cell.getNumericCellValue();
//				long number=(long)numericCellValue;
//				 value = String.valueOf(number);
//			}
//			
//			
//		}
//		return value;
//		
//
//	}
	
	
	
	
	
	
	
	
	
	
	
}
