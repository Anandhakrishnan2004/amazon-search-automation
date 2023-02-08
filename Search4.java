package com.amazon.testcase;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	import com.amazon.pageobjects.SearchPageObjects4;
import com.amazon.utilities.Dataprovider;

	public class Search4 
	{

	private static WebDriver driver;



	@Test(dataProvider = "search4",dataProviderClass = Dataprovider.class)
	public static void SearchTest() throws Exception 
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hridya.susil\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	System.out.println("Title is:"+driver.getTitle());
	//ExtentReports extent=new ExtentReports();
	//ExtentHtmlReporter spark=new ExtentHtmlReporter("C:\\Users\\hridya.susil\\eclipse-workspace9\\reportAnandhu.html");
	//extent.attachReporter(spark);
	//
	//ExtentTest test=extent.createTest("Verify the Daily Deals functionality");
	SearchPageObjects4 searchPageObj = new SearchPageObjects4(driver);
	driver.get("https://www.amazon.in/"); 

	Thread.sleep(2000);
	searchPageObj.clicksearchDropdownBoxButton();
	searchPageObj.setTextInSearchBox("KFHFNFBNF");
	searchPageObj.clickonSearchBox();
	searchPageObj.clickonProduct();
			
			
			
			driver.close();
//			extent.flush();
	}



	public static WebDriver getDriver() {
		return driver;
	}



	public static void setDriver(WebDriver driver) {
		search.setDriver(driver);
	}
	}



