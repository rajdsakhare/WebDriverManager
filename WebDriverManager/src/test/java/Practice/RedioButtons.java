package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedioButtons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		WebElement female=driver.findElement(By.xpath("//input[@id='female']"));
		female.click();
		
		WebElement male=driver.findElement(By.xpath("//input[@id='male']"));
		
		WebElement other=driver.findElement(By.xpath("//input[@id='male']"));
		
		System.out.println(female.isSelected());
		System.out.println(male.isSelected());
		System.out.println(other.isSelected());
		
	}

}
