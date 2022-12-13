package NewstoxPomclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeoStoxUtility.NeowsUtilty;

public class NewstoxHome {
	
	@FindBy(id="lbl_username")private WebElement userid;
	@FindBy(xpath="(//div[@class='col-lg-12 text-center'])[8]")private WebElement poup;
	@FindBy(xpath="(//div[@class='col-lg-12 py-2 text-center'])[3]")private WebElement poupclose;
	@FindBy(id="lnk_logout")private WebElement logout;
	@FindBy(id="lbl_curbalancetop") private WebElement fund;
	public NewstoxHome(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void validateuserid() 
	{
		String Expecteduserid="Hi Digambar karande";
		 String Actualuserid = userid.getText();
		 
		 if(Actualuserid.equals(Expecteduserid))
		 {
			 System.out.println("Actual and Expected userid is same than TC pass");
		 }
		 else {
			 System.out.println("Actual and Expected userid is not same TC failed");
		 }
		
	}
	
	public void closepoup(WebDriver driver)
	{
		if(poup.isDisplayed())
		{
			NeowsUtilty.wait1(driver,1000);
			
			poup.click();
			
			Reporter.log("okbutton handle sucessfull",true);
			
			NeowsUtilty.wait1(driver,1000);
			
			poupclose.click();
			
			Reporter.log("close button handel sucessfully",true);
			}	
		else {
			NeowsUtilty.wait1(driver,2000);
			Reporter.log("There is no poup",true);
		}
	}
	
	public String fundase() 
	{
		String actualfund = fund.getText();
		Reporter.log("sucessfully get actual fund",true);
		return actualfund;
		
		
		
		
	}
	

	
	public void myfund()
	{
		Reporter.log("My avilable fund is"+fund.getText(),true);
	}
	public void Enterlogout()
	{
		userid.click();
		logout.click();
	}
	
	
	public String getActualuserId(WebDriver driver)
	{
		String Actualuser = userid.getText();
		NeowsUtilty.wait1(driver,2000);
		return Actualuser;
		
				
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
