package seliniumandjava;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.internal.Utils;

public class Scrrenshot {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		TakesScreenshot tc=(TakesScreenshot)driver;
		File file = tc.getScreenshotAs(OutputType.FILE);
		Utils.copyFile(file, new File(""));
		System.out.println("");

	}

}
