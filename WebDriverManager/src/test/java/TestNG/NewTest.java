package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {


	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Welcome");
	}

	@Test
	public void Registration() {

		System.out.println("User Registration");
	}

	@Test
	public void AddName() {
		System.out.println("User Name");
	}

	@Test
	public void AddAge() {

		System.out.println("User Age");
	}

	@Test
	public void AddAddress() {

		System.out.println("User Address");
	}



	@Test(priority=1)
	public void AddPhone() {

		System.out.println("User Phone No");
	}


	@AfterMethod
	public void afterMethod() {
		System.out.println("By");
	}

}
