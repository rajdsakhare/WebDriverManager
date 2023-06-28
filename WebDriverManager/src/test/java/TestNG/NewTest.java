package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {


	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Welcome BM");
	}

	@Test(priority=3)
	public void Registration() {

		System.out.println("User Registration");
	}

	@Test(priority=2)
	public void AddName() {
		System.out.println("User Name");
	}

	@Test(priority=1)
	public void AddAge() {

		System.out.println("User Age");
	}

	@Test(priority=4)
	public void AddAddress() {

		System.out.println("User Address");
	}



	@Test(priority=5)
	public void AddPhone() {

		System.out.println("User Phone No");
	}


	@AfterMethod
	public void afterMethod() {
		System.out.println("By AM");
	}

}
