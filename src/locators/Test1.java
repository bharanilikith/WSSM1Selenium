package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

driver.findElement(By.id("email")).sendKeys("selenium");
driver.findElement(By.name("pass")).sendKeys("managerytretrtus");
driver.findElement(By.name("login")).click();



	}

}
