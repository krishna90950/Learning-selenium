package SelTestNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterdemo {
WebDriver driver = new ChromeDriver();
	@Parameters({"username","password"})
	@Test(priority = 1)
	public void login(String username,String password) throws InterruptedException{
		Thread.sleep(800);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(800);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath(" //button[@type = 'submit'] ")).click();
		Thread.sleep(500);
		
	}
	

}
