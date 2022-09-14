package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("agjfhjhgg");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("456789iuhgvgf");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		

	}

}
