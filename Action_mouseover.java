package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_mouseover {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath(""))).build().perform();
		
		//drag and drop
		
		
		
		
		
		WebElement source = driver.findElement(By.xpath(""));
		WebElement target = driver.findElement(By.xpath(""));
		
		
		act.dragAndDrop(source, target);
		
		
		
		
		
		act.clickAndHold(source).moveToElement(source).release(target);
		act.build().perform();
		
		
		act.moveToElement(driver.findElement(By.xpath("")));
		act.keyDown(Keys.CONTROL);
		act.moveToElement(driver.findElement(By.xpath("")));
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		
		
		act.moveToElement(driver.findElement(By.xpath(""))).doubleClick();
		act.sendKeys(Keys.ENTER);

		
		
		
		
	}

}
