package Utility;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;


public class BaseClass {

	public static WebDriver driver;
	private static String baseUrl = "https://trello.com/home";


	public void launchBrowser() {

		Reporter.log("=====Browser Session Started=====", true);

		driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Reporter.log("=====Application Started=====", true);

	}

	public void closeApplication() throws InterruptedException {
		driver.quit();
		//driver.close();
		Reporter.log("=====Browser Session End=====", true);
		Thread.sleep(3000);


	}




}
