package NewstoxExcelsheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	public void enteruserID(String mon)
	{
		userID.sendKeys(mon);
	}
	
	public void sighninNewstox()
	{
		sighn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
