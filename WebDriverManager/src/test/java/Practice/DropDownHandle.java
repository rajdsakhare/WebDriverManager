package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DropDownHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();							
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		List<WebElement> ele=driver.findElements(By.xpath("//select[starts-with(@id,'CompanyCountry')]//option"));
		
	
		for(WebElement drpele:ele) {
			if(drpele.getText().equals("Algeria")) {
				
				drpele.click();
				break;
			}
		}
		
		List<WebElement> ele1=driver.findElements(By.xpath("//select[starts-with(@id,'CompanyEmployees')]//option"));
		
		for(WebElement drpele1:ele1) {
			if(drpele1.getText().equals("501 - 2000 employees")) {
				drpele1.click();
				break;
			}
		}

		List<WebElement> ele2=driver.findElements(By.xpath("//select[starts-with(@id,'UserTitle')]//option"));
		
		for(WebElement drpele2: ele2) {
			if(drpele2.getText().equals("Customer Service Manager")) {
		drpele2.click();
		break;
	}}
		/*WebElement ele2=driver.findElement(By.xpath("//select[@name='UserTitle']"));
		//ele2.click();
		
		Select s= new Select(ele2);
		
		s.selectByVisibleText("Customer Service Manager");*/
		

	}

}
