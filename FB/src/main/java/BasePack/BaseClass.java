package BasePack;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

		public static WebDriver driver;

		public static void BrowserLaunch() {
			driver = new ChromeDriver();
		}

		public static void implicityWait() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		}

		public static void RobotClass() throws AWTException
		{
			
			Robot robot = new Robot();

		}
		public static void quit() {
			driver.quit();
		}

		public static void maximize() {
			driver.manage().window().maximize();
		}

		public static void Url(String url) {
			driver.get(url);
		}
	}

