package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) {
		
			
			WebDriverManager.chromedriver().setup();
					
					WebDriver driver= new ChromeDriver();
					
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
					
					driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
					driver.switchTo().frame("iframeResult");
					WebElement ele=driver.findElement(By.xpath("//input[@id='field1']"));
					ele.clear();
					ele.sendKeys("Hello");
					
					WebElement copy=driver.findElement(By.xpath("//button[text()='Copy Text']"));
					
					Actions act=new Actions(driver);
					
					act.doubleClick(copy).perform();
					
					//driver.close();

	}

}
/*driver.get("https://www.amazon.in/");

		// screenshot
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Redmi");

		driver.findElement(By.xpath("//*[@type='submit']")).click();

		TakesScreenshot src = (TakesScreenshot) driver;

		File screenshot = src.getScreenshotAs(OutputType.FILE);
//		File ss1 = src.getScreenshotAs(OutputType.FILE);

		// File dest=new File("D:\\Screenshot\\defectpage2.jpg");
		File dest = new File("D:\\Screenshot\\atul.jpg");

		FileUtils.copyFile(screenshot, dest);

		System.out.println("completed");
	}*/
