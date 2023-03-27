package bksoft.nopCommerceAutomation.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends VerifyLocators{
	
	@FindBy(id="customerCurrency")
	private WebElement currencyList;
	
	@FindBy(xpath = "//img[@alt=\"nopCommerce demo store\"]")
	private WebElement logo;
	
	@FindBy(linkText = "Register")
	private WebElement register;
	
	@FindBy(linkText = "Log in")
	private WebElement login;
	
	@FindBy(linkText = "/wishlist")
	private WebElement wishList;
	
	@FindBy(linkText = "/cart")
	private WebElement cart;
	
	@FindBy(id="small-searchterms")
	private WebElement searchBar;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement searchBtn;
	
	@FindBy(className = "top-menu")
	private WebElement ul;
	
	private List<WebElement> listItems = ul.findElements(By.tagName("li"));
	
	private List<WebElement> prodCategory;
		
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public  void sortedProductCategory() {
		for(WebElement item:listItems) {
			if(item.getText() != ""){
				prodCategory.add(item);
			}
		}
	}
	
	public void getList() {
		sortedProductCategory();
		for(WebElement item: prodCategory) {
			System.out.println(item.getText());
		}
	}
}


