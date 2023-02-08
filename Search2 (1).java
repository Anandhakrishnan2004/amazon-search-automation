package com.amazon.testcase;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.amazon.pageobjects.SearchPageObjects2;
import com.amazon.utilities.Dataprovider;

	public class Search2 
	{

	private static WebDriver driver;



	@Test(dataProvider = "search2",dataProviderClass = Dataprovider.class)
	public static void SearchTest() throws Exception 
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hridya.susil\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	System.out.println("Title is:"+driver.getTitle());
	ExtentReports extent=new ExtentReports();
	ExtentHtmlReporter spark=new ExtentHtmlReporter("C:\\Users\\hridya.susil\\eclipse-workspace9\\reportAnandhu.html");
	extent.attachReporter(spark);
	
	ExtentTest test=extent.createTest("Verify the Daily Deals functionality");
	SearchPageObjects2 searchPageObj = new SearchPageObjects2(driver);
	driver.get("https://www.amazon.in/"); 

	Thread.sleep(2000);
	//calling clicksearchDropdownBoxButton inorder to click on the search button
	searchPageObj.clicksearchDropdownBoxButton();
	// calling the setTextInSearchBox inorder to set search in box
	searchPageObj.setTextInSearchBox("jeingu");
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
		search.setDriver(driver);
	}
	}

