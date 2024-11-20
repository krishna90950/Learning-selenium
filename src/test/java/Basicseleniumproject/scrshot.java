package Basicseleniumproject;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// take screenshot
		captureScreenshot(driver, "loginPage");

		// enter username

		driver.findElement(By.name("username")).sendKeys("Admin");

		// takescreenshot
		captureScreenshot(driver, "username");

		// enter password

		driver.findElement(By.name("password")).sendKeys("admin123");

		// take screenshot
		captureScreenshot(driver, "password");

		// click on login button
		driver.findElement(By.xpath("//button[@type = \"submit\"]")).click();

		// take screenshot

		captureScreenshot(driver, "homepage");

	}

	public static void captureScreenshot(ChromeDriver driver, String fileName) {

		TakesScreenshot scrsht = driver;
		File image = scrsht.getScreenshotAs(OutputType.FILE);

		File myFile = new File("C:\\Users\\Krishna\\eclipse-workspace\\Seleniumjavapractice\\Screenshot\\"+fileName +".png");
		try {
			FileUtils.copyFile(image, myFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
