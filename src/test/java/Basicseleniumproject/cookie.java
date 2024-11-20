package Basicseleniumproject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookie {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// add cookie

		Cookie myCookie = new Cookie("testName", "test vaue");

		driver.manage().addCookie(myCookie);

		// get Cookie
		Set<Cookie> allc = driver.manage().getCookies();

		for (Cookie c : allc) {
			System.out.println(c.getName() + "#####" + c.getExpiry());
		}
		// delete cookie

		driver.manage().deleteCookieNamed("orangehrm"); // 1

		driver.manage().deleteAllCookies();

	}

}
