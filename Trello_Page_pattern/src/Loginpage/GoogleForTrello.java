package Loginpage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Browsers.Browser;

public class GoogleForTrello {
	
	public static String url="https://www.google.co.in/?gfe_rd=cr&ei=EC1hVpzDNsrE8geXsqa4CA&gws_rd=ssl";
	public static void  Goto(){
		
		Browser.driver.get(url);
		
	}
	
	public static void Searchtrello(){
		WebElement searchbox=Browser.driver.findElement(By.id("lst-ib"));
		Actions Searchaction= new Actions(Browser.driver);
		Searchaction.keyDown(searchbox, Keys.SHIFT).sendKeys("trello").build().perform();
		Searchaction.sendKeys(Keys.DOWN).build().perform();
		Searchaction.sendKeys(Keys.ENTER).build().perform();
		//String s=Browser.driver.getWindowHandle();
		//System.out.println(" " +s);
		Browser.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement Trellolink=Browser.driver.findElement(By.linkText("Log in…"));
		
		Searchaction.contextClick(Trellolink).build().perform();
		Searchaction.sendKeys(Keys.DOWN).build().perform();
		Searchaction.sendKeys(Keys.ENTER).build().perform();
		Browser.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Searchaction.sendKeys(Keys.CONTROL,Keys.TAB).build().perform();
		
		
		
		
		
		}
	}
	
	


