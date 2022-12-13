package NewstoxPomclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NeoStoxUtility.NeowsUtilty;

public class NewstoxPasscode {
	
	@FindBy(id="txt_accesspin")private WebElement passcod;
	@FindBy(xpath = "//a[text()='Submit']")private WebElement submit;
	
	public NewstoxPasscode(WebDriver driver)
	{PageFactory.initElements(driver,this);}
	
	public void Enterpass() throws IOException
	{
		passcod.sendKeys(NeowsUtilty.readDataFromPropertyFile("passward"));
	}
	
	public void EnterSubmit() throws InterruptedException
	{
		submit.click();
		Thread.sleep(3000);
	}

}
