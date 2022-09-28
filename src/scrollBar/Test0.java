package scrollBar;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//typcasting
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,6000)");

Thread.sleep(3000);
js.executeScript("window.scrollBy(0,-6000)");


	}

}
