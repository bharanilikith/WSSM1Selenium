package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");

Thread.sleep(5000);
driver.findElement(By.name("username")).sendKeys("qwertyuio");
Thread.sleep(3000);
driver.findElement(By.name("password")).sendKeys("qwertyui");
Thread.sleep(3000);
driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]")).click();

Thread.sleep(3000);

driver.close();

	}

}
