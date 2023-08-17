package ATB.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class selenium01 {
	
	ChromeOptions option;
	WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\drivers\\chromedriver.exe");
		option = new ChromeOptions();
		option.addArguments("start-maximized");
		driver = new ChromeDriver(option);
	}
	@Test
	public void sdet()
	{
		driver.get("https://sdet.club/live");
	}
	
	@AfterSuite
	public void logOut()
	{
		driver.quit();
	}
	
	
}
