package NewstoxExcelsheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewstoxHome {
	
	@FindBy(id="lbl_username")private WebElement userid;
	
	public NewstoxHome(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void validateuserid(WebDriver driver,String name)
	{
		String Expecteduserid=name;
		 String Actualuserid = userid.getText();
		 
		 if(Actualuserid.equals(Expecteduserid))
		 {
			 System.out.println("Actual and Expected userid is same than TC pass");
		 }
		 else {
			 System.out.println("Actual and Expected userid is not same TC failed");
		 }
		
	}

}
