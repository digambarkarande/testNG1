package NeostoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import NeoStoxUtility.NeowsUtilty;

public class NeoSBase {
  
	
	protected static WebDriver driver ;
	
  public void LounchNeoStox() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\libs\\chromedriver_win32\\chromedriver.exe");
	  
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("---incognito");
	   driver=new ChromeDriver(option);
	   
	   driver.manage().window().maximize();
	   
	   driver.get(NeowsUtilty.readDataFromPropertyFile("url"));
	   
	   Reporter.log("NeoStox is launched sucsessfull",true);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
  }
}
