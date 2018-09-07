package seliniumandjava;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String args[]){
		// TODO Auto-generated method stub

	
	
	WebDriver driver=new FirefoxDriver();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	
	
	
	//explicit wait
	
	WebDriverWait wait=new WebDriverWait(driver,60);
	wait.pollingEvery(3, TimeUnit.SECONDS);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
	
	
	
	//fluent wait
	
	
	WebElement waitt2=new FluentWait<WebDriver>(driver)
			.withTimeout(120, TimeUnit.SECONDS).pollingEvery(3, TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
	
	waitt2.click();
	
	//page timeout
	
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	
	
	
	
	

	
	}
}
