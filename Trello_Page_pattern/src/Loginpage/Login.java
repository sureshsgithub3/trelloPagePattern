package Loginpage;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class Login {
	
	
	
	public   static void TrelloLogin(String Username,String password) throws InterruptedException{
		
		Thread.sleep(3000);
		String a=Browser.driver.switchTo().activeElement().getAttribute("input");
		System.out.println(a);
		//ArrayList<String>al= new ArrayList<String>(Browser.driver.findElements(By.tagName("input")));
		List<WebElement> li= Browser.driver.findElements(By.tagName("input"));
		System.out.println(li);
		//Browser.driver.switchTo().window(al.get(1));
		//System.out.println(al);
		Browser.driver.switchTo().activeElement().getAttribute("input");
		//Browser.driver.findElement(By.xpath("/html/body/section[1]/div/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys(Username);
		Browser.driver.findElement(By.id("password")).sendKeys(password);
		
		
		Browser.driver.findElement(By.id("login")).click();
		
		
		
		
	}
	
	
	
	

}
