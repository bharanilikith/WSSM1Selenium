package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement ele = driver.findElement(By.id("course"));
	
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	
	driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
	
	WebElement addbtn = driver.findElement(By.id("add"));
	a.doubleClick(addbtn).perform();
	}

}
