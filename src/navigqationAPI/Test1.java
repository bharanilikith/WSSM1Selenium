package navigqationAPI;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.navigate().to("https://www.amazon.com/");
	
	
	Thread.sleep(3000);
	driver.navigate().back();
	
	Thread.sleep(3000);
	driver.navigate().forward();
	
	Thread.sleep(3000);
	driver.navigate().refresh();
}
}
