package NewstoxPomclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewstoxTestclas {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\libs\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://neostox.com/");
		
		Thread.sleep(1000); 
		
		//we gwt login to newstox
		
		Newstoxlogin loginN=new Newstoxlogin(driver);
		loginN.enteruserID();
		loginN.sighninNewstox();
		
		//we get passcode
		
		Thread.sleep(4000);
		
		NewstoxPasscode pass=new NewstoxPasscode(driver);
		
		pass.Enterpass();
		pass.EnterSubmit();
		
		//we validate userid 
		
		Thread.sleep(2000);
		
		NewstoxHome home=new NewstoxHome(driver);
		home.validateuserid();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
