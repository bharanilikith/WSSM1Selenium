package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test9 {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
driver.findElement(By.linkText("Customer Service")).click();
driver.findElement(By.linkText("Home")).sendKeys(args)
	}

}
