package datadrieven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {

	Properties pdata=new Properties();
FileInputStream fis=new FileInputStream("./data.properties");
	pdata.load(fis);
	
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get(pdata.getProperty("url"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.id("email")).sendKeys(pdata.getProperty("username"));
driver.findElement(By.id("pass")).sendKeys(pdata.getProperty("password"));
	


	}

}
