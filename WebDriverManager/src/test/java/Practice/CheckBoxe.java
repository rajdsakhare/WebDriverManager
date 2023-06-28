package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxe {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//WebElement ele=driver.findElement(By.xpath("//input[@id='monday']"));
		//ele.click();
		//System.out.println(ele.isSelected());
		
		List<WebElement> ele2=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		System.out.println(ele2.size());
		
		for(WebElement day:ele2) {
			day.click();
			System.out.println(day.isSelected());
			
			
			
			
		}
			

	}

}
