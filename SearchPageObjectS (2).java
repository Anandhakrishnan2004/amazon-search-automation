package com.amazon.pageobjects;

	import org.openqa.selenium.By; 
	import org.openqa.selenium.WebDriver;

	 public class SearchPageObjectS {

	WebDriver driver = null;
//Store in locators to a variables
	By button_searchDropdownBox = By.id("searchDropdownBox");
	By textbox_search = By.id("twotabsearchtextbox");
	By searchsubmitbutton = By.xpath("//*[@id=\"nav-search-submit-button\"]");
	By clickonProduct = By.linkText("Samsung Galaxy S23 5G (Lavender, 8GB, 256GB Storage)");
	public SearchPageObjectS(WebDriver driver)
	{
		this.driver = driver;
		}
	//Callings the variables stored
	public void clicksearchDropdownBoxButton() {
		driver.findElement (button_searchDropdownBox).click();
		}
	
		public void setTextInSearchBox(String Text) {
		driver.findElement (textbox_search).sendKeys("Samsung Galaxy S23 5G Lavender");
		}
		
		public void clickonSearchBox() {
		 driver.findElement(searchsubmitbutton).click();
		}
		public void clickonProduct() {
		 driver.findElement(clickonProduct).click();
		}
	 }



