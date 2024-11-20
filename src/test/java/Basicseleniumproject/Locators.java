package Basicseleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get("https://www.facebook.com");
		//driver.findElement(By.id("email")).sendKeys("9095017512"); //id
		//driver.findElement(By.name("pass")).sendKeys("9095017512"); // name
		//driver.findElement(By.linkText("Forgot password?")).click(); //Linktext
		//driver.findElement(By.partialLinkText("Forgot ")).click(); //partial link text
		//driver.findElement(By.xpath("Forgot ")).sendKeys("9095017512"); // absolutexpath
		//driver.findElement(By.xpath("//input[@aria-label = 'Email or phone number']")).sendKeys("9095017512"); // relativexpath
		//driver.findElement(By.xpath("//input[contains(@aria-label,'Pass')]")).sendKeys("9095017512"); 
		// relative xpath types contains(), starts-with(), text(), child, parent, following sibiling, preceding sibiling, OR AND
		//driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		//driver.findElement(By.cssSelector("button.oxd-button")).click();
		//CSS selector: ID = tagname#value, class = tagname.value, attribute= tagname[att = 'value'], mattribute =tagname[att = 'value']...
		//cointains = *, starts with = ^, ends with = $
		 // List <WebElement> alltexts =  driver.findElements(By.className("inputtext"));
		  //System.out.println(alltexts.size());
		  //alltexts.get(0).sendKeys("9095017512");
		  //alltexts.get(1).sendKeys("9095017512");
		  //List <WebElement> allLinks =  driver.findElements(By.tagName("a"));
		  //System.out.println(allLinks.size());
		 /*for(int i = 0; i<allLinks.size();i++) {
		 //System.out.println(allLinks.get(i).getText());*/
		 //WebElement searchboxtexts = driver.findElement(By.name("q"));
	     //searchboxtexts.sendKeys("selenium"); 
	     List <WebElement> alltags = driver.findElements(By.tagName("a"));
	     System.out.println(alltags.size());
	     
	}

}
