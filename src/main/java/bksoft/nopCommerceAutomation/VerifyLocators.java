package bksoft.nopCommerceAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLocators {
  public static void main(String[] args) {
  
	  String url = "https://demo.nopcommerce.com/";
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get(url);
	  
	  
  }
}
