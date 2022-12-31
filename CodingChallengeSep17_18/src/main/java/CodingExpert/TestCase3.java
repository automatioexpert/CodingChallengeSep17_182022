package CodingExpert;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestCase3 {

	@Test
	public void login() {
		System.out.println("Executing login test");
		Assert.fail("Login not successful");
	}

	@Test(dependsOnMethods = { "login"})
	public void composeEmail() {

		System.out.println("Executing composeEmail test");

	}

	@AfterMethod
	public void sendEmail() {
		System.out.println("Sending Thank You Email to God!!");
	}

}
