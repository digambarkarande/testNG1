package NeostoxTestclass;


import org.testng.annotations.Test;

import NeoStoxUtility.NeowsUtilty;
import NeostoxBase.NeoSBase;
import NewstoxPomclass.NewstoxHome;
import NewstoxPomclass.NewstoxPasscode;
import NewstoxPomclass.Newstoxlogin;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;


@Listeners(listener.Listener.class)   

public class TestclassNeostox  extends NeoSBase{
	
	Newstoxlogin login;
	NewstoxPasscode pass;
	NewstoxHome home;   
	 
@BeforeClass
public void lunchBrowser() throws IOException
 
{
	LounchNeoStox();
	login=new Newstoxlogin(driver);
	pass=new NewstoxPasscode(driver);
	home=new NewstoxHome(driver);
}	
	  
@BeforeMethod
public void loginttoneostox() throws InterruptedException, IOException 
{
		login.enteruserID();
		login.sighninNewstox();	
		Reporter.log("login successfull dan",true); 
		Thread.sleep(1000);
		
		pass.Enterpass();
		pass.EnterSubmit();
		Reporter.log("Submitpasscode sucessfully",true);
		NeowsUtilty.wait1(driver,6000); 
		
		home.closepoup(driver); 
		NeowsUtilty.wait1(driver,2000);
		
		
	  
}


  @Test 
  public void validateuserID() throws EncryptedDocumentException, IOException 
  {
	  
	  Assert.assertEquals(home.getActualuserId(driver),NeowsUtilty.readDataFromPropertyFile("userId"),"Actual and expected userid is not same Tc failed");
	  NeowsUtilty.wait1(driver, 4000);
	  
	  home.myfund(); 
	  
	  NeowsUtilty.wait1(driver,1000);
  }
  
  @Test
  public void validatefund() throws IOException  
  {
	 Assert.assertEquals(home.fundase(),NeowsUtilty.readDataFromPropertyFile("fund"),"acual fund and expected fund is not matching Tc failed"); 
	  
  }
  
  

  @AfterMethod
  public void logoutfromstox()
  {
	  home.Enterlogout();
	  
	  NeowsUtilty.wait1(driver,2000);
  }
  
  
  
@AfterClass
public void closebrowser()
{
	driver.close(); 
	

}
 

}
