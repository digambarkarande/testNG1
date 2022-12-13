package NeoStoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class NeowsUtilty {
	


	public static void Takescreenshot(WebDriver driver,String name) throws IOException
	{
		 File srs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File dest=new File("C:\\Users\\ADMIN\\libs\\sourceFile\\"+name+".jpg");
		 
		 FileHandler.copy(srs, dest);	
	}
	
	public static void ScrollingView(WebDriver driver,WebElement Elements)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",Elements);
		
	}
	
	public static void wait1(WebDriver driver,int wait)
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(wait));
		
		
	}
	
	public static String Readexcelsheet(int Row,int Cell) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\Users\\ADMIN\\libs\\UPSTOK.xlsx");
		
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
	 String value = sheet.getRow(Row).getCell(Cell).getStringCellValue();
	return value;
		
		
	}
	
	public static String  readDataFromPropertyFile(String key) throws IOException
	{
		//creat object of property 
		
		Properties prop=new Properties();
		
		//creat fileinpute
		
		FileInputStream myfile=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\testNG1\\myproperty.properties");
		
		prop.load(myfile);
		
		 String value = prop.getProperty(key);
		 
		 Reporter.log("reading values  "+key+"  from property file",true);
		return value;
		 
		 
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
