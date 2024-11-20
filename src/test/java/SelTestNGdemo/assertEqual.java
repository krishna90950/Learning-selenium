package SelTestNGdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertEqual {
	@Test
	public void loginorangehrm() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath(" //button[@type = 'submit'] ")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a/span[text() ='Leave']")));
		driver.findElement(By.xpath("//a/span[text() ='Leave']")).click();
		WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("OrangeHRM, Inc")));
		boolean displayhelp = driver.findElement(By.linkText("OrangeHRM, Inc")).isDisplayed();
		
		String ActualUrl = driver.getCurrentUrl();
		//String ExpectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String ExpectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Assert.assertNotEquals(ActualUrl, ExpectedUrl);
		Assert.assertTrue(displayhelp);
	}
	

}
