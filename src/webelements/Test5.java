package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement button = driver.findElement(By.xpath("//div[text()='Login ']"));

Point loc = button.getLocation();
int x = loc.getX();
System.out.println(x+"x co-ordinates");

int y = loc.getY();
System.out.println(y+"y co-ordinates");


driver.close();

	}

}
