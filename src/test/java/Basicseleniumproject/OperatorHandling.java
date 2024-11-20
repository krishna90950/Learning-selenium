package Basicseleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OperatorHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		/*TEXT BOX HANDLING
		 driver.get("https://the-internet.herokuapp.com/forgot_password");
		 WebElement textboxs = driver.findElement(By.name("email"));
		 boolean isdis = textboxs.isDisplayed();
		 System.out.println(isdis);
		 boolean isena = textboxs.isEnabled();
		 System.out.println(isena);
		 textboxs.sendKeys("seleniumdemo");
		 Thread.sleep(5000);
		 String enteredv = textboxs.getAttribute("value");
		 System.out.println(enteredv);
		 textboxs.clear();*/
		
		/* CHECKBOX HANDLING
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement  chbx1= driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		// isdisplayed or not
		boolean isdisp = chbx1.isDisplayed();
		System.out.println(isdisp);
		//is enabled or not
		boolean isenab = chbx1.isEnabled();
		 System.out.println(isenab);
		 //select checkbox
		 chbx1.click();
		 //selected status
		 System.out.println(chbx1.isSelected());
		 //unselect chkbox
		 Thread.sleep(5000);
		 chbx1.click();
		//selected status
		 System.out.println(chbx1.isSelected()); */
		/* OPTION SELECTION
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		WebElement dd = driver.findElement(By.id("dropdown"));
		Select selectdd = new Select(dd);
		selectdd.selectByIndex(1); */
		
		

				
		
		
	}
}
