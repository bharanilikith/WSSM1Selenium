package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {

	public static void main(String[] args) {

ChromeDriver c=new ChromeDriver();
c.get("https://www.facebook.com/");
System.out.println(c.getTitle());
c.close();

FirefoxDriver fd=new FirefoxDriver();
fd.get("https://www.facebook.com/");
System.out.println(fd.getTitle());
fd.close();

	}

}
