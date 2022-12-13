package listener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import NeoStoxUtility.NeowsUtilty;
import NeostoxBase.NeoSBase;

public class Listener extends NeoSBase implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("TC" +result.getName()+" is completed successfuly",true);

		 try {
			NeowsUtilty.Takescreenshot(driver,result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		Reporter.log("Tc"+result.getName()+"is skipped",true);
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("Tc"+result.getName()+"is failed",true);
		
		try {
			NeowsUtilty.Takescreenshot(driver,result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	

	
	
	
}
