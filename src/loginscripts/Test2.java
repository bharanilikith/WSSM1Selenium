package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.udemy.com/join/login-popup/");



Thread.sleep(5000);
driver.findElement(By.name("email")).sendKeys("qwertyuio");
driver.findElement(By.id("id_password")).sendKeys("123456rdyg");
driver.findElement(By.id("submit-id-submit")).click();

String actualtile = driver.getTitle();
System.out.println(actualtile);

String url = driver.getCurrentUrl();
System.out.println(url);

if(actualtile.contains("Login | Udemy")) {
	System.out.println("Pass");
}
		
else
{
	System.out.println("Fail");
}

driver.close();


	}

}
