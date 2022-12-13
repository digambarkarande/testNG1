package NewstoxExcelsheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewstoxTestclas { 

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\libs\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://neostox.com/");
		
		Thread.sleep(1000);
		
		File myfile=new File("C:\\Users\\ADMIN\\libs\\UPSTOK.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		String mon1 = mysheet.getRow(1).getCell(0).getStringCellValue();
		String passcode1 = mysheet.getRow(1).getCell(0).getStringCellValue();
		
		//we gwt login to newstox
		
		Newstoxlogin loginN=new Newstoxlogin(driver);
		loginN.enteruserID( mysheet.getRow(1).getCell(0).getStringCellValue());
		loginN.sighninNewstox();
		
		//we get passcode
		
		Thread.sleep(4000);
		
		NewstoxPasscode pass=new NewstoxPasscode(driver);
		
		pass.Enterpass( mysheet.getRow(1).getCell(1).getStringCellValue());
		pass.EnterSubmit();
		
		//we validate userid 
		
		Thread.sleep(2000);
		
		NewstoxHome home=new NewstoxHome(driver);
		home.validateuserid( driver,mysheet.getRow(1).getCell(2).getStringCellValue());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
