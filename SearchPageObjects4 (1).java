package com.amazon.pageobjects;


	import org.openqa.selenium.By; 
	import org.openqa.selenium.WebDriver;

	 public class SearchPageObjects4 {

	WebDriver driver = null;

	By button_searchDropdownBox = By.id("searchDropdownBox");
	By textbox_search = By.id("twotabsearchtextbox");
	By searchsubmitbutton = By.xpath("//*[@id=\"nav-search-submit-button\"]");
	public SearchPageObjects4(WebDriver driver) {this.driver = driver;}
	public void clicksearchDropdownBoxButton() {
		driver.findElement (button_searchDropdownBox).click();
		}
		public void setTextInSearchBox(String Text) {
		driver.findElement (textbox_search).sendKeys("KFHFNFBNF");
		}
		public void clickonSearchBox() {
		 driver.findElement(searchsubmitbutton).click();
		}
		public void clickonProduct() {
		}
	 }


