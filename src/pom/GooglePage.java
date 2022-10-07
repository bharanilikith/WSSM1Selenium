package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

	@FindBy(name="q")
	private WebElement serachtb;
	
	
	public GooglePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void serach(String name) {
		serachtb.sendKeys(name);
	}
}
