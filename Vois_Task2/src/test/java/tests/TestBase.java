package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	//Driver Which i use
	public static WebDriver Driver;

	//Method to start Driver
	@BeforeSuite
	public void StartDriver() 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		Driver =new ChromeDriver();
		Driver.manage().window().setSize(new Dimension(1024, 768));
		Driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");

	}
 
	//Method to stop Driver after finish tests
	@AfterSuite
	public void stortDriver() 
	{
		//Driver.quit();

	}





}
