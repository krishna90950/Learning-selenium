package Basicseleniumproject;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Ashotscrshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://about.meta.com/");
		//Screenshot ss = new AShot().takeScreenshot(driver);
		Screenshot ss = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		File Myf = new File("C:\\Users\\Krishna\\eclipse-workspace\\Seleniumjavapractice\\Ascreenshot\\img1.png");
		ImageIO.write(ss.getImage(), "png", Myf);
	}

}
