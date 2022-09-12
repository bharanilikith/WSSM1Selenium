package windowMangement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();

//maxmize
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");

//fullscreen
Thread.sleep(3000);
driver.manage().window().fullscreen();

//minimize
Thread.sleep(3000);
driver.manage().window().minimize();

	}
;
}
