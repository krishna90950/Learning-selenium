package Basicseleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendardemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cheapflights.ca/?lang=en&skipapp=true&gclid=EAIaIQobChMIrNn_zbG2iAMVWE7_AR041jQaEAAYASAAEgKeTvD_BwE&aid=134667683979");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='Start date']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(@aria-label,'11 Sep')]")).click();
	}

}
