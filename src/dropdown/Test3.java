package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Bharanilikith/Desktop/dd.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement dd = driver.findElement(By.id("MTR"));
		Select s=new Select(dd);
		s.selectByIndex(1);
		s.selectByValue("C");
		s.selectByVisibleText("Dosa");
		
		List<WebElement> opt = s.getAllSelectedOptions();
		System.out.println(opt.size());

		for(WebElement b:opt) {
			System.out.println(b.getText());
		}
		
		s.deselectByIndex(1);
		s.deselectByValue("C");
		s.deselectByVisibleText("Dosa");
		
	}

}
