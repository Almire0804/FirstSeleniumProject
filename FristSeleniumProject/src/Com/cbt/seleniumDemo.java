package Com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class seleniumDemo {
	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver",
//				"/Users/adilalim/Documents/selenuim dependencies/drivers/geckodriver");
//		
//		WebDriver driver = new FirefoxDriver();
//		
//		driver.get("http://google.com");
//		
//		String expected = "Google";
//		String actual = driver.getTitle();
//		System.out.println(actual);
//		
//		if(expected.equals(actual)) {
//			System.out.println("pass");
//		}else {
//			System.out.println("fail");
		System.setProperty("webdriver.chrome.driver", "/Users/adilalim/Documents/selenuim dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://cybertekschool.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String expected = "https://cybertekschool.com";
		String actual = driver.getCurrentUrl();
		
		System.out.println(actual);
		
		if(actual.contains(expected)) {
			System.out.println("pass");
		}else{
			System.out.println("fail");
		
		}
		
	}

}
