package popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws IOException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();

Runtime.getRuntime().exec("C:\\Users\\Bharanilikith\\Documents\\Autoit\\fileupload.exe");


	}

}
