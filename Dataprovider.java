package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	WebDriver driver;
	
	
	
	@Test(dataProvider="dd")
	public void login(String username,String pwd) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.className("_2zrpKA")).sendKeys(username);
		Thread.sleep(3000);
		/*driver.findElement(By.className("_2zrpKA _3v41xv")).click();
		Thread.sleep(2000);*/
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span")).click();
		Thread.sleep(10000);
		String verification=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div/div/div[3]/div[1]/div/div/div/span/div")).getText();
		Assert.assertTrue(verification.contains("Naresh"), "creditionals wrong");
		
		
	}
	@AfterMethod
	public void teardown(){
		driver.close();
	}
	
	
	@DataProvider(name="dd")
	public Object[][]passdata(){
		Object[][] data=new Object[3][2];
		data[0][0]="8500707813";
		data[0][1]="neethu23";
		
		data[1][0]="85007078sdsd13";
		data[1][1]="8500707dsssd813";
		
		data[2][0]="85007078sdsd13";
		data[2][1]="8500707dsssd813";
		return data;
	}

}
