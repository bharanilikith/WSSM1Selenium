package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		//Step:1 open the browser
		WebDriver driver=new ChromeDriver();
		
		//step:2 maxmize the browser
		driver.manage().window().maximize();
		
		//step:3 enter the url
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		//Step:4 enter the valid username
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("admin");
		
		//step:4 eneter the valid password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		
		//step:5 clcik on login button
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		//step:6 get the title of the application
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		
		//step:7 get the url of the application
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//step:8 verification
		if(acttitle.contains("Online Shopping Site for Mobiles,")) {
			System.out.println("Pass:home page is dispalyed");
		}
		else
		{
			System.out.println("Fail:home page is not dispalyed");
		}
		
		//step: 9 close the application
		driver.close();
		
		

	}

}
