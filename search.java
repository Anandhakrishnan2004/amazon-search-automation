package com.amazon.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.amazon.pageobjects.SearchPageObjectS;
import com.amazon.utilities.Dataprovider;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class search 
{

private static WebDriver driver;



@Test(dataProvider = "search",dataProviderClass = Dataprovider.class)
public static void SearchTest(String product) throws Exception 
{
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hridya.susil\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

System.out.println("Title is:"+driver.getTitle());
ExtentReports extent=new ExtentReports();
ExtentHtmlReporter spark=new ExtentHtmlReporter("C:\\Users\\hridya.susil\\eclipse-workspace9\\reportAnandhu.html");
extent.attachReporter(spark);
ExtentTest test=extent.createTest("Verify the Daily Deals functionality");

SearchPageObjectS searchPageObj = new SearchPageObjectS(driver);
driver.get("https://www.amazon.in/"); 
//calling clicksearchDropdownBoxButton inorder to click on the search button
Thread.sleep(2000);
searchPageObj.clicksearchDropdownBoxButton();
// calling the setTextInSearchBox inorder to set search in box
searchPageObj.setTextInSearchBox(product);
// calling clickonSearchBox inorder to click search box
searchPageObj.clickonSearchBox();
// calling clickonProduct inorder to click on product
searchPageObj.clickonProduct();
		
		
		
		driver.close();
		extent.flush();
}



public static WebDriver getDriver() {
	return driver;
}



public static void setDriver(WebDriver driver) {
	search.driver = driver;
}
}
