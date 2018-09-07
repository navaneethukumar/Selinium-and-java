package seliniumandjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandles {
	
	
	public static void main(String[] args) {
		
		
		
		
		WebDriver driver=new FirefoxDriver();
		//mutiple handles
		
		
		
		
		Set<String> windws = driver.getWindowHandles();
		
		 Iterator<String> windowscount = windws.iterator();
		 ArrayList<String> al = new ArrayList<>();
		 while(windowscount.hasNext()){
			 al.add(windowscount.next());
		 }
		 driver.switchTo().window(al.get(0));
		 
		 driver.close();
		 driver.switchTo().window(al.get(5));
	}

}
