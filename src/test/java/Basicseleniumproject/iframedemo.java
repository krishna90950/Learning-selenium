package Basicseleniumproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframedemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		/* IFRAMEDEMO
		driver.get("https://jqueryui.com/dialog/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Close']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Demos")).click();*/
		// NESTED IFRAME
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		WebElement txt = driver.findElement(By.id("content"));
		System.out.println(txt.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent(); 
	}

}
