package NewstoxExcelsheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewstoxPasscode {
	
	@FindBy(id="txt_accesspin")private WebElement passcod;
	@FindBy(id="lnk_submitaccesspin")private WebElement submit;
	
	public NewstoxPasscode(WebDriver driver)
	{PageFactory.initElements(driver,this);}
	
	public void Enterpass(String code)
	{
		passcod.sendKeys(code);
	}
	
	public void EnterSubmit()
	{
		submit.click();
	}

}
