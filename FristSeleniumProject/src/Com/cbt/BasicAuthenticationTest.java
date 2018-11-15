package Com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/adilalim/Documents/selenuim dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoaut.com");
		
		//findElement --> finds element on a page;
		//locator--> is a way of finding element on a page used by selenium.locators
		//sendKeys --> types on element
		//By.name("userName") -->how to find it
		driver.findElement(By.name("userName")).sendKeys("tutorial");
      driver.findElement(By.name("password")).sendKeys("tutorial");
      //click() --> clicks
      driver.findElement(By.name("login")).click();
      
      String expected = "flight finder";
		String actual = driver.getTitle();
		
		if(actual.contains(expected)) {
			System.out.println("pass");
		}else{
			System.out.println("fail");
		
	}

}

}