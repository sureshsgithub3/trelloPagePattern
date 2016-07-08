package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver driver;
	
	
	public static void openupbrowser(){
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	
	public static WebDriver Driver(){
		return driver;
		
	}

}
