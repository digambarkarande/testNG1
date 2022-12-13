package NewstoxPomclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NeoStoxUtility.NeowsUtilty;

public class Newstoxlogin {

	
	
	//we need to decleration 
	
	@FindBy(xpath="(//input[@type='number'])[1]")private WebElement userID;
	@FindBy(id="lnk_signup1")private WebElement sighn;
	
	//to initialization we use constructore and page factory-->initElement
	
	public Newstoxlogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//useage of methods 
	
	public void enteruserID() throws IOException
	{
		userID.sendKeys(NeowsUtilty.readDataFromPropertyFile("Mon"));
	}
	
	public void sighninNewstox()
	{
		sighn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
