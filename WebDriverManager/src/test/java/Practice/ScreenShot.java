package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//Full Page
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		
//		File dst=new File("C:\\Users\\Vikas\\OneDrive\\Desktop\\Resumes\\ss.jpg");
//		FileUtils.copyFile(src,dst);
//		
		//Specific To webelement
		WebElement x=driver.findElement(By.xpath("//div[text()='Textarea practice']"));
		File src=x.getScreenshotAs(OutputType.FILE);
		
		File dst=new File("C:\\Users\\Vikas\\OneDrive\\Desktop\\Resumes\\web.jpg");
		FileUtils.copyFile(src,dst);
		
		driver.close();
		

	}

}
