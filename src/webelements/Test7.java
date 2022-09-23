package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


WebElement serachtb = driver.findElement(By.id("twotabsearchtextbox"));
	if(serachtb.isDisplayed()) {
		System.out.println("Pass:element is displayed");
		serachtb.sendKeys("phone");
	}
	else
	{
		System.out.println("Fail:element is not dispalyed");
	}
	
	Thread.sleep(3000);
	driver.close();
	
	}

}
