package Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement ele=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions ac= new Actions(driver);
		
		ac.contextClick(ele).perform();
		
		 driver.findElement(By.xpath("//span[text()='Copy']")).click();
		 
		 Alert alert=driver.switchTo().alert();
		 alert.accept();
		 


	}

}
