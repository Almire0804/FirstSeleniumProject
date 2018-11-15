package Com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifySearch {

	private static final String WebdriverManager = null;

	public static void main(String[] args) {
		//WebdriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://etsy.com");
		String searchTerm="fathers day gifts";
		
		WebElement input=driver.findElement(By.id("search-query"));
		
		input.sendKeys(searchTerm+Keys.ENTER);
		input = driver.findElement(By.id("search-query"));
		
		
		//driver.sendKeys(searchTerm);
	}

}
