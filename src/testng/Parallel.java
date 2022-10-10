package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	public WebDriver driver;
	
	@Parameters({"BrowserName"})
	@Test
	public void demo(String browser) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String title = driver.getTitle();
		Reporter.log(title,true);
		
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
			
		
	}

}
