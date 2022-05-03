package stepsAss2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass extends AbstractTestNGCucumberTests {
	
	public static ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}

}
