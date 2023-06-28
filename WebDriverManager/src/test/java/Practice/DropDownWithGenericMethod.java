package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DropDownWithGenericMethod {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();							
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		WebElement jobT=driver.findElement(By.xpath("//select[starts-with(@id,'UserTitle')]"));
		selectOptFromDropDown(jobT,"Customer Service Manager");
		
		WebElement emp=driver.findElement(By.xpath("//select[starts-with(@id,'CompanyEmployees')]"));
		selectOptFromDropDown(emp,"501 - 2000 employees");
		
		WebElement country=driver.findElement(By.xpath("//select[starts-with(@id,'CompanyCountry')]"));
		selectOptFromDropDown(country,"Algeria");
		
	}
		public static void selectOptFromDropDown(WebElement ele, String Value)
		{
			Select drp=new Select(ele);
			List<WebElement> allopt=drp.getOptions();
			
			for(WebElement opt: allopt) {
				if(opt.getText().equals(Value)) 
				{
					opt.click();
					break;
				}
		
			}
		}
}

