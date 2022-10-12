package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));		
WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));

WebElement block11 = driver.findElement(By.xpath("//h1[text()='Block 1']"));		
WebElement block3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));	


Thread.sleep(6000);
Actions a=new Actions(driver);
a.dragAndDrop(block1, block4).perform();


Thread.sleep(6000);
a.dragAndDrop(block11, block3).perform();

//delete
driver.manage().deleteAllCookies();

//particular
driver.manage().deleteCookie("address");

//get the cookies
driver.manage().getCookies();

//particular
driver.manage().getCookieNamed("address");

	}

}
