package SelTestNGdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampletc {

	@Test
	public void GooglePage() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
}
